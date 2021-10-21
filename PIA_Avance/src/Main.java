import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de los Objetos que se usaran
		Funcionalidades Fun = new Funcionalidades();
		Menus M = new Menus();
		Scanner Scan = new Scanner(System.in);
		int Tipo = 0;
		Fun.CrearArchivoEmpleados();
		Fun.CrearArchivoGanancias();
		Fun.CrearArchivoPagos();
		
		do {
		System.out.printf("Bienvenido al programa, por favor, seleccione el menu al que quiera acceder: \n");
		System.out.println("1.- Gerente \n");
		System.out.println("2.- Cajero Boletos \n");
		System.out.println("3.- Cajero Dulceria \n");
		System.out.println("4.- Para terminar el programa \n");
		Tipo = Scan.nextInt();
		
		
			switch(Tipo) {
			case 0:
				System.out.printf("Seleccione una opcion validad\n");
				break;
			case 1:
				M.MenuGerente();
				break;
			case 2:
				M.MenuCajeroBol();
				break;
			case 3:
				M.MenuCajeroDul();
				break;
			case 4:
				System.out.printf("Se terminará el programa, gracias por usarlo \n");
				break;
			}
		}while(Tipo != 4);
		
		Scan.close();
	}
	

}
