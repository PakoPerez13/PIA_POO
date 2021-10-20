import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class CajeroDul extends Empleado {
	
	
	void IniciarPedido() {
		   try {
			   File Ffichero=new File("Dulceria.txt");
		       /*Si existe el fichero*/
		       if(Ffichero.exists()){
		           /*Abre un flujo de lectura a el fichero*/
		           BufferedReader Flee= new BufferedReader(new FileReader(Ffichero));
		           String Slinea;
		           while((Slinea=Flee.readLine())!=null) {   
		           System.out.println(Slinea);              
		           }
		           System.out.println("*********Fin de los productos**********");
		           Flee.close();
		         }else{
		           System.out.println("Fichero No Existe");
		         }
		   } catch (Exception ex) {
			   System.out.println(ex.getMessage());
		   }
		   
		   	System.out.println("Seleccione  \n");
			System.out.println("1.- Cajero de Boletos \n");
			System.out.println("2.- Cajero de Dulceria \n");
		 
		
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
		
	void TerminarPedido() {
		
	
		//Fun.AgregarGanancias();
		
	}

}
