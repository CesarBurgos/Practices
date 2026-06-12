import { ChangeDetectorRef, Component, inject, OnInit, PLATFORM_ID } from '@angular/core';
import { CommonModule, isPlatformBrowser } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ClientesService } from '../../services/clientes-service';
import Swal from 'sweetalert2';

// Material
import { MatCard, MatCardContent, MatCardModule }       from '@angular/material/card';
import { MatCell,
  MatCellDef, MatColumnDef, MatHeaderCell, MatHeaderCellDef, MatHeaderRow, MatHeaderRowDef,
  MatNoDataRow, MatRow, MatRowDef, MatTable, MatTableModule }      from '@angular/material/table';
import { MatButton, MatButtonModule, MatIconButton }     from '@angular/material/button';
import { MatIcon, MatIconModule }       from '@angular/material/icon';
import { MatFormField, MatFormFieldModule, MatLabel }  from '@angular/material/form-field';
import { MatInput, MatInputModule }      from '@angular/material/input';
import { MatChip, MatChipsModule }      from '@angular/material/chips';
import { MatTooltip, MatTooltipModule }    from '@angular/material/tooltip';
import { MatDialogModule, MatDialog, MatDialogContent, MatDialogTitle, MatDialogActions, MatDialogClose } from '@angular/material/dialog';

@Component({
  selector: 'app-clientes-comp',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    MatIcon,
    MatFormField,
    MatLabel,
    MatCard,
    MatCardContent,
    MatChip,
    MatTable,
    MatColumnDef,
    MatInput,
    MatIconButton,
    MatTooltip,
    MatHeaderCell,
    MatCell,
    MatHeaderRow,
    MatRow,
    MatButton,
    MatDialogContent,
    MatDialogTitle,
    MatDialogActions,
    MatDialogClose,
    MatHeaderCellDef,
    MatCellDef,
    MatNoDataRow,
    MatHeaderRowDef,
    MatRowDef,
  ],
  templateUrl: './clientes-comp.html',
})
export class ClientesComp implements OnInit {
  private platformId = inject(PLATFORM_ID);
  private cdr = inject(ChangeDetectorRef);

  clientes: any[] = [];
  busquedaId: number | null = null;
  clienteSeleccionado: any = null;
  columnas = ['idCliente', 'nombre', 'telefono', 'correo', 'fechaRegistro', 'acciones'];

  constructor(private clientesService: ClientesService) {}

  ngOnInit(): void {
    if (isPlatformBrowser(this.platformId)) {
      this.cargarTodos();
    }
  }

  cargarTodos(): void {
    this.clientesService.listarClientes().subscribe({
      next: (res: any) => {
        this.clientes = res.data;
        this.cdr.detectChanges(); // Forzamos renderizado inmediato de la tabla
      },
      error: () => console.error('Error al cargar la lista de clientes'),
    });
  }

  buscarPorId(): void {
    if (!this.busquedaId) {
      this.cargarTodos();
      return;
    }

    this.clientesService.listarClientes().subscribe({
      next: (res: any) => {
        const encontrado = res.data.find((c: any) => c.idCliente === this.busquedaId);
        if (encontrado) {
          this.clientes = [encontrado];
        } else {
          Swal.fire('No encontrado', 'No hay ningún cliente con ese ID', 'info');
        }
        this.cdr.detectChanges(); // Renderizado inmediato del filtro
      },
      error: () => console.error('Error durante la búsqueda de cliente'),
    });
  }

  activarEdicion(cliente: any): void {
    this.clienteSeleccionado = { ...cliente };
    this.cdr.detectChanges();
  }

  guardarCambios(): void {
    this.clientesService.registrarCliente(this.clienteSeleccionado).subscribe({
      next: (res: any) => {
        Swal.fire('Actualizado', 'Datos modificados correctamente', 'success');
        this.clienteSeleccionado = null;
        this.cargarTodos();
      },
      error: () => Swal.fire('Error', 'No se pudieron guardar los cambios del cliente', 'error'),
    });
  }

  // --- NUEVA FUNCIÓN: ELIMINAR CLIENTE DEFINITIVO (RF-10) ---
  eliminarCliente(id: number): void {
    Swal.fire({
      title: '¿Eliminar cliente permanentemente?',
      text: 'Esta acción ejecutará un borrado físico en la base de datos.',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#d33',
      confirmButtonText: 'Sí, eliminar',
      cancelButtonText: 'Cancelar',
    }).then((result) => {
      if (result.isConfirmed) {
        // Asumiendo que tu ClientesService tiene el método .eliminar(id) apuntando al @DeleteMapping
        this.clientesService.eliminarPedidoDefinitivo(id).subscribe({
          next: (res: any) => {
            Swal.fire('Eliminado', 'El cliente ha sido borrado del sistema.', 'success');
            this.cargarTodos(); // Recarga la lista y aplica el detectChanges() automáticamente
          },
          error: () =>
            Swal.fire(
              'Error',
              'No se pudo eliminar el cliente. Verifique si tiene pedidos asociados.',
              'error',
            ),
        });
      }
    });
  }
}
