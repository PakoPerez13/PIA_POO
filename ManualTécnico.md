## Producto Integrador de Aprendizaje - POO
#### Integrantes del equipo: 
###### - Pérez Garza Francisco Alejandro 1896612
###### - Santillán Cedillo Enrique 1971970


------------

### Clases:

#### CajeroBol

  - IniciarPedido: Se encarga de capturar una serie de datos que serán registrados en un archivo.
  - ReiniciarPedido: Limpia la informacion registrada en el archivo creado si es que lo hay.
  - MenuCajeroBol: Establece un menú para seleccionar las distintas funciones de la clase. 
  - TerminarPedido: Calcula los datos del pedido y manda el total de ganancias.

------------

#### CajeroDul

  - IniciarPedido: Se encarga de capturar una serie de datos que serán registrados en un archivo.
  - ReiniciarPedido: Limpia la informacion registrada en el archivo creado si es que lo hay.
  - MenuCajeroDul: Establece un menú para seleccionar las distintas funciones de la clase. 
  - TerminarPedido: Calcula los datos del pedido y manda el total de ganancias.
  
------------

#### Comida

  - getTipo: Obtiene el valor de la variable de un objeto.
  - setTipo: Declara el valor de la variable de un objeto.
  - getGasto: Obtiene el valor de la variable de un objeto.
  - setGasto: Declara el valor de la variable de un objeto.

------------

#### Empleado

  - getTipo: Obtiene el valor de la variable de un objeto.
  - setTipo: Declara el valor de la variable de un objeto.
  - getNombre: Obtiene el valor de la variable de un objeto.
  - setNombre: Declara el valor de la variable de un objeto.
  - getContraseña: Obtiene el valor de la variable de un objeto.
  - setContraseña: Declara el valor de la variable de un objeto.
  - getSueldo: Obtiene el valor de la variable de un objeto.
  - setSueldo: Declara el valor de la variable de un objeto.

------------

#### Funcionalidades

  - CrearArchivoEmpleados: Se crea el archivo inicial de empleados de manera que el programa no se inicie con datos vacios, sino, con unos ya preestablecidos.
  - CrearArchivoGanancias: Se crea el archivo inicial de ganancias.
  - CrearArchivoPagos: Se crea el archivo inicial de pagos.
  - AñadirPa: Se usa para añadir la suma de un producto declarado al valor de los pagos.
  - AñadirGa: Se usa para añadir la suma de una compra realizada a las ganancias.
  - MostrarMovimientosMonetarios: Permite ver todas las ganacias o pagos que se han añadido a lo largo del programa.
  - CrearArchivoPeliculas: Se crea el archivo inicial de peliculas.
  - CrearArchivoBoletos: Se crea un archivo para los productos de las funciones disonibles.
  - AgregarEmpleados: Captura los datos de los empleados (nombre, tipo, sueldo y contraseña).
  - AgregarPelicula: Captura los datos de las peliculas (nombre, tipo, tiempo, sala y precio).
  - AgregarDulceria: Captura los datos de los productos que se deseen comprar (nombre, tipo y precio).
  - AgregarBoleto: Captura los datos de los boletos de peliculas que se deseen comprar (nombre, cantidad y total a pagar).
  - CrearArchivoDulceria: Se crea el archivo inicial de dulceria, donde se guardaran los productos vendidosy sus datos.
  - MostrarEmpleados: Muestra el contenido de la lista de empleados.
  - MostrarDulceria: Muestra el contenido de la lista de dulceria.
  - MostrarPeliculas: Muestra el contenido de la lista de peliculas.
  - MostrarBoletos: Muestra el contenido de la lista de boletos.
  - DeclararGanancias: Declara las ganancias de manera manual en caso de que sea necesario actualizarlas.
  - DeclararPagos: Declara los pagos que solo usa el gerente en su respectivo menú.
  - DeclararGerente: Obtiene los datos de Gerente para luego declararlos en el archivero de empledos.
  - DeclararCajeroBol: Obtiene los datos de CajeroBol para luego declararlos en el archivero de empleados.
  - DeclararCajeroDul: Obtiene los datos de CajeroDul para luego declararlos en el archivero de empleados.

------------

#### Gerente

  - VerMovimientos: Muestra los movimientos monetarios registrados.
  - Visualizacion: Sirve para ver el personal registrado según su tipo.
  - AccederMenus: Permite acceder al menú de boletos o dulceria.
  - DeclaracionDinero: Permite actualizar los pagos o ingresos de los movimientos monetarios.
  - Dulceria: Permite añadir otra comida para comprar.
  - Cartelera: Permite agregar otra película para ver.

------------

#### Main

  Es la clase que da funcionalidad al programa.

------------

#### Menus

  - MenuGerente: Crea un menú permitiendo navegar en las opciones disponibles del mismo.
  - MenuCajeroBol: Crea un menú permitiendo navegar en las opciones disponibles del mismo.
  - MenuCajeroDul: Crea un menú permitiendo navegar en las opciones disponibles del mismo.

------------

#### MovimientosMonetarios

  - getGanancias: Obtiene el valor de la variable de un objeto.
  - setGanancias: Declara el valor de la variable de un objeto.
  - getPagos: Obtiene el valor de la variable de un objeto.
  - setPagos: Declara el valor de la variable de un objeto.
  - getTotal: Obtiene el valor de la variable de un objeto.
  - setTotal: Declara el valor de la variable de un objeto.

------------

#### Pelicula

  - Gasto: Permite registrar los gastos.
  - getTiempo: Obtiene el valor de la variable de un objeto.
  - setTiempo: Declara el valor de la variable de un objeto.
  - getSala: Obtiene el valor de la variable de un objeto.
  - setSala: Declara el valor de la variable de un objeto.
  - getAsiento: Obtiene el valor de la variable de un objeto.
  - setAsiento: Declara el valor de la variable de un objeto.

------------

#### Producto

  - getTipo: Obtiene el valor de la variable de un objeto.
  - setTipo: Declara el valor de la variable de un objeto.
  - getCantidad: Obtiene el valor de la variable de un objeto.
  - setCantidad: Declara el valor de la variable de un objeto.
  - getNombre: Obtiene el valor de la variable de un objeto.
  - setNombre: Declara el valor de la variable de un objeto.
  - getPrecio: Obtiene el valor de la variable de un objeto.
  - setPrecio: Declara el valor de la variable de un objeto.

------------
