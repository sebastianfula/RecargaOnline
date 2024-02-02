import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddRechargeComponentComponent } from './add-recharge-component.component';

describe('AddRechargeComponentComponent', () => {
  let component: AddRechargeComponentComponent;
  let fixture: ComponentFixture<AddRechargeComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddRechargeComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddRechargeComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
