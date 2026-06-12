import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClientesComp } from './clientes-comp';

describe('ClientesComp', () => {
  let component: ClientesComp;
  let fixture: ComponentFixture<ClientesComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ClientesComp],
    }).compileComponents();

    fixture = TestBed.createComponent(ClientesComp);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
