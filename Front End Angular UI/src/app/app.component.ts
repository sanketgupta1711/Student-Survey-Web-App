import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  showStudentSurveyForm = false;
  showAcknowledgement = true;
  errorMessage = false;

  fetchedRecord:any ={};

  displaySurveyForm(){
    this.showStudentSurveyForm = true;
    this.showAcknowledgement = false;
    this.errorMessage = false;
  }

  displayAcknowledgement(){
    this.showStudentSurveyForm = false;
    this.showAcknowledgement = true;
    this.errorMessage = false;
  }

  displayError(){
    this.showStudentSurveyForm = false;
    this.showAcknowledgement = false;
    this.errorMessage = true;
  }

  displayPageOnEvent(pageName: any){
    console.log(pageName)
     if(pageName == 'acknowledgement'){
      this.displayAcknowledgement();
     }else if(pageName == 'errorMessage'){
       this.displayError();
     }else{
      this.displaySurveyForm();
      this.fetchedRecord = pageName;
     }
  }

}


