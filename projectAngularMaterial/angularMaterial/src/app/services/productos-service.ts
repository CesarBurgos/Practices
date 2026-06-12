import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

/*export class ProductoModel{
  nombre: String = "";
  descripcion: String = "";
  precio: number = 0;
  stock: number = 0;
  idCategoria: number = 0;
}

export class ProductoResponse{
  success: boolean = true;
  mensaje: String = "";
  data!:{
    descripcion: String;
    estado: number;
    idCategoria: number;
    idProducto: number;
    nombre: String;
    precio: number;
    stock: number;
  };
}*/

@Injectable({
  providedIn: 'root',
})
export class ProductosService {
  private apiUrl = 'http://localhost:8086/api/productos';

  constructor(private http: HttpClient) {}

  listar(): Observable<any> {
    return this.http.get(this.apiUrl);
  }
  //buscarPorId(id: number): Observable<ProductoModel> { return this.http.get<>(`${this.apiUrl}/${id}`); }
  //guardar(producto: any): Observable<ProductoResponse> { return this.http.post<>(this.apiUrl, producto); }
  buscarPorId(id: number): Observable<any> {
    return this.http.get(`${this.apiUrl}/${id}`);
  }
  guardar(producto: any): Observable<any> {
    return this.http.post(this.apiUrl, producto);
  }
  actualizar(id: number, producto: any): Observable<any> {
    return this.http.put(`${this.apiUrl}/${id}`, producto);
  }
  eliminar(id: number): Observable<any> {
    return this.http.delete(`${this.apiUrl}/${id}`);
  }

  // RF-06: Actualizar stock usando el PatchMapping que recibe un Map<String, Integer>
  actualizarStock(id: number, nuevoStock: number): Observable<any> {
    return this.http.patch(`${this.apiUrl}/${id}/stock`, { stock: nuevoStock });
  }
}
