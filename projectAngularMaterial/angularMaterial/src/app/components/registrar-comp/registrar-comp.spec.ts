import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarComp } from './registrar-comp';

describe('RegistrarComp', () => {
  let component: RegistrarComp;
  let fixture: ComponentFixture<RegistrarComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RegistrarComp],
    }).compileComponents();

    fixture = TestBed.createComponent(RegistrarComp);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
