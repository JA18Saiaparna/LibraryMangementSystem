import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletebyidComponent } from './deletebyid.component';

describe('DeletebyidComponent', () => {
  let component: DeletebyidComponent;
  let fixture: ComponentFixture<DeletebyidComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletebyidComponent]
    });
    fixture = TestBed.createComponent(DeletebyidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
