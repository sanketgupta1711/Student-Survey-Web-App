import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
//import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//import { SurveyFormsListComponent } from './survey-forms-list/survey-forms-list.component';
import { HttpClientModule }    from '@angular/common/http';
import { SubmitSurveyComponent } from './submit-survey/submit-survey.component';
import { AcknowledgementComponent } from './acknowledgement/acknowledgement.component';
import { ErrorMessageComponent } from './error-message/error-message.component';
//import { HomepageComponent } from './homepage/homepage.component';

@NgModule({
  declarations: [
    AppComponent,
    //SurveyFormsListComponent,
    SubmitSurveyComponent,
    AcknowledgementComponent,
    ErrorMessageComponent,
    //HomepageComponent
  ],
  imports: [
    BrowserModule, 
    FormsModule,
    //AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
