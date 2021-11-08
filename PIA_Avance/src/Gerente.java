
import java.util.Scanner;

public class Gerente extends Empleado {
	
	Scanner Scan = new Scanner(System.in);

	void VerMovimientos() {
		Fun.MostrarMovimientosMonetarios();
	}
	
	void Visualizacion(){
		
		int op = 0;
		do {
			System.out.println("\t Bienvenido a la ventana de visualizacion, aqui podras ver el personal, \n");
			System.out.println("----------------------------------------------------------------------------- \n");
			System.out.println("1.- Personal \n");
			System.out.println("2.- Dulceria \n");
			System.out.println("3.- Peliculas \n");
			System.out.println("4.- Salir \n");
			op = Scan.nextInt();
			
			switch(op) {
			case 1: 
				Fun.MostrarEmpleados();
				break;
			case 2: 
				Fun.MostrarDulceria();
				break;
			case 3: 
				Fun.MostrarPeliculas();
				break;
			case 4: 
				break;
			
						}
			
		}while(op != 4);
		
		
	}
	
	void AccederMenus() {
		
		Menus M = new Menus();
		int op1 = 0;
		do {
		System.out.println("Elija el menu al cual quiere acceder, Gerente \n");
		System.out.println("1.- Cajero de Boletos \n");
		System.out.println("2.- Cajero de Dulceria \n");
		System.out.println("3.- Salir \n");
		op1 = Scan.nextInt();
		
		switch(op1) {
			case 1: 
			M.MenuCajeroBol();
				break;
			case 2:
				M.MenuCajeroDul();
				break;
			case 3:
				break;
		}
		
		}while(op1 != 3);
	}
	
	void DeclaracionDinero() {
		
		int op1 = 0;
		
		do {
			System.out.println("\t Elija lo que quiera actualizar dentro de los Movimientos Monetarios\n");
			System.out.println("----------------------------------------------------------------------------- \n");
			System.out.println("1.-Declarar un ingreso (nueva lista de ingresos) \n" );
			System.out.println("2.- Declarar un pago (nueva lista de pagos)  \n" );
			System.out.println("3.- Agregar ingreso  \n" );
			System.out.println("4.- Agregar pago  \n" );
			System.out.println("5.- Salir  \n" );
			op1 = Scan.nextInt();
		
				switch(op1) {
					case 1:
						Fun.DeclararGanancias();
						break;
						
					case 2:
						Fun.DeclararPagos();
						break;
						
					case 3:
						Fun.AgregarGanancia();
						break;
					case 4: 
						Fun.AgregarPago();
						break;
					case 5: 
						break;
							}
		}while(op1 != 5);
		
	}
	
	void Dulceria() {
		
		System.out.println("\t Bienvenido a la Declaración de la Dulceria, donde se añadira otra comivda para comprar\n");
		System.out.println("----------------------------------------------------------------------------- \n");
		System.out.println("\t Primero verificaremos o crearemos el documento que se usara para la lista de comida\n");
		Fun.CrearArchivoDulceria();
		Comida comida = new Comida();
		float Cantidad = 0, gasto=0, Suma = 0;
		
		System.out.println("\t Terminamos la verificicacion, siga las siguientes instrucciones\n");
		System.out.println("----------------------------------------------------------------------------- \n");
		
		System.out.println("Introduzca todos los datos que se le pida \n");
		System.out.println("Introduzca el nombre de la comida");
		comida.setNombre(Scan.next());
		
		System.out.println(" \n Introduzca el tipo de la comida (Individual o Combo) ");
		comida.setTipo(Scan.next());
		
		System.out.println("\n Introduzca el precio al que se le venderá al cliente ");
		comida.setPrecio(Scan.nextFloat());
		
		Fun.AgregarDulceria(comida);
		
		System.out.println("\n Introduzca la cantidad de productos que se generaron");
		Cantidad = Scan.nextInt();

		
		System.out.println("\n Introduzca el dinero que se invirtio para conseguir la comida por unidad (Pagos)");
		gasto = Scan.nextFloat();
		
		Suma = Cantidad * gasto;
		
		Fun.AñadirPa(comida.getNombre(),Suma);
		
		System.out.println("\t Todos los datos fueron capturados con exito, volvera al menu de gerente\n");
		System.out.println("----------------------------------------------------------------------------- \n");
											
	    
		
	}
	
	void Cartelera() {
		
		System.out.println("\t Bienvenido a la Declaración de Pelicula, donde se añadira otra pelicula para ver\n");
		System.out.println("----------------------------------------------------------------------------- \n");
		System.out.println("\t Primero verificaremos o crearemos el documento que se usara para las peliculas\n");
		Fun.CrearArchivoPeliculas();
		Pelicula Pelicula = new Pelicula();
		
		System.out.println("\t Terminamos la verificicacion, siga las siguientes instrucciones\n");
		System.out.println("----------------------------------------------------------------------------- \n");
		
		System.out.println("Introduzca todos los datos que se le pida \n");
		System.out.println("Introduzca el nombre de la pelicula ");
		Pelicula.setNombre(Scan.next());
		
		System.out.println(" \n Introduzca el genero de la pelicula ");
		Pelicula.setTipo(Scan.next());
		
		System.out.println("\n Introduzca la duracion de la pelicula ");
		Pelicula.setTiempo(Scan.next());
		
		System.out.println("\n Introduzca la sala donde se mostrara la pelicula");
		Pelicula.setSala(Scan.nextInt());
		
		System.out.println("\n Introduzca el precio por boleto de la pelicula");
		Pelicula.setPrecio(Scan.nextFloat());

		Fun.AgregarPelicula(Pelicula);
		
		System.out.println("\n Introduzca el dinero que se invirtio para tener los derechos de la pelicula (Pago que se hizo)");
		Fun.AñadirPa(Pelicula.getNombre(),Scan.nextInt());
		
		System.out.println("\t Todos los datos fueron capturados con exito, volvera al menu de gerente\n");
		System.out.println("----------------------------------------------------------------------------- \n");
		
	}
}
