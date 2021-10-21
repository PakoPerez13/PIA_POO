## Producto Integrador de Aprendizaje - POO
#### Integrantes del equipo: 
###### -Pérez Garza Francisco Alejandro 1896612
###### -Santillán Cedillo Enrique 1971970


------------

### **Problemática** 
##### Una empresa rookie de cine desea tener una manera mejor de administrador los roles de los empleados, así como un espacio amigable donde se puede comprar mercancía y boletos, además de verficar las ganancias y los pagos que tiene la empresa.
------------

### Solución Propuesta:
 
##### El equipo se compromete a realizar una interfaz gráfica de apoyo para que la empresa pueda realizar las distintas acciones realacionadas con sus ventas.

------------

### Entidades: 
#### Clases que compondrán la aplicación
Main
Empleado, extendido a las clases Gerente, CajeroDul y CajeroBol 
Menus
Productos, extendido a las clases Pelicula, Comida
MovimientosM

### Atributos: 
#### Contenido que tendrán las entidades, así como las funciones 
#### **Empleado** tiene los siguientes atributos: 
  
  -Tipo // El tipo de empleado que es: Gerente, CajeroDul y CajeroBol
  
  -Nombre // El nombre de la persona
  
  -Constraseña // Llave con la que se le dará acceso al menú según el tipo de empleado que es
  
  -Sueldo // La paga que recibe
  
  -Salir(); // Regresa al menú inicial
  
#### **Gerente** tiene los siguientes atributos:
-Empleado se extenderá a Gerente, así que tendrá sus atributos
  
  -VerMovimiento(); //El Gerente es el único con acceso a la ventana de MovimientosM
  
  -Personal(); //El Gerente puede acceder a un método donde pueda ver a los empleados, modificar sus datos o despedirlos
  
  -AccederMenus(); //Tendrá la posibilidad de acceder a los menús
  
  -HacerPagos(); // Cualquier deuda u operacion que tendría en cuenta
  
  -DardeAltaProducto(); // 
  
  -Cartelera(); // Entrará al menú Cartelera y podrá modificar 
  
#### **CajeroBol** tiene los siguientes atributos: 
  
  -Empleado se extenderá a CajeroBol, así que tendrá sus atributos 
  
  -IniciarPedido(); // Empezará a hacer el proceso de tomar el pedido de la pelicula que se verá, que salas estan disponibles y asientos desea tomar 
  
  -ReiniciarPedido(); //En dado caso de cambiar de opinión o equivocarse, borrará el pedido 
  
  -ModificarPedido(); //En dado caso que quiera modificar sobre la marcha el pedido, aquí se le dará la opción
  
  -MenuCajeroBol(); // Tendrá acceso al menú de las salas, pero sin permisos de modificar
  
  -TerminarPedido(); // Terminará el proceso y mostará un reporte final en la pantalla 
  
#### **CajeroDul** tiene los siguientes atributos: 
  
  -Empleado se extenderá a CajeroBol, así que tendrá sus atributos
  
  -IniciarPedido(); // Empezará a hacer el proceso de tomar el pedido de la pelicula que se verá, que salas estan disponibles y asientos desea tomar
  
  -ReiniciarPedido(); //En dado caso de cambiar de opinión o equivocarse, borrará el pedido
  
  -MenuProductos(); // Tendrá acceso al menú de los producos, pero sin poder modificarlos
  
  -TerminarPedido(); // Terminará el proceso y mostará un reporte final en la pantalla
  
 #### **Menus** tiene los siguientes atributos: 
 
 -MenuGerente(); // Es el menú principal cuando el usario ingresa como gerente
 
 -MenuCajeroBol(); //  Menú donde el Cajero puede interactuar al momento de elegir una película, sala y/o asiento.
 
 -MenuCajeroDul(); // Menú donde el cajero puede ver los productos que se ofrecen e interacuar con ellos, más no modificarlos
 
 -MenuMovimientos(); // Menu donde están los movimientos monetarios, donde se puede mostrar, modificar y revertir.
 
 -MenuProductos(); // Menú de los productos, donde se agregara, eliminará
 o modificará algo.
 
 #### **Producto** tiene los siguientes atributos: 
  
  -Tipo // El tipo de producto: Pelicula o Comida
  
  -Nombre // El nombre que tiene el producto
  
  -Imagen // Una imagen para el apoyo visual
  
  -Precio // Valor monetario (Cuanto cuesta)
  
  -Cantidad // Cantidad de productos que se compraran 
  
   #### **Peliculas** tiene los siguientes atributos: 
  -Producto se extenderá a Peliculas, así que tendrá sus atributos
  
  -Tiempo // Duracion de la película
  
  -Sala// Sala elegida
  
  -Asientos // Asientos elegidos 
  
  -Gasto_Peli // Cuanto cues
  
   #### **Comida** tiene los siguientes atributos: 
   -Producto se extenderá a Comida, así que tendrá sus atributos
   
  -Tipo_Comida // Combo o Individual
  
  -Gasto // Cuanto cuesta conseguir el producto
  
   #### **Movimientos** tiene los siguientes atributos: 
  
  -Ganancias // Se vera todo el dinero que se ha ganado
  
  -Pagos // Se mostrará todo el dinero que se ha perdido
  
  -Total // El total de dinero restando los pagos
  
  ### **Funcionalidades**
   Son las operaciones que no están en las clases, pero son utilizadas de manera general
   
   -CrearArchivoEmpleados(); // Se crea el archivo inicial de empleados de manera que el programa no se inicie con datos vacios, sino, con unos ya preestablecidos.
   -CrearArchivoGanancias(); // Se crea el archivo inicial de ganancias.
   -CrearArchivoPagos(); // Se crea el archivo inicial de pagos.
   -AñadirPa(); // Se usa para añadir la suma de un producto declarado al valor de los pagos.
   -AñadirGa(); // Se usa para añadir la suma de una compra realizada a las ganancias.
   -MostrarMovimientosMonetarios(); // Permite ver todas las ganacias o pagos que se han añadido a lo largo del programa.
   -CrearArchivoPeliculas(); // Se crea el archivo inicial de peliculas.
   -CrearArchivoBoletos(); // Se crea un archivo para los productos de las funciones disonibles.
   -AgregarEmpleados(); // Captura los datos de los empleados (nombre, tipo, sueldo y contraseña).
   -AgregarPelicula(); // Captura los datos de las peliculas (nombre, tipo, tiempo, sala y precio).
   -AgregarDulceria(); // Captura los datos de los productos que se deseen comprar (nombre, tipo y precio).
   -AgregarBoleto(); // Captura los datos de los boletos de peliculas que se deseen comprar (nombre, cantidad y total a pagar).
   -CrearArchivoDulceria(); // Se crea el archivo inicial de dulceria, donde se guardaran los productos vendidosy sus datos.
   -MostrarEmpleados(); // Muestra el contenido de la lista de empleados.
   -MostrarDulceria(); // Muestra el contenido de la lista de dulceria.
   -MostrarPeliculas(); // Muestra el contenido de la lista de peliculas.
   -MostrarBoletos(); // Muestra el contenido de la lista de boletos.
   -DeclararGanancias(); // Declara las ganancias de manera manual en caso de que sea necesario actualizarlas.
   -DeclararPagos(); // Declara los pagos que solo usa el gerente en su respectivo menú.
   -DeclararGerente(); // Obtiene los datos de Gerente para luego declararlos en el archivero de empledos.
   -DeclararCajeroBol(); // Obtiene los datos de CajeroBol para luego declararlos en el archivero de empleados.
   -DeclararCajeroDul(); // Obtiene los datos de CajeroDul para luego declararlos en el archivero de empleados.
   
   
   #### **Grafica UML**: 

![Grafica_UML](https://user-images.githubusercontent.com/89920305/131930294-af52c57b-5516-42ec-81d0-439b0bf01b89.jpg)

   
  
#### Fin:D
