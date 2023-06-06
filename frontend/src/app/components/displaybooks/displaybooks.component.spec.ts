import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplaybooksComponent } from './displaybooks.component';

describe('DisplaybooksComponent', () => {
  let component: DisplaybooksComponent;
  let fixture: ComponentFixture<DisplaybooksComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DisplaybooksComponent]
    });
    fixture = TestBed.createComponent(DisplaybooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
