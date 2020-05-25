import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChequedebitComponent } from './chequedebit.component';

describe('ChequedebitComponent', () => {
  let component: ChequedebitComponent;
  let fixture: ComponentFixture<ChequedebitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChequedebitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChequedebitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
