import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, delay, map, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  private surveyServerGetRecordsUrl = 'http://3.235.58.203:30556/webapi/studentSurvey/records';
  private surveyServerAddRecordsUrl = 'http://3.235.58.203:30556/webapi/studentSurvey/surveyEntry';
  

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  getSurveyRecords(): Observable<any>{
    return this.http.get(this.surveyServerGetRecordsUrl)
      .pipe(
          tap(_=>this.log('fetched surveys')),
          catchError(this.handleError<any>('getSurveyRecords', []))
      );
  }

  addSurveyRecord(data): Observable<any>{
    return this.http.post<any>(this.surveyServerAddRecordsUrl,data,this.httpOptions).pipe(
        tap(data => this.log("added record")),
        catchError(this.handleError<any>('addSurveyRecord'))
    );
         
  }

  /** Log a HeroService message with the MessageService */
  private log(message: string) {
    console.log(message);
  }

  /**
   * Handle Http operation that failed.
   * Let the app continue.
   * @param operation - name of the operation that failed
   * @param result - optional value to return as the observable result
   */
  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

}
