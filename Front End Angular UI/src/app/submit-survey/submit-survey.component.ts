import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import {DataServiceService} from '../data-service.service';
import { EventForRecordService } from '../event-for-record.service';

@Component({
  selector: 'app-submit-survey',
  templateUrl: './submit-survey.component.html',
  styleUrls: ['./submit-survey.component.css']
})
export class SubmitSurveyComponent implements OnInit {

  private readonly _eventService: EventForRecordService;
  message:any ={};

  @Input() fetchedRecord:any;

  selectedArray: string[];

  submitData:any ={};

  constructor(private dataService: DataServiceService, private eventService: EventForRecordService) { 
    this._eventService = eventService;
    this._eventService.emitter.subscribe( message => this.message = message);
    console.log(this.message);
    if(this.message != null){
      this.submitData = this.message;
    }    
    console.log(this.fetchedRecord);    
  }

  

  radioButtonSelectedValue: string;

  ngOnInit(): void {
    window.scrollTo(0, 0);
  }

  @Output() displayPageName = new EventEmitter<String>();


  recommendationDropDown = ['Very Likely', 'Likely', 'Unlikely'];

  options = [
    {name:'Students', value:'1', checked:false},
    {name:'Location', value:'2', checked:false},
    {name:'Campus', value:'3', checked:false},
    {name:'Atmosphere', value:'4', checked:false},
    {name:'Dorm Rooms', value:'5', checked:false},
    {name:' Sports', value:'6', checked:false}
  ]

  radioOptions = [
    {name:'Friends', value:'1', selected:false},
    {name:'Television', value:'2', selected:false},
    {name:'Internet', value:'3', selected:false},
    {name:'Other', value:'4', selected:false}
  ]

  onItemChange(value){
    console.log(" Value is : ", value );
    this.radioButtonSelectedValue = value;
 }

  getSelectedOptions() { 
    this.selectedArray = this.options
              .filter(opt => opt.checked)
              .map(opt => opt.name)
    return this.selectedArray.toString();
  }

  getRadioButtonSelection() { 
    return this.radioOptions
    .filter(opt => opt.selected)
    .map(opt => opt.name)
  }

  displayPage(pageName: String){
    console.log(pageName);
     this.displayPageName.emit(pageName);
  }

  onSubmit(){
    this.submitData.likes = this.getSelectedOptions();
    this.submitData.interest = this.getRadioButtonSelection().toString();
    this.dataService.addSurveyRecord(this.submitData).subscribe(
      (result) => {
        console.log(result)}
    );
    this.dataService.getSurveyRecords().subscribe(data => {
      this.fetchedRecord = data;
    });
    // console.log("Somewhere its going");
    this.displayPageName.emit("acknowledgement");
  }

  onCancel(){
    this.displayPageName.emit("acknowledgement");
  }

}
