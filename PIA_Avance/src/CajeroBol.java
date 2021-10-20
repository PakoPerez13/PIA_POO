import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CajeroBol extends Empleado {
	
	

	void IniciarPedido() {
		
			/*
	        try{
	        	
	            BufferedWriter bw = new BufferedWriter(
	            new FileWriter("Empleados.txt", true)
	            );
	            bw.write(Empleado.getNombre() + "\n");
	            bw.write(Empleado.getTipo() + "\n");
	            bw.write(Empleado.getSueldo() + "\n");
	            bw.write(Empleado.getContraseña() + "\n");
	          
	            // IMPORTANTE: SIEMPRE CERRAR EL ARCHIVO AL TERMINAR DE USARLO
	            bw.close();
	            System.out.println("Datos agregados con exito");
	        } catch(Exception ex){
	            System.out.println(ex);
	        }
	   */
	
	}
	
	void ReinciarPedido() {
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Boleto.txt"));
			bw.write("");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void MenuCajeroBol() {
	
	}
	
	void TerminarPedido() {
		
	}

}
