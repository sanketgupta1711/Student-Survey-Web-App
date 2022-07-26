import { EventEmitter, Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EventForRecordService {

  public emitter: EventEmitter<any | null>;

  constructor() {
    this.emitter = new EventEmitter<any>(null);
  }
  
  broadcastMessage(message: any): void {
    this.emitter.emit(message);
  }
}
