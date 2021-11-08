import java.util.Scanner;

public class CajeroBol extends Empleado {
	Scanner Scan = new Scanner(System.in);
	int Cantidad = 0, op = 0;
	float valor = 0;
	Gerente gerente;
	Pelicula pelicula = new Pelicula();
	
	void IniciarPedido() {
		
		Fun.MostrarPeliculas();
		
		System.out.println("Introduzca los datos que se le piden para entregarle su boleto \n");
		
		System.out.println("Pelicula que seleccionara: ");
		pelicula.setNombre(Scan.nextLine());
		
		System.out.println("Cuantos boletos desea comprar?: ");
		Cantidad = Scan.nextInt();
		
		System.out.println("Introduzca el precio individual del boleto: ");
		valor = Scan.nextFloat();
		
		pelicula.setPrecio(Cantidad*valor);
		
		System.out.println("Que desea hacer? \n");
		System.out.println("1.- Reiniciar Pedido \n");
		System.out.println("2.- Terminar Pedido \n");
		op = Scan.nextInt();
		
		switch(op)
		{
		case 1:
			ReiniciarPedido();
			break;
		case 2:
			TerminarPedido();
			break;
		
		}
		
	}
	
	void ReiniciarPedido() {
		
		Scan.nextLine();
		IniciarPedido();
	
	}

	void MostrarPeliculas() {
	
		Fun.MostrarPeliculas();
	}
	
	void TerminarPedido() {
		System.out.println("Su pedido es el siguiente: ");
		System.out.println("Funcion: " + pelicula.getNombre() + " cantidad de boletos: " + Cantidad + " Total a pagar: " + pelicula.getPrecio());
		System.out.println("Gracias por su compra:) ");
		Fun.AñadirGa(pelicula.getNombre(), pelicula.getPrecio());
	}

}
