import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChequecreditComponent } from './chequecredit.component';

describe('ChequecreditComponent', () => {
  let component: ChequecreditComponent;
  let fixture: ComponentFixture<ChequecreditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChequecreditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChequecreditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
