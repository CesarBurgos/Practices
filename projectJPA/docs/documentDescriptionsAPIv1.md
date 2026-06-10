| Documentación online | https://documenter.getpostman.com/view/55125712/2sBXwsKpVF

| Property | Value |
| --- | --- |
| info | _object_ |
| item | _complex array_ |

### info
| Property | Value |
| --- | --- |
| _collection_link | https://ed-cesar-burgos-8898624.postman.co/workspace/539ac8c5-2dfc-48ce-b645-719c6e96cb4f/collection/55125712-f020d23d-e19e-42f6-9c98-becb7374db66?action=share&source=collection_link&creator=55125712 |
| _exporter_id | 55125712 |
| _postman_id | f020d23d-e19e-42f6-9c98-becb7374db66 |
| description | Documentación de los Endpoints hechos con la API con SpringBoot y JPA |
| name | EndpointsProjectJPA |
| schema | https://schema.getpostman.com/json/collection/v2.1.0/collection.json |

### item
| # | description| item| name|
| --- | --- | --- | --- |
| 1 | Endpoints acerca de la categorias de productos | _complex_ | Categorias |
| 2 | Endpoints acerca de la información de los clientes | _complex_ | Cliente |
| 3 | Endpoints acerca de los pedidos realizados | _complex_ | Pedido |
| 4 | Endpoints acerca de los productos | _complex_ | Producto |
| 5 | Endpoints acerca del reporte de ventas | _complex_ | Reporte |

#### item[0]
| Property | Value |
| --- | --- |
| description | Endpoints acerca de la categorias de productos |
| item | _complex array_ |
| name | Categorias |

##### item[0].item
| # | name| request| response|
| --- | --- | --- | --- |
| 1 | Listar | _complex_ | _complex_ |
| 2 | BuscarPorID | _complex_ | _complex_ |
| 3 | Guardar | _complex_ | _complex_ |
| 4 | Actualizar | _complex_ | _complex_ |
| 5 | Eliminar | _complex_ | _complex_ |

###### item[0].item[0]
| Property | Value |
| --- | --- |
| name | Listar |
| request | _object_ |
| response | _complex array_ |

####### item[0].item[0].request
| Property | Value |
| --- | --- |
| description | Método que retorna el listado de categorias |
| header | [] |
| method | GET |
| url | _object_ |

######## item[0].item[0].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, categorias] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/categorias |

####### item[0].item[0].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Categoria registrada correctamente",<br>    "data": [<br>        {<br>            "idCategoria": 1,<br>            "nombre": "Tacos",<br>            "descripcion": "Tacos de mariscos",<br>            "estado": 1<br>        },<br>        {<br>            "idCategoria": 2,<br>            "nombre": "Bebidas",<br>            "descripcion": "Bebidas preparadas",<br>            "estado": 1<br>        }<br>    ]<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[0].item[0].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Categoria registrada correctamente",<br>    "data": [<br>        {<br>            "idCategoria": 1,<br>            "nombre": "Tacos",<br>            "descripcion": "Tacos de mariscos",<br>            "estado": 1<br>        },<br>        {<br>            "idCategoria": 2,<br>            "nombre": "Bebidas",<br>            "descripcion": "Bebidas preparadas",<br>            "estado": 1<br>        }<br>    ]<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[0].item[0].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 19:18:11 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[0].item[0].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

########## item[0].item[0].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, categorias] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/categorias |

###### item[0].item[1]
| Property | Value |
| --- | --- |
| name | BuscarPorID |
| request | _object_ |
| response | _complex array_ |

####### item[0].item[1].request
| Property | Value |
| --- | --- |
| description | Método que retorna la categoria proporcionada por su ID |
| header | [] |
| method | GET |
| url | _object_ |

######## item[0].item[1].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, categorias, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/categorias/1 |

####### item[0].item[1].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Categoria registrada correctamente",<br>    "data": {<br>        "idCategoria": 1,<br>        "nombre": "Tacos",<br>        "descripcion": "Tacos de mariscos",<br>        "estado": 1<br>    }<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[0].item[1].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Categoria registrada correctamente",<br>    "data": {<br>        "idCategoria": 1,<br>        "nombre": "Tacos",<br>        "descripcion": "Tacos de mariscos",<br>        "estado": 1<br>    }<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[0].item[1].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 19:20:25 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[0].item[1].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

########## item[0].item[1].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, categorias, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/categorias/1 |

###### item[0].item[2]
| Property | Value |
| --- | --- |
| name | Guardar |
| request | _object_ |
| response | _complex array_ |

####### item[0].item[2].request
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | POST |
| url | _object_ |

######## item[0].item[2].request.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "nombre": "Nueva Categoria",
<br>  "descripcion": "Creando nueva categoria",
<br>  "estado": 1
<br>} |

######### item[0].item[2].request.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

########## item[0].item[2].request.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

######## item[0].item[2].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, categorias] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/categorias |

####### item[0].item[2].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Categoria registrada correctamente",<br>    "data": {<br>        "idCategoria": 4,<br>        "nombre": "Nueva Categoria",<br>        "descripcion": "Creando nueva categoria",<br>        "estado": 1<br>    }<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[0].item[2].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Categoria registrada correctamente",<br>    "data": {<br>        "idCategoria": 4,<br>        "nombre": "Nueva Categoria",<br>        "descripcion": "Creando nueva categoria",<br>        "estado": 1<br>    }<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[0].item[2].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 19:44:33 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[0].item[2].response[0].originalRequest
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | POST |
| url | _object_ |

########## item[0].item[2].response[0].originalRequest.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "nombre": "Nueva Categoria",
<br>  "descripcion": "Creando nueva categoria",
<br>  "estado": 1
<br>} |

########### item[0].item[2].response[0].originalRequest.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

############ item[0].item[2].response[0].originalRequest.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

########## item[0].item[2].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, categorias] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/categorias |

###### item[0].item[3]
| Property | Value |
| --- | --- |
| name | Actualizar |
| request | _object_ |
| response | _complex array_ |

####### item[0].item[3].request
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | PUT |
| url | _object_ |

######## item[0].item[3].request.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "nombre": "CategoriaEditada",
<br>  "descripcion": "EditandoCategoria",
<br>  "estado": 0
<br>} |

######### item[0].item[3].request.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

########## item[0].item[3].request.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

######## item[0].item[3].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, categorias, 3] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/categorias/3 |

####### item[0].item[3].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Categoria actualizada correctamente",<br>    "data": {<br>        "idCategoria": 3,<br>        "nombre": "CategoriaEditada",<br>        "descripcion": "EditandoCategoria",<br>        "estado": 1<br>    }<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[0].item[3].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Categoria actualizada correctamente",<br>    "data": {<br>        "idCategoria": 3,<br>        "nombre": "CategoriaEditada",<br>        "descripcion": "EditandoCategoria",<br>        "estado": 1<br>    }<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[0].item[3].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 19:48:06 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[0].item[3].response[0].originalRequest
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | PUT |
| url | _object_ |

########## item[0].item[3].response[0].originalRequest.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "nombre": "CategoriaEditada",
<br>  "descripcion": "EditandoCategoria",
<br>  "estado": 0
<br>} |

########### item[0].item[3].response[0].originalRequest.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

############ item[0].item[3].response[0].originalRequest.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

########## item[0].item[3].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, categorias, 3] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/categorias/3 |

###### item[0].item[4]
| Property | Value |
| --- | --- |
| name | Eliminar |
| request | _object_ |
| response | _complex array_ |

####### item[0].item[4].request
| Property | Value |
| --- | --- |
| header | [] |
| method | DELETE |
| url | _object_ |

######## item[0].item[4].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, categorias, 4] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/categorias/4 |

####### item[0].item[4].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Categoria eliminada correctamente",<br>    "data": null<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[0].item[4].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Categoria eliminada correctamente",<br>    "data": null<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[0].item[4].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 19:49:55 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[0].item[4].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | DELETE |
| url | _object_ |

########## item[0].item[4].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, categorias, 4] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/categorias/4 |

#### item[1]
| Property | Value |
| --- | --- |
| description | Endpoints acerca de la información de los clientes |
| item | _complex array_ |
| name | Cliente |

##### item[1].item
| # | name| request| response|
| --- | --- | --- | --- |
| 1 | Listar | _complex_ | _complex_ |
| 2 | buscarPorID | _complex_ | _complex_ |
| 3 | Guardar | _complex_ | _complex_ |
| 4 | Actualizar | _complex_ | _complex_ |
| 5 | Eliminar | _complex_ | _complex_ |

###### item[1].item[0]
| Property | Value |
| --- | --- |
| name | Listar |
| request | _object_ |
| response | _complex array_ |

####### item[1].item[0].request
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

######## item[1].item[0].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, clientes] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/clientes |

####### item[1].item[0].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "idCliente": 1,<br>            "nombre": "Carlos",<br>            "apellido": "Sanchez",<br>            "telefono": "4731305687",<br>            "correo": "admin@ulamariscos.com",<br>            "estado": 1,<br>            "fechaRegistro": "2026-06-09T15:12:26.129518"<br>        },<br>        {<br>            "idCliente": 2,<br>            "nombre": "Uriel",<br>            "apellido": "Gonzalez",<br>            "telefono": "5531305687",<br>            "correo": "uriel@ulamariscos.com",<br>            "estado": 1,<br>            "fechaRegistro": "2026-06-09T15:12:26.159601"<br>        }<br>    ]<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[1].item[0].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "idCliente": 1,<br>            "nombre": "Carlos",<br>            "apellido": "Sanchez",<br>            "telefono": "4731305687",<br>            "correo": "admin@ulamariscos.com",<br>            "estado": 1,<br>            "fechaRegistro": "2026-06-09T15:12:26.129518"<br>        },<br>        {<br>            "idCliente": 2,<br>            "nombre": "Uriel",<br>            "apellido": "Gonzalez",<br>            "telefono": "5531305687",<br>            "correo": "uriel@ulamariscos.com",<br>            "estado": 1,<br>            "fechaRegistro": "2026-06-09T15:12:26.159601"<br>        }<br>    ]<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[1].item[0].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 19:52:57 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[1].item[0].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

########## item[1].item[0].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, clientes] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/clientes |

###### item[1].item[1]
| Property | Value |
| --- | --- |
| name | buscarPorID |
| request | _object_ |
| response | _complex array_ |

####### item[1].item[1].request
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

######## item[1].item[1].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, clientes, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/clientes/1 |

####### item[1].item[1].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": {<br>        "idCliente": 1,<br>        "nombre": "Carlos",<br>        "apellido": "Sanchez",<br>        "telefono": "4731305687",<br>        "correo": "admin@ulamariscos.com",<br>        "estado": 1,<br>        "fechaRegistro": "2026-06-09T15:12:26.129518"<br>    }<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[1].item[1].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": {<br>        "idCliente": 1,<br>        "nombre": "Carlos",<br>        "apellido": "Sanchez",<br>        "telefono": "4731305687",<br>        "correo": "admin@ulamariscos.com",<br>        "estado": 1,<br>        "fechaRegistro": "2026-06-09T15:12:26.129518"<br>    }<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[1].item[1].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 19:54:15 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[1].item[1].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

########## item[1].item[1].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, clientes, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/clientes/1 |

###### item[1].item[2]
| Property | Value |
| --- | --- |
| name | Guardar |
| request | _object_ |
| response | _complex array_ |

####### item[1].item[2].request
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | POST |
| url | _object_ |

######## item[1].item[2].request.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "nombre": "Usuario Prueba1",
<br>  "apellido": "Apellido Tester",
<br>  "telefono": "747112345",
<br>  "correo": "correo@tester.com",
<br>  "fechaRegistro": "2026-06-10T19:55:18.838Z"
<br>} |

######### item[1].item[2].request.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

########## item[1].item[2].request.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

######## item[1].item[2].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, clientes] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/clientes |

####### item[1].item[2].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Cliente registrado correctamente",<br>    "data": {<br>        "idCliente": 3,<br>        "nombre": "Usuario Prueba1",<br>        "apellido": "Apellido Tester",<br>        "telefono": "747112345",<br>        "correo": "correo@tester.com",<br>        "estado": 1,<br>        "fechaRegistro": "2026-06-10T19:55:18.838"<br>    }<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[1].item[2].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Cliente registrado correctamente",<br>    "data": {<br>        "idCliente": 3,<br>        "nombre": "Usuario Prueba1",<br>        "apellido": "Apellido Tester",<br>        "telefono": "747112345",<br>        "correo": "correo@tester.com",<br>        "estado": 1,<br>        "fechaRegistro": "2026-06-10T19:55:18.838"<br>    }<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[1].item[2].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:00:14 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[1].item[2].response[0].originalRequest
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | POST |
| url | _object_ |

########## item[1].item[2].response[0].originalRequest.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "nombre": "Usuario Prueba1",
<br>  "apellido": "Apellido Tester",
<br>  "telefono": "747112345",
<br>  "correo": "correo@tester.com",
<br>  "fechaRegistro": "2026-06-10T19:55:18.838Z"
<br>} |

########### item[1].item[2].response[0].originalRequest.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

############ item[1].item[2].response[0].originalRequest.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

########## item[1].item[2].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, clientes] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/clientes |

###### item[1].item[3]
| Property | Value |
| --- | --- |
| name | Actualizar |
| request | _object_ |
| response | _complex array_ |

####### item[1].item[3].request
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | PUT |
| url | _object_ |

######## item[1].item[3].request.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "nombre": "Usuario Prueba1 Modificado",
<br>  "apellido": "Apellido Tester Modificado",
<br>  "telefono": "74710000",
<br>  "correo": "correoModificado@tester.com",
<br>  "fechaRegistro": "2026-06-10T20:01:23.655Z"
<br>} |

######### item[1].item[3].request.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

########## item[1].item[3].request.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

######## item[1].item[3].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, clientes, 3] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/clientes/3 |

####### item[1].item[3].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Cliente actualizado correctamente",<br>    "data": {<br>        "idCliente": 3,<br>        "nombre": "Usuario Prueba1 Modificado",<br>        "apellido": "Apellido Tester Modificado",<br>        "telefono": "74710000",<br>        "correo": "correoModificado@tester.com",<br>        "estado": 1,<br>        "fechaRegistro": "2026-06-10T19:55:18.838"<br>    }<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[1].item[3].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Cliente actualizado correctamente",<br>    "data": {<br>        "idCliente": 3,<br>        "nombre": "Usuario Prueba1 Modificado",<br>        "apellido": "Apellido Tester Modificado",<br>        "telefono": "74710000",<br>        "correo": "correoModificado@tester.com",<br>        "estado": 1,<br>        "fechaRegistro": "2026-06-10T19:55:18.838"<br>    }<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[1].item[3].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:02:39 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[1].item[3].response[0].originalRequest
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | PUT |
| url | _object_ |

########## item[1].item[3].response[0].originalRequest.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "nombre": "Usuario Prueba1 Modificado",
<br>  "apellido": "Apellido Tester Modificado",
<br>  "telefono": "74710000",
<br>  "correo": "correoModificado@tester.com",
<br>  "fechaRegistro": "2026-06-10T20:01:23.655Z"
<br>} |

########### item[1].item[3].response[0].originalRequest.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

############ item[1].item[3].response[0].originalRequest.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

########## item[1].item[3].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, clientes, 3] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/clientes/3 |

###### item[1].item[4]
| Property | Value |
| --- | --- |
| name | Eliminar |
| request | _object_ |
| response | _complex array_ |

####### item[1].item[4].request
| Property | Value |
| --- | --- |
| header | [] |
| method | DELETE |
| url | _object_ |

######## item[1].item[4].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, clientes, 3] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/clientes/3 |

####### item[1].item[4].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Cliente eliminado correctamente",<br>    "data": null<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[1].item[4].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Cliente eliminado correctamente",<br>    "data": null<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[1].item[4].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:03:12 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[1].item[4].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | DELETE |
| url | _object_ |

########## item[1].item[4].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, clientes, 3] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/clientes/3 |

#### item[2]
| Property | Value |
| --- | --- |
| description | Endpoints acerca de los pedidos realizados |
| item | _complex array_ |
| name | Pedido |

##### item[2].item
| # | name| request| response|
| --- | --- | --- | --- |
| 1 | GenerarPedido | _complex_ | _complex_ |
| 2 | ListadoPedidos | _complex_ | _complex_ |
| 3 | ListadoPedidosPorCliente | _complex_ | _complex_ |
| 4 | ListadoPedidosPorEstado | _complex_ | _complex_ |
| 5 | CancelarPedido | _complex_ | _complex_ |

###### item[2].item[0]
| Property | Value |
| --- | --- |
| name | GenerarPedido |
| request | _object_ |
| response | _complex array_ |

####### item[2].item[0].request
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | POST |
| url | _object_ |

######## item[2].item[0].request.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "idCliente": 1,
<br>  "productos": [
<br>    {
<br>      "idProducto": 1,
<br>      "cantidad": 2
<br>    }
<br>  ]
<br>} |

######### item[2].item[0].request.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

########## item[2].item[0].request.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

######## item[2].item[0].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, pedidos, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/pedidos/1 |

####### item[2].item[0].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Pedido generado correctamente",<br>    "data": {<br>        "idPedido": 1,<br>        "cliente": {<br>            "idCliente": 1,<br>            "nombre": "Carlos",<br>            "apellido": "Sanchez",<br>            "telefono": "4731305687",<br>            "correo": "admin@ulamariscos.com",<br>            "estado": 1,<br>            "fechaRegistro": "2026-06-09T15:12:26.129518"<br>        },<br>        "fechaPedido": "2026-06-10T14:06:28.9300822",<br>        "total": 190,<br>        "estadoPedido": "GENERADO",<br>        "estado": 1,<br>        "fechaCancelacion": null,<br>        "detalles": null<br>    }<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[2].item[0].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Pedido generado correctamente",<br>    "data": {<br>        "idPedido": 1,<br>        "cliente": {<br>            "idCliente": 1,<br>            "nombre": "Carlos",<br>            "apellido": "Sanchez",<br>            "telefono": "4731305687",<br>            "correo": "admin@ulamariscos.com",<br>            "estado": 1,<br>            "fechaRegistro": "2026-06-09T15:12:26.129518"<br>        },<br>        "fechaPedido": "2026-06-10T14:06:28.9300822",<br>        "total": 190,<br>        "estadoPedido": "GENERADO",<br>        "estado": 1,<br>        "fechaCancelacion": null,<br>        "detalles": null<br>    }<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[2].item[0].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:06:29 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[2].item[0].response[0].originalRequest
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | POST |
| url | _object_ |

########## item[2].item[0].response[0].originalRequest.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "idCliente": 1,
<br>  "productos": [
<br>    {
<br>      "idProducto": 1,
<br>      "cantidad": 2
<br>    }
<br>  ]
<br>} |

########### item[2].item[0].response[0].originalRequest.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

############ item[2].item[0].response[0].originalRequest.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

########## item[2].item[0].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, pedidos, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/pedidos/1 |

###### item[2].item[1]
| Property | Value |
| --- | --- |
| name | ListadoPedidos |
| request | _object_ |
| response | _complex array_ |

####### item[2].item[1].request
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

######## item[2].item[1].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, pedidos] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/pedidos |

####### item[2].item[1].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "idPedido": 1,<br>            "idCLiente": 1,<br>            "fechaPedido": "2026-06-10T14:06:28.930082",<br>            "total": 190,<br>            "estadoPedido": "GENERADO",<br>            "estado": 1,<br>            "detalles": [<br>                {<br>                    "idDetalle": 1,<br>                    "idProducto": 1,<br>                    "nombreProducto": "Taco Gobernador",<br>                    "cantidad": 2,<br>                    "precioUnitario": 95,<br>                    "subtotal": 190<br>                }<br>            ]<br>        }<br>    ]<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[2].item[1].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "idPedido": 1,<br>            "idCLiente": 1,<br>            "fechaPedido": "2026-06-10T14:06:28.930082",<br>            "total": 190,<br>            "estadoPedido": "GENERADO",<br>            "estado": 1,<br>            "detalles": [<br>                {<br>                    "idDetalle": 1,<br>                    "idProducto": 1,<br>                    "nombreProducto": "Taco Gobernador",<br>                    "cantidad": 2,<br>                    "precioUnitario": 95,<br>                    "subtotal": 190<br>                }<br>            ]<br>        }<br>    ]<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[2].item[1].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:07:22 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[2].item[1].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

########## item[2].item[1].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, pedidos] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/pedidos |

###### item[2].item[2]
| Property | Value |
| --- | --- |
| name | ListadoPedidosPorCliente |
| request | _object_ |
| response | _complex array_ |

####### item[2].item[2].request
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

######## item[2].item[2].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, pedidos, cliente, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/pedidos/cliente/1 |

####### item[2].item[2].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "idPedido": 1,<br>            "idCLiente": null,<br>            "fechaPedido": "2026-06-10T14:06:28.930082",<br>            "total": 190,<br>            "estadoPedido": "GENERADO",<br>            "estado": null,<br>            "detalles": [<br>                {<br>                    "idDetalle": 1,<br>                    "idProducto": 1,<br>                    "nombreProducto": "Taco Gobernador",<br>                    "cantidad": 2,<br>                    "precioUnitario": 95,<br>                    "subtotal": 190<br>                }<br>            ]<br>        }<br>    ]<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[2].item[2].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "idPedido": 1,<br>            "idCLiente": null,<br>            "fechaPedido": "2026-06-10T14:06:28.930082",<br>            "total": 190,<br>            "estadoPedido": "GENERADO",<br>            "estado": null,<br>            "detalles": [<br>                {<br>                    "idDetalle": 1,<br>                    "idProducto": 1,<br>                    "nombreProducto": "Taco Gobernador",<br>                    "cantidad": 2,<br>                    "precioUnitario": 95,<br>                    "subtotal": 190<br>                }<br>            ]<br>        }<br>    ]<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[2].item[2].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:08:55 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[2].item[2].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

########## item[2].item[2].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, pedidos, cliente, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/pedidos/cliente/1 |

###### item[2].item[3]
| Property | Value |
| --- | --- |
| name | ListadoPedidosPorEstado |
| request | _object_ |
| response | _complex array_ |

####### item[2].item[3].request
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

######## item[2].item[3].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, pedidos, estado, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/pedidos/estado/1 |

####### item[2].item[3].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "idPedido": 1,<br>            "idCLiente": 1,<br>            "fechaPedido": "2026-06-10T14:06:28.930082",<br>            "total": 190,<br>            "estadoPedido": "GENERADO",<br>            "estado": 1,<br>            "detalles": [<br>                {<br>                    "idDetalle": 1,<br>                    "idProducto": 1,<br>                    "nombreProducto": "Taco Gobernador",<br>                    "cantidad": 2,<br>                    "precioUnitario": 95,<br>                    "subtotal": 190<br>                }<br>            ]<br>        }<br>    ]<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[2].item[3].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "idPedido": 1,<br>            "idCLiente": 1,<br>            "fechaPedido": "2026-06-10T14:06:28.930082",<br>            "total": 190,<br>            "estadoPedido": "GENERADO",<br>            "estado": 1,<br>            "detalles": [<br>                {<br>                    "idDetalle": 1,<br>                    "idProducto": 1,<br>                    "nombreProducto": "Taco Gobernador",<br>                    "cantidad": 2,<br>                    "precioUnitario": 95,<br>                    "subtotal": 190<br>                }<br>            ]<br>        }<br>    ]<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[2].item[3].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:11:02 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[2].item[3].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

########## item[2].item[3].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, pedidos, estado, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/pedidos/estado/1 |

###### item[2].item[4]
| Property | Value |
| --- | --- |
| name | CancelarPedido |
| request | _object_ |
| response | _complex array_ |

####### item[2].item[4].request
| Property | Value |
| --- | --- |
| header | [] |
| method | DELETE |
| url | _object_ |

######## item[2].item[4].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, pedidos, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/pedidos/1 |

####### item[2].item[4].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Pedido cancelado correctamente",<br>    "data": null<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[2].item[4].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Pedido cancelado correctamente",<br>    "data": null<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[2].item[4].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:11:37 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[2].item[4].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | DELETE |
| url | _object_ |

########## item[2].item[4].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, pedidos, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/pedidos/1 |

#### item[3]
| Property | Value |
| --- | --- |
| description | Endpoints acerca de los productos |
| item | _complex array_ |
| name | Producto |

##### item[3].item
| # | name| request| response|
| --- | --- | --- | --- |
| 1 | Listado | _complex_ | _complex_ |
| 2 | BuscarPorID | _complex_ | _complex_ |
| 3 | Guardar | _complex_ | _complex_ |
| 4 | Actualizar | _complex_ | _complex_ |
| 5 | ActualizarStock | _complex_ | _complex_ |
| 6 | Eliminar | _complex_ | _complex_ |

###### item[3].item[0]
| Property | Value |
| --- | --- |
| name | Listado |
| request | _object_ |
| response | _complex array_ |

####### item[3].item[0].request
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

######## item[3].item[0].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos |

####### item[3].item[0].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "idProducto": 1,<br>            "nombre": "Taco Gobernador",<br>            "descripcion": "Taco de camarón",<br>            "precio": 95,<br>            "stock": 50,<br>            "urlImagen": "https://i.blogs.es/ba0112/tacos-gobernador/650_1200.jpg",<br>            "estado": 1,<br>            "categoria": {<br>                "idCategoria": 1,<br>                "nombre": "Tacos",<br>                "descripcion": "Tacos de mariscos",<br>                "estado": 1<br>            }<br>        },<br>        {<br>            "idProducto": 2,<br>            "nombre": "Agua de Horchata",<br>            "descripcion": "Bebida natural",<br>            "precio": 35,<br>            "stock": 100,<br>            "urlImagen": "https://media.gq.com.mx/photos/673208b90bd4a888d68a1092/1:1/w_2000,h_2000,c_limit/Horchata.jpg",<br>            "estado": 1,<br>            "categoria": {<br>                "idCategoria": 2,<br>                "nombre": "Bebidas",<br>                "descripcion": "Bebidas preparadas",<br>                "estado": 1<br>            }<br>        }<br>    ]<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[3].item[0].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "idProducto": 1,<br>            "nombre": "Taco Gobernador",<br>            "descripcion": "Taco de camarón",<br>            "precio": 95,<br>            "stock": 50,<br>            "urlImagen": "https://i.blogs.es/ba0112/tacos-gobernador/650_1200.jpg",<br>            "estado": 1,<br>            "categoria": {<br>                "idCategoria": 1,<br>                "nombre": "Tacos",<br>                "descripcion": "Tacos de mariscos",<br>                "estado": 1<br>            }<br>        },<br>        {<br>            "idProducto": 2,<br>            "nombre": "Agua de Horchata",<br>            "descripcion": "Bebida natural",<br>            "precio": 35,<br>            "stock": 100,<br>            "urlImagen": "https://media.gq.com.mx/photos/673208b90bd4a888d68a1092/1:1/w_2000,h_2000,c_limit/Horchata.jpg",<br>            "estado": 1,<br>            "categoria": {<br>                "idCategoria": 2,<br>                "nombre": "Bebidas",<br>                "descripcion": "Bebidas preparadas",<br>                "estado": 1<br>            }<br>        }<br>    ]<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[3].item[0].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:13:07 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[3].item[0].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

########## item[3].item[0].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos |

###### item[3].item[1]
| Property | Value |
| --- | --- |
| name | BuscarPorID |
| request | _object_ |
| response | _complex array_ |

####### item[3].item[1].request
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

######## item[3].item[1].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos/1 |

####### item[3].item[1].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": {<br>        "idProducto": 1,<br>        "nombre": "Taco Gobernador",<br>        "descripcion": "Taco de camarón",<br>        "precio": 95,<br>        "stock": 50,<br>        "urlImagen": "https://i.blogs.es/ba0112/tacos-gobernador/650_1200.jpg",<br>        "estado": 1,<br>        "categoria": {<br>            "idCategoria": 1,<br>            "nombre": "Tacos",<br>            "descripcion": "Tacos de mariscos",<br>            "estado": 1<br>        }<br>    }<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[3].item[1].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": {<br>        "idProducto": 1,<br>        "nombre": "Taco Gobernador",<br>        "descripcion": "Taco de camarón",<br>        "precio": 95,<br>        "stock": 50,<br>        "urlImagen": "https://i.blogs.es/ba0112/tacos-gobernador/650_1200.jpg",<br>        "estado": 1,<br>        "categoria": {<br>            "idCategoria": 1,<br>            "nombre": "Tacos",<br>            "descripcion": "Tacos de mariscos",<br>            "estado": 1<br>        }<br>    }<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[3].item[1].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:13:52 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[3].item[1].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

########## item[3].item[1].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos, 1] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos/1 |

###### item[3].item[2]
| Property | Value |
| --- | --- |
| name | Guardar |
| request | _object_ |
| response | _complex array_ |

####### item[3].item[2].request
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | POST |
| url | _object_ |

######## item[3].item[2].request.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "nombre": "ProductoPrueba",
<br>  "descripcion": "Descripción del producto de prueba",
<br>  "precio": 100.00,
<br>  "stock": 24,
<br>  "urlImagen": "",
<br>  "estado": 1,
<br>  "categoria": {
<br>    "idCategoria": 1
<br>  }
<br>} |

######### item[3].item[2].request.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

########## item[3].item[2].request.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

######## item[3].item[2].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos |

####### item[3].item[2].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Producto registrado correctamente",<br>    "data": {<br>        "idProducto": 3,<br>        "nombre": "ProductoPrueba",<br>        "descripcion": "Descripción del producto de prueba",<br>        "precio": 100,<br>        "stock": 24,<br>        "urlImagen": "",<br>        "estado": 1,<br>        "categoria": {<br>            "idCategoria": 1,<br>            "nombre": null,<br>            "descripcion": null,<br>            "estado": null<br>        }<br>    }<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[3].item[2].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Producto registrado correctamente",<br>    "data": {<br>        "idProducto": 3,<br>        "nombre": "ProductoPrueba",<br>        "descripcion": "Descripción del producto de prueba",<br>        "precio": 100,<br>        "stock": 24,<br>        "urlImagen": "",<br>        "estado": 1,<br>        "categoria": {<br>            "idCategoria": 1,<br>            "nombre": null,<br>            "descripcion": null,<br>            "estado": null<br>        }<br>    }<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[3].item[2].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:16:36 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[3].item[2].response[0].originalRequest
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | POST |
| url | _object_ |

########## item[3].item[2].response[0].originalRequest.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "nombre": "ProductoPrueba",
<br>  "descripcion": "Descripción del producto de prueba",
<br>  "precio": 100.00,
<br>  "stock": 24,
<br>  "urlImagen": "",
<br>  "estado": 1,
<br>  "categoria": {
<br>    "idCategoria": 1
<br>  }
<br>} |

########### item[3].item[2].response[0].originalRequest.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

############ item[3].item[2].response[0].originalRequest.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

########## item[3].item[2].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos |

###### item[3].item[3]
| Property | Value |
| --- | --- |
| name | Actualizar |
| request | _object_ |
| response | _complex array_ |

####### item[3].item[3].request
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | PUT |
| url | _object_ |

######## item[3].item[3].request.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw |  |

######### item[3].item[3].request.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

########## item[3].item[3].request.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

######## item[3].item[3].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos, 3] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos/3 |

####### item[3].item[3].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Producto actualizado correctamente",<br>    "data": {<br>        "idProducto": 3,<br>        "nombre": "ProductoModificado",<br>        "descripcion": "Descripción modificado y categoria",<br>        "precio": 200,<br>        "stock": 2,<br>        "urlImagen": "",<br>        "estado": 1,<br>        "categoria": {<br>            "idCategoria": 2,<br>            "nombre": null,<br>            "descripcion": null,<br>            "estado": null<br>        }<br>    }<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[3].item[3].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Producto actualizado correctamente",<br>    "data": {<br>        "idProducto": 3,<br>        "nombre": "ProductoModificado",<br>        "descripcion": "Descripción modificado y categoria",<br>        "precio": 200,<br>        "stock": 2,<br>        "urlImagen": "",<br>        "estado": 1,<br>        "categoria": {<br>            "idCategoria": 2,<br>            "nombre": null,<br>            "descripcion": null,<br>            "estado": null<br>        }<br>    }<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[3].item[3].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:19:54 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[3].item[3].response[0].originalRequest
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | PUT |
| url | _object_ |

########## item[3].item[3].response[0].originalRequest.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>  "nombre": "ProductoModificado",
<br>  "descripcion": "Descripción modificado y categoria",
<br>  "precio": 200.00,
<br>  "stock": 2,
<br>  "urlImagen": "",
<br>  "estado": 1,
<br>  "categoria": {
<br>    "idCategoria": 2
<br>  }
<br>} |

########### item[3].item[3].response[0].originalRequest.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

############ item[3].item[3].response[0].originalRequest.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

########## item[3].item[3].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos, 3] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos/3 |

###### item[3].item[4]
| Property | Value |
| --- | --- |
| name | ActualizarStock |
| request | _object_ |
| response | _complex array_ |

####### item[3].item[4].request
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | PUT |
| url | _object_ |

######## item[3].item[4].request.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>    "stock": 500
<br>} |

######### item[3].item[4].request.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

########## item[3].item[4].request.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

######## item[3].item[4].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos, 3, stock] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos/3/stock |

####### item[3].item[4].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Stock actualizado correctamente",<br>    "data": {<br>        "idProducto": 3,<br>        "nombre": "ProductoModificado",<br>        "descripcion": "Descripción modificado y categoria",<br>        "precio": 200,<br>        "stock": 500,<br>        "urlImagen": null,<br>        "estado": 1,<br>        "categoria": {<br>            "idCategoria": 2,<br>            "nombre": "Bebidas",<br>            "descripcion": "Bebidas preparadas",<br>            "estado": 1<br>        }<br>    }<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[3].item[4].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Stock actualizado correctamente",<br>    "data": {<br>        "idProducto": 3,<br>        "nombre": "ProductoModificado",<br>        "descripcion": "Descripción modificado y categoria",<br>        "precio": 200,<br>        "stock": 500,<br>        "urlImagen": null,<br>        "estado": 1,<br>        "categoria": {<br>            "idCategoria": 2,<br>            "nombre": "Bebidas",<br>            "descripcion": "Bebidas preparadas",<br>            "estado": 1<br>        }<br>    }<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[3].item[4].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:22:29 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[3].item[4].response[0].originalRequest
| Property | Value |
| --- | --- |
| body | _object_ |
| header | [] |
| method | PUT |
| url | _object_ |

########## item[3].item[4].response[0].originalRequest.body
| Property | Value |
| --- | --- |
| mode | raw |
| options | _object_ |
| raw | {
<br>    "stock": 500
<br>} |

########### item[3].item[4].response[0].originalRequest.body.options
| Property | Value |
| --- | --- |
| raw | _object_ |

############ item[3].item[4].response[0].originalRequest.body.options.raw
| Property | Value |
| --- | --- |
| language | json |

########## item[3].item[4].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos, 3, stock] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos/3/stock |

###### item[3].item[5]
| Property | Value |
| --- | --- |
| name | Eliminar |
| request | _object_ |
| response | _complex array_ |

####### item[3].item[5].request
| Property | Value |
| --- | --- |
| header | [] |
| method | DELETE |
| url | _object_ |

######## item[3].item[5].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos, 3] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos/3 |

####### item[3].item[5].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Producto eliminado correctamente",<br>    "data": null<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[3].item[5].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Producto eliminado correctamente",<br>    "data": null<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[3].item[5].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:23:32 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[3].item[5].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | DELETE |
| url | _object_ |

########## item[3].item[5].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, productos, 3] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/productos/3 |

#### item[4]
| Property | Value |
| --- | --- |
| description | Endpoints acerca del reporte de ventas |
| item | _complex array_ |
| name | Reporte |

##### item[4].item
| # | name| request| response|
| --- | --- | --- | --- |
| 1 | MasVendidos | _complex_ | _complex_ |

###### item[4].item[0]
| Property | Value |
| --- | --- |
| name | MasVendidos |
| request | _object_ |
| response | _complex array_ |

####### item[4].item[0].request
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

######## item[4].item[0].request.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, reportes, top-vendidos] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/reportes/top-vendidos |

####### item[4].item[0].response
| # | _postman_previewlanguage| body| code| cookie| header| name| originalRequest| status|
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | json | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "nombreProducto": "Taco Gobernador",<br>            "totalVendido": 2<br>        }<br>    ]<br>} | 200 | [] | _complex_ | ejemplo | _complex_ | OK |

######## item[4].item[0].response[0]
| Property | Value |
| --- | --- |
| _postman_previewlanguage | json |
| body | {<br>    "success": true,<br>    "mensaje": "Consulta exitosa",<br>    "data": [<br>        {<br>            "nombreProducto": "Taco Gobernador",<br>            "totalVendido": 2<br>        }<br>    ]<br>} |
| code | 200 |
| cookie | [] |
| header | _complex array_ |
| name | ejemplo |
| originalRequest | _object_ |
| status | OK |

######### item[4].item[0].response[0].header
| # | key| value|
| --- | --- | --- |
| 1 | Vary | Origin |
| 2 | Vary | Access-Control-Request-Method |
| 3 | Vary | Access-Control-Request-Headers |
| 4 | Content-Type | application/json |
| 5 | Transfer-Encoding | chunked |
| 6 | Date | Wed, 10 Jun 2026 20:24:23 GMT |
| 7 | Keep-Alive | timeout=60 |
| 8 | Connection | keep-alive |

######### item[4].item[0].response[0].originalRequest
| Property | Value |
| --- | --- |
| header | [] |
| method | GET |
| url | _object_ |

########## item[4].item[0].response[0].originalRequest.url
| Property | Value |
| --- | --- |
| host | [localhost] |
| path | [api, reportes, top-vendidos] |
| port | 8086 |
| protocol | http |
| raw | http://localhost:8086/api/reportes/top-vendidos |