import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductosComp } from './productos-comp';

describe('ProductosComp', () => {
  let component: ProductosComp;
  let fixture: ComponentFixture<ProductosComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductosComp],
    }).compileComponents();

    fixture = TestBed.createComponent(ProductosComp);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
