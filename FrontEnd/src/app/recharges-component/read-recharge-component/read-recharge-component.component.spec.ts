import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadRechargeComponentComponent } from './read-recharge-component.component';

describe('ReadRechargeComponentComponent', () => {
  let component: ReadRechargeComponentComponent;
  let fixture: ComponentFixture<ReadRechargeComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadRechargeComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ReadRechargeComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
