import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PedidosComp } from './pedidos-comp';

describe('PedidosComp', () => {
  let component: PedidosComp;
  let fixture: ComponentFixture<PedidosComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PedidosComp],
    }).compileComponents();

    fixture = TestBed.createComponent(PedidosComp);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
