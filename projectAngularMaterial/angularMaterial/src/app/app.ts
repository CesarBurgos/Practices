import { Component, signal } from '@angular/core';
import { RouterOutlet, RouterLink, RouterLinkActive, Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { ClientesService } from './services/clientes-service';
import { MatToolbarModule, MatToolbar } from '@angular/material/toolbar';
import { MatButtonModule, MatButton } from '@angular/material/button';
import { MatGridList, MatGridTile } from '@angular/material/grid-list'; // Asegúrate de que la ruta a tu servicio sea correcta

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    RouterLink,
    RouterLinkActive,
    CommonModule,
    MatToolbar,
    MatButton
    // Requerido para usar *ngIf en el HTML
  ],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  protected readonly title = signal('ula-pedidos-admin');

  // Hacemos el servicio público para que la plantilla HTML pueda acceder a él directamente
  constructor(
    public authService: ClientesService,
    private router: Router,
  ) {}

  onLogout(): void {
    this.authService.logout();
    this.router.navigate(['/app/home']);
  }
}
