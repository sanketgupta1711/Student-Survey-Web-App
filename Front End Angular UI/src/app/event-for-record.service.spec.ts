import { TestBed } from '@angular/core/testing';

import { EventForRecordService } from './event-for-record.service';

describe('EventForRecordService', () => {
  let service: EventForRecordService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EventForRecordService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
