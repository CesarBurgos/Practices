import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoriasComp } from './categorias-comp';

describe('CategoriasComp', () => {
  let component: CategoriasComp;
  let fixture: ComponentFixture<CategoriasComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CategoriasComp],
    }).compileComponents();

    fixture = TestBed.createComponent(CategoriasComp);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
