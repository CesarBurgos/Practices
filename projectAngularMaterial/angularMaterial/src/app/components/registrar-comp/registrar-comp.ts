import { ChangeDetectorRef, Component, inject, OnInit, PLATFORM_ID } from '@angular/core';
import { CommonModule, isPlatformBrowser } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ClientesService } from '../../services/clientes-service';
import { Router, RouterLink } from '@angular/router';
import Swal from 'sweetalert2';

import { MatCard, MatCardContent, MatCardHeader, MatCardModule, MatCardSubtitle, MatCardTitle } from '@angular/material/card';
import { MatFormField, MatFormFieldModule, MatLabel } from '@angular/material/form-field';
import { MatInput, MatInputModule } from '@angular/material/input';
import { MatButton, MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-registrar-comp',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    RouterLink,
    MatCard,
    MatCardHeader,
    MatCardTitle,
    MatCardSubtitle,
    MatCardContent,
    MatFormField,
    MatLabel,
    MatInput,
    MatButton,
  ],
  templateUrl: './registrar-comp.html',
})
export class RegistrarComp implements OnInit {
  private platformId = inject(PLATFORM_ID);
  private cdr = inject(ChangeDetectorRef);
  private clientesService = inject(ClientesService);
  private router = inject(Router);

  // Estructura limpia para el DTO que espera tu backend de Spring Boot
  clienteForm = {
    nombre: '',
    apellido: '',
    telefono: '',
    correo: '',
  };

  ngOnInit(): void {
    // Redirigir al dashboard si ya está logeado (Protección básica en cliente)
    if (isPlatformBrowser(this.platformId)) {
      if (this.clientesService.isLoggedIn()) {
        this.router.navigate(['/app/dashboard']);
      }
    }
  }

  onRegister(): void {
    // Validar que los campos no estén vacíos
    if (!this.clienteForm.nombre || !this.clienteForm.correo) {
      Swal.fire('Campos incompletos', 'Por favor llena los campos obligatorios.', 'warning');
      return;
    }

    this.clientesService.registrarCliente(this.clienteForm).subscribe({
      next: (res: any) => {
        Swal.fire({
          title: '¡Registro Exitoso! 🎉',
          text: 'Tu cuenta en ULA Mariscos ha sido creada. Ahora puedes iniciar sesión.',
          icon: 'success',
          confirmButtonText: 'Ir al Login',
        }).then(() => {
          // Redirigimos al Home o Login para que prueben su nueva cuenta
          this.router.navigate(['/app/home']);
        });
      },
      error: (err: any) => {
        console.error(err);
        Swal.fire('Error', 'No se pudo completar el registro. Intenta con otro correo.', 'error');
      },
    });
  }
}
