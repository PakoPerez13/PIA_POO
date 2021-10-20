import java.util.*;

public class Menus {
	
	Scanner Scan = new Scanner(System.in);
	int op = 0;

	void MenuGerente()
	{
		Gerente EmpleadoGerente = new Gerente();
		int Centinela = 0;
		
		do {
			
		System.out.println("\t Bienvenido al menú del gerente, tiene las siguientes opciones disponibles: \n");
		System.out.println("----------------------------------------------------------------------------- \n");
		System.out.println("1.- Ventana de los movimientos monetarios \n");
		System.out.println("2.- Ventana de empleados\n");
		System.out.println("3.- Acceder a un menu en especifico \n");
		System.out.println("4.- Declarar Pagos/Adeudos \n");
		System.out.println("5.- Declarar nuevo producto en dulceria \n");
		System.out.println("6.- Declarar nueva pelicula \n");
		System.out.println("7.- Salir al menu principal \n");
		op = Scan.nextInt();
		
		
			switch(op) {
			
			case 1:
				EmpleadoGerente.VerMovimientos();
				break;
			case 2: 
				EmpleadoGerente.Visualizacion();
				break;
			case 3:
				EmpleadoGerente.AccederMenus();
				break;
			case 4: 
				EmpleadoGerente.DeclaracionDinero();
				break;
			case 5: 
				EmpleadoGerente.Dulceria();
				break;
			case 6: 
				EmpleadoGerente.Cartelera();
				break;
			case 7: 
				Centinela = 1;
				break;
				
			}
			
		}while(Centinela == 0);
		
	}
	
	void MenuCajeroBol()
	{
			do {
		System.out.println("\t Bienvenido al menú del gerente, tiene las siguientes opciones disponibles: \n");
		System.out.println("----------------------------------------------------------------------------- \n");
		System.out.println("1.- Iniciar el pedido de la pelicula \n");
		System.out.println("2.-  \n");
		System.out.println("3.- \n");
		System.out.println("4.- Declarar Pagos/Adeudos \n");
		System.out.println("5.- Salir \n");
		op = Scan.nextInt();
		
		switch(op) {
		
		}
		
			}while(op != 5);
		
	}
	
	void MenuCajeroDul()
	{
		do {
		System.out.println("\t Bienvenido al menú del gerente, tiene las siguientes opciones disponibles: \n");
		System.out.println("----------------------------------------------------------------------------- \n");
		System.out.println("1.- Ventana de los movimientos monetarios \n");
		System.out.println("2.- Ver el personal disponible \n");
		System.out.println("3.- Acceder a un menu en especifico \n");
		System.out.println("4.- Declarar Pagos/Adeudos \n");
		System.out.println("5.- Declarar nuevo producto en dulceria \n");
		System.out.println("6.- Declarar nueva pelicula \n");
		op = Scan.nextInt();
		
		switch(op) {
		
		}
			}while(op != 5);
		
	}
	
	
	
	
}
