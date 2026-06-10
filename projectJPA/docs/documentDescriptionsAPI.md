# Project: EndpointsProjectJPA
Documentación de los Endpoints hechos con la API con SpringBoot y JPA
# 📁 Collection: Categorias 
Endpoints acerca de la categorias de productos 


## End-point: Listar
Método que retorna el listado de categorias
### Method: GET
>```
>http://localhost:8086/api/categorias
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Categoria registrada correctamente",
    "data": [
        {
            "idCategoria": 1,
            "nombre": "Tacos",
            "descripcion": "Tacos de mariscos",
            "estado": 1
        },
        {
            "idCategoria": 2,
            "nombre": "Bebidas",
            "descripcion": "Bebidas preparadas",
            "estado": 1
        }
    ]
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: BuscarPorID
Método que retorna la categoria proporcionada por su ID
### Method: GET
>```
>http://localhost:8086/api/categorias/1
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Categoria registrada correctamente",
    "data": {
        "idCategoria": 1,
        "nombre": "Tacos",
        "descripcion": "Tacos de mariscos",
        "estado": 1
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Guardar
### Method: POST
>```
>http://localhost:8086/api/categorias
>```
### Body (**raw**)

```json
{
  "nombre": "Nueva Categoria",
  "descripcion": "Creando nueva categoria",
  "estado": 1
}
```

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Categoria registrada correctamente",
    "data": {
        "idCategoria": 4,
        "nombre": "Nueva Categoria",
        "descripcion": "Creando nueva categoria",
        "estado": 1
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Actualizar
### Method: PUT
>```
>http://localhost:8086/api/categorias/3
>```
### Body (**raw**)

```json
{
  "nombre": "CategoriaEditada",
  "descripcion": "EditandoCategoria",
  "estado": 0
}
```

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Categoria actualizada correctamente",
    "data": {
        "idCategoria": 3,
        "nombre": "CategoriaEditada",
        "descripcion": "EditandoCategoria",
        "estado": 1
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Eliminar
### Method: DELETE
>```
>http://localhost:8086/api/categorias/4
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Categoria eliminada correctamente",
    "data": null
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Cliente 
Endpoints acerca de la información de los clientes 


## End-point: Listar
### Method: GET
>```
>http://localhost:8086/api/clientes
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Consulta exitosa",
    "data": [
        {
            "idCliente": 1,
            "nombre": "Carlos",
            "apellido": "Sanchez",
            "telefono": "4731305687",
            "correo": "admin@ulamariscos.com",
            "estado": 1,
            "fechaRegistro": "2026-06-09T15:12:26.129518"
        },
        {
            "idCliente": 2,
            "nombre": "Uriel",
            "apellido": "Gonzalez",
            "telefono": "5531305687",
            "correo": "uriel@ulamariscos.com",
            "estado": 1,
            "fechaRegistro": "2026-06-09T15:12:26.159601"
        }
    ]
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: buscarPorID
### Method: GET
>```
>http://localhost:8086/api/clientes/1
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Consulta exitosa",
    "data": {
        "idCliente": 1,
        "nombre": "Carlos",
        "apellido": "Sanchez",
        "telefono": "4731305687",
        "correo": "admin@ulamariscos.com",
        "estado": 1,
        "fechaRegistro": "2026-06-09T15:12:26.129518"
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Guardar
### Method: POST
>```
>http://localhost:8086/api/clientes
>```
### Body (**raw**)

```json
{
  "nombre": "Usuario Prueba1",
  "apellido": "Apellido Tester",
  "telefono": "747112345",
  "correo": "correo@tester.com",
  "fechaRegistro": "2026-06-10T19:55:18.838Z"
}
```

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Cliente registrado correctamente",
    "data": {
        "idCliente": 3,
        "nombre": "Usuario Prueba1",
        "apellido": "Apellido Tester",
        "telefono": "747112345",
        "correo": "correo@tester.com",
        "estado": 1,
        "fechaRegistro": "2026-06-10T19:55:18.838"
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Actualizar
### Method: PUT
>```
>http://localhost:8086/api/clientes/3
>```
### Body (**raw**)

```json
{
  "nombre": "Usuario Prueba1 Modificado",
  "apellido": "Apellido Tester Modificado",
  "telefono": "74710000",
  "correo": "correoModificado@tester.com",
  "fechaRegistro": "2026-06-10T20:01:23.655Z"
}
```

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Cliente actualizado correctamente",
    "data": {
        "idCliente": 3,
        "nombre": "Usuario Prueba1 Modificado",
        "apellido": "Apellido Tester Modificado",
        "telefono": "74710000",
        "correo": "correoModificado@tester.com",
        "estado": 1,
        "fechaRegistro": "2026-06-10T19:55:18.838"
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Eliminar
### Method: DELETE
>```
>http://localhost:8086/api/clientes/3
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Cliente eliminado correctamente",
    "data": null
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Pedido 
Endpoints acerca de los pedidos realizados 


## End-point: GenerarPedido
### Method: POST
>```
>http://localhost:8086/api/pedidos/1
>```
### Body (**raw**)

```json
{
  "idCliente": 1,
  "productos": [
    {
      "idProducto": 1,
      "cantidad": 2
    }
  ]
}
```

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Pedido generado correctamente",
    "data": {
        "idPedido": 1,
        "cliente": {
            "idCliente": 1,
            "nombre": "Carlos",
            "apellido": "Sanchez",
            "telefono": "4731305687",
            "correo": "admin@ulamariscos.com",
            "estado": 1,
            "fechaRegistro": "2026-06-09T15:12:26.129518"
        },
        "fechaPedido": "2026-06-10T14:06:28.9300822",
        "total": 190,
        "estadoPedido": "GENERADO",
        "estado": 1,
        "fechaCancelacion": null,
        "detalles": null
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: ListadoPedidos
### Method: GET
>```
>http://localhost:8086/api/pedidos
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Consulta exitosa",
    "data": [
        {
            "idPedido": 1,
            "idCLiente": 1,
            "fechaPedido": "2026-06-10T14:06:28.930082",
            "total": 190,
            "estadoPedido": "GENERADO",
            "estado": 1,
            "detalles": [
                {
                    "idDetalle": 1,
                    "idProducto": 1,
                    "nombreProducto": "Taco Gobernador",
                    "cantidad": 2,
                    "precioUnitario": 95,
                    "subtotal": 190
                }
            ]
        }
    ]
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: ListadoPedidosPorCliente
### Method: GET
>```
>http://localhost:8086/api/pedidos/cliente/1
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Consulta exitosa",
    "data": [
        {
            "idPedido": 1,
            "idCLiente": null,
            "fechaPedido": "2026-06-10T14:06:28.930082",
            "total": 190,
            "estadoPedido": "GENERADO",
            "estado": null,
            "detalles": [
                {
                    "idDetalle": 1,
                    "idProducto": 1,
                    "nombreProducto": "Taco Gobernador",
                    "cantidad": 2,
                    "precioUnitario": 95,
                    "subtotal": 190
                }
            ]
        }
    ]
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: ListadoPedidosPorEstado
### Method: GET
>```
>http://localhost:8086/api/pedidos/estado/1
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Consulta exitosa",
    "data": [
        {
            "idPedido": 1,
            "idCLiente": 1,
            "fechaPedido": "2026-06-10T14:06:28.930082",
            "total": 190,
            "estadoPedido": "GENERADO",
            "estado": 1,
            "detalles": [
                {
                    "idDetalle": 1,
                    "idProducto": 1,
                    "nombreProducto": "Taco Gobernador",
                    "cantidad": 2,
                    "precioUnitario": 95,
                    "subtotal": 190
                }
            ]
        }
    ]
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CancelarPedido
### Method: DELETE
>```
>http://localhost:8086/api/pedidos/1
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Pedido cancelado correctamente",
    "data": null
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Producto 
Endpoints acerca de los productos 


## End-point: Listado
### Method: GET
>```
>http://localhost:8086/api/productos
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Consulta exitosa",
    "data": [
        {
            "idProducto": 1,
            "nombre": "Taco Gobernador",
            "descripcion": "Taco de camarón",
            "precio": 95,
            "stock": 50,
            "urlImagen": "https://i.blogs.es/ba0112/tacos-gobernador/650_1200.jpg",
            "estado": 1,
            "categoria": {
                "idCategoria": 1,
                "nombre": "Tacos",
                "descripcion": "Tacos de mariscos",
                "estado": 1
            }
        },
        {
            "idProducto": 2,
            "nombre": "Agua de Horchata",
            "descripcion": "Bebida natural",
            "precio": 35,
            "stock": 100,
            "urlImagen": "https://media.gq.com.mx/photos/673208b90bd4a888d68a1092/1:1/w_2000,h_2000,c_limit/Horchata.jpg",
            "estado": 1,
            "categoria": {
                "idCategoria": 2,
                "nombre": "Bebidas",
                "descripcion": "Bebidas preparadas",
                "estado": 1
            }
        }
    ]
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: BuscarPorID
### Method: GET
>```
>http://localhost:8086/api/productos/1
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Consulta exitosa",
    "data": {
        "idProducto": 1,
        "nombre": "Taco Gobernador",
        "descripcion": "Taco de camarón",
        "precio": 95,
        "stock": 50,
        "urlImagen": "https://i.blogs.es/ba0112/tacos-gobernador/650_1200.jpg",
        "estado": 1,
        "categoria": {
            "idCategoria": 1,
            "nombre": "Tacos",
            "descripcion": "Tacos de mariscos",
            "estado": 1
        }
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Guardar
### Method: POST
>```
>http://localhost:8086/api/productos
>```
### Body (**raw**)

```json
{
  "nombre": "ProductoPrueba",
  "descripcion": "Descripción del producto de prueba",
  "precio": 100.00,
  "stock": 24,
  "urlImagen": "",
  "estado": 1,
  "categoria": {
    "idCategoria": 1
  }
}
```

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Producto registrado correctamente",
    "data": {
        "idProducto": 3,
        "nombre": "ProductoPrueba",
        "descripcion": "Descripción del producto de prueba",
        "precio": 100,
        "stock": 24,
        "urlImagen": "",
        "estado": 1,
        "categoria": {
            "idCategoria": 1,
            "nombre": null,
            "descripcion": null,
            "estado": null
        }
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Actualizar
### Method: PUT
>```
>http://localhost:8086/api/productos/3
>```
### Body (**raw**)

```json

```

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Producto actualizado correctamente",
    "data": {
        "idProducto": 3,
        "nombre": "ProductoModificado",
        "descripcion": "Descripción modificado y categoria",
        "precio": 200,
        "stock": 2,
        "urlImagen": "",
        "estado": 1,
        "categoria": {
            "idCategoria": 2,
            "nombre": null,
            "descripcion": null,
            "estado": null
        }
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: ActualizarStock
### Method: PUT
>```
>http://localhost:8086/api/productos/3/stock
>```
### Body (**raw**)

```json
{
    "stock": 500
}
```

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Stock actualizado correctamente",
    "data": {
        "idProducto": 3,
        "nombre": "ProductoModificado",
        "descripcion": "Descripción modificado y categoria",
        "precio": 200,
        "stock": 500,
        "urlImagen": null,
        "estado": 1,
        "categoria": {
            "idCategoria": 2,
            "nombre": "Bebidas",
            "descripcion": "Bebidas preparadas",
            "estado": 1
        }
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Eliminar
### Method: DELETE
>```
>http://localhost:8086/api/productos/3
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Producto eliminado correctamente",
    "data": null
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Reporte 
Endpoints acerca del reporte de ventas 


## End-point: MasVendidos
### Method: GET
>```
>http://localhost:8086/api/reportes/top-vendidos
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "Consulta exitosa",
    "data": [
        {
            "nombreProducto": "Taco Gobernador",
            "totalVendido": 2
        }
    ]
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
_________________________________________________
Powered By: [postman-to-markdown](https://github.com/bautistaj/postman-to-markdown/)
