import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetTeamsOfIndiaComponent } from './get-teams-of-india.component';

describe('GetTeamsOfIndiaComponent', () => {
  let component: GetTeamsOfIndiaComponent;
  let fixture: ComponentFixture<GetTeamsOfIndiaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetTeamsOfIndiaComponent]
    });
    fixture = TestBed.createComponent(GetTeamsOfIndiaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
