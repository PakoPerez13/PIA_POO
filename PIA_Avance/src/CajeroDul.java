import java.util.Scanner;

public class CajeroDul extends Empleado {
	Scanner Scan = new Scanner(System.in);
	int Cantidad = 0, op = 0;
	float valor = 0;
	Comida comida = new Comida();
	
	void IniciarPedido() {
		
		Fun.MostrarDulceria();
		
		System.out.println("Introduzca los datos que se le pidan en su pedido \n");
		System.out.println("Comida que se seleccionara: ");
		comida.setNombre(Scan.nextLine());
		
		System.out.println("Cuantos productos desea comprar?: ");
		Cantidad = Scan.nextInt();
		
		System.out.println("Introduzca el precio del producto invidivual: ");
		valor = Scan.nextFloat();
	
		
		comida.setPrecio(Cantidad*valor);
		
		System.out.println("Que desea hacer? \n");
		System.out.println("1.- Reiniciar Pedido \n");
		System.out.println("2.- Terminar Pedido \n");
		op = Scan.nextInt();
		
		
		
		switch(op)
		{
		case 1:
			Scan.nextLine();
			ReiniciarPedido();
			break;
		case 2:
			TerminarPedido();
			break;
		
		}
		
	}
	
	void ReiniciarPedido() {
		
		IniciarPedido();
	
	}

	void MostrarDulceria() {
	
		Fun.MostrarDulceria();
	}
	
	void TerminarPedido() {
		System.out.println("Su pedido es el siguiente: ");
		System.out.println("Funcion: " + comida.getNombre() + " cantidad de boletos: " + Cantidad + " Total a pagar: " + comida.getPrecio());
		System.out.println("Gracias por su compra:) ");
		Fun.AñadirGa(comida.getNombre(), comida.getPrecio());
	}

}
