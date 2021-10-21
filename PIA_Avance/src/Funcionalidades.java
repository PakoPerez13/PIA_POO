import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Funcionalidades {
	
	MovimientosMonetarios Dinero = new MovimientosMonetarios();
	Scanner Scan = new Scanner(System.in);
	
	void CrearArchivoGanancias() {
		try {
			
		      File Ganancias = new File("Ganancias.txt");
		      if (Ganancias.createNewFile()) {
		      } else {
		      }
		    } catch (IOException e) {
		      System.out.println("Ocurrió un error.");
		      e.printStackTrace();
		    }
	}
	
	void CrearArchivoPagos() {
		try {
			
		      File Pagos = new File("Pagos.txt");
		      if (Pagos.createNewFile()) {
		      } else {
		      }
		    } catch (IOException e) {
		      System.out.println("Ocurrió un error.");
		      e.printStackTrace();
		    }
	}
	
	void AñadirPa(String nombre, float dinero) {
		 try{
	        	
	            BufferedWriter bw = new BufferedWriter(
	            new FileWriter("Pagos.txt", true)
	            );
	            bw.write(nombre + "\t");
	            bw.write(dinero + "\t\n");  
	            bw.close();
	        } catch(Exception ex){
	            System.out.println(ex);
	        }
	    
	}
	
	void AñadirGa(String nombre, float dinero) {
		 try{
	        	
	            BufferedWriter bw = new BufferedWriter(
	            new FileWriter("Ganancias.txt", true)
	            );
	            bw.write(nombre + "\t");
	            bw.write(dinero + "\t\n");
	            bw.close();
	        } catch(Exception ex){
	            System.out.println(ex);
	        }
	    
	}
	
	//Muestra los movimientos del dia en la pestañana indicada del gerente
	void MostrarMovimientosMonetarios() {
		System.out.println("\t Bienvenido al menú de movimientos monetarios\n");
		System.out.println("----------------------------------------------------------------------------- \n");
		System.out.println("Ingresos Totales:  \t\n" );
		try{
			
	        BufferedReader br = new BufferedReader(new FileReader("Ganancias.txt"));
	        String s;
	           while((s = br.readLine()) != null){
	                System.out.println(s);
	           				}
	        br.close();
	        			} 
			catch(Exception ex){
	            System.out.println(ex);
				}
		
		System.out.println("Pagos:  \t\n" );
		try{
			
	        BufferedReader br = new BufferedReader(new FileReader("Pagos.txt"));
	        String s;
	           while((s = br.readLine()) != null){
	                System.out.println(s);
	           				}
	        br.close();
	        			} 
			catch(Exception ex){
	            System.out.println(ex);
				}
		
	}
	//Obtiene el valor del parámetro para sumarle el valor a las ganancias
	
	
	//Funciones de creacion de Archivos
//////////////////////////////////////////////////////////////////////////////////////////////////////	
	//Se crea el archivo inicial de empleados para no iniciar el programa con datos vaciós,
	//sino, ya preestablecidos
	void CrearArchivoEmpleados(){
		try {
			
		      File Empleados = new File("Empleados.txt");
		      if (Empleados.createNewFile()) {
		        DeclararGerente();
				DeclararCajeroDul();
				DeclararCajeroBol();
		      } else {
		      }
		    } catch (IOException e) {
		      System.out.println("Ocurrió un error.");
		      e.printStackTrace();
		    }
								}
	
	void CrearArchivoPeliculas(){
		try {
			
		      File Pelicula = new File("Peliculas.txt");
		      if (Pelicula.createNewFile()) {
		        System.out.println("Archivo creado: " + Pelicula.getName());
		      } else {
		        System.out.println("El archivo ya existe.");
		      }
		    } catch (IOException e) {
		      System.out.println("Ocurrió un error.");
		      e.printStackTrace();
		    }
								}
	
	void CrearArchivoBoleto(){
		try {
			
		      File Boleto = new File("Boletos.txt");
		      if (Boleto.createNewFile()) {
		        System.out.println("Archivo creado: " + Boleto.getName());
		      } 
		      else {
		    	  System.out.println("El archivo ya existe.");
		      }
		    } catch (IOException e ) {
		      System.out.println("Ocurrió un error.");
		      e.printStackTrace();
		    }
								}
	//Se capturan los datos que se tiene del método de declaración de empleados, por lo que los datos del objeto pasan a ser 
	//guardados en el archivo de "Empleados"
	void AgregarEmpleados(Empleado Empleado) {
		
	        try{
	        	
	            BufferedWriter bw = new BufferedWriter(
	            new FileWriter("Empleados.txt", true)
	            );
	            bw.write(Empleado.getNombre() + "\t");
	            bw.write(Empleado.getTipo() + "\t");
	            bw.write(Empleado.getSueldo() + "\t");
	            bw.write(Empleado.getContraseña() + "\t\n");
	          
	            bw.close();
	        } catch(Exception ex){
	            System.out.println(ex);
	        }
	    
									}
	
	void AgregarPelicula(Pelicula pelicula) {
		 try{
	        	
	            BufferedWriter bw = new BufferedWriter(
	            new FileWriter("Peliculas.txt", true)
	            );
	            bw.write(pelicula.getNombre() + "\t");
	            bw.write(pelicula.getTipo() + "\t");
	            bw.write(pelicula.getTiempo() + "\t");
	            bw.write(pelicula.getSala() + "\t");   
	            bw.write(pelicula.getPrecio() + "\t\n"); 
	            bw.close();
	            System.out.println("Datos agregados con exito");
	        } catch(Exception ex){
	            System.out.println(ex);
	        }
	    
	}
	
	void AgregarDulceria(Comida comida) {
		 try{
	        	
	            BufferedWriter bw = new BufferedWriter(
	            new FileWriter("Dulceria.txt", true)
	            );
	            bw.write(comida.getNombre() + "\t");
	            bw.write(comida.getTipo() + "\t");
	            bw.write(comida.getPrecio() + "\t\n");
	            bw.close();
	            System.out.println("Datos agregados con exito");
	        } catch(Exception ex){
	            System.out.println(ex);
	        }
	    
	}
	
	void AgregarBoleto(Pelicula pelicula, int cantidad) {
		
        try{
        	
            BufferedWriter bw = new BufferedWriter(
            new FileWriter("Boletos.txt", true)
            );
            bw.write("Nombre de la pelicula\t Cantidad de Boletos \t Total a Pagar \t\n");
            bw.write(pelicula.getNombre() + " \t");
            bw.write(cantidad + " \t");
            bw.write(pelicula.getPrecio() + " \t");
      
          
            bw.close();
            System.out.println("Datos agregados con exito");
        } catch(Exception ex){
            System.out.println(ex);
        }
    
								}
	
	//Se crea un archivo en especial para los artículos de la dulcería/comida
	void CrearArchivoDulceria(){
		try {
			
		      File Dulceria = new File("Dulceria.txt");
		      if (Dulceria.createNewFile()) {
		        System.out.println("Archivo creado: " + Dulceria.getName());
		        
		      } else {
		        System.out.println("El archivo ya existe.");
		      }
		    } catch (IOException e) {
		      System.out.println("Ocurrió un error.");
		      e.printStackTrace();
		    }
						
								}
	
	void MostrarEmpleados() {
		
		try{
	        BufferedReader br = new BufferedReader(new FileReader("Empleados.txt"));
	        String s;
	           while((s = br.readLine()) != null){
	                System.out.println(s);
	           				}
	        br.close();
	        			} 
			catch(Exception ex){
	            System.out.println(ex);
				}

		}
/////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Funcion de gerente que mostará el contenido que tiene la lista de Dulceria
		void MostrarDulceria() {
		
		try{
	        BufferedReader br = new BufferedReader(
	                new FileReader("Dulceria.txt")
	            );
	        String s;
	            while((s = br.readLine()) != null){
	                System.out.println(s);
	            }
	            br.close();
	        } catch(Exception ex){
	            System.out.println(ex);
	        }

								}

		//Funcion de Gerente que mostrará el contenido que tiene la lista de Peliculas
		void MostrarPeliculas() {
	
	try{
        BufferedReader br = new BufferedReader(
                new FileReader("Peliculas.txt")
            );
        String s;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        } catch(Exception ex){
            System.out.println(ex);
        }
								}
		
		void MostrarBoletos() {
			
			try{
		        BufferedReader br = new BufferedReader(
		                new FileReader("Boletos.txt")
		            );
		        String s;
		            while((s = br.readLine()) != null){
		                System.out.println(s);
		            }
		            br.close();
		        } catch(Exception ex){
		            System.out.println(ex);
		        }
										}

	//Declaracion manual de las ganancias, en caso de tener que actualizarlo
	void DeclararGanancias() {
			System.out.println("Actualice el ingreso total que se ha generado, el total actual es: \n" + Dinero.getGanancias());
			System.out.println("Nuevo Ingreso: \n");
			
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("Ganancias.txt"));
				bw.write("");
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			AñadirGa("Ingreso Inicial", Scan.nextFloat());
			System.out.println("El monto fue guardado con exito");
		}
	
	//Cuando se haga una compra, se hará uso de este método para añadir la suma que se hace a las ganancias
	
	//Método que se usa para calcular la resta entre las ganancias - pagos, el total indica si se tuvo ganancias o perdidas
	/*void CalcularTotal() {
		float V1, V2, Suma;
		V1  = Dinero.getGanancias();
		V2 = Dinero.getPagos();
		Suma = V1 - V2;
		Dinero.setTotal(Suma);
	}*/
	
	//Declaracion de los pagos, que solo puede usar el gerente en su respectivo menú
	void DeclararPagos() {
			System.out.println("Actualice el dinero pendiente de pagar / deudas: \n");
			System.out.println("Nuevo pago: \n");
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("Pagos.txt"));
				bw.write("");
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			AñadirPa("Pago Inicial", Scan.nextFloat());
			System.out.println("El monto fue guardado con exito");
		}
	
	//Obtiene los datos del objeto gerente para posteriormente declararlos en el archivero de empleados
		void DeclararGerente() {
			Empleado Gerente = new Empleado();
			Gerente.setTipo(1);
	        Gerente.setNombre("Francisco ");
	        Gerente.setContraseña("Pako13 ");
	        Gerente.setSueldo(5000);
	        AgregarEmpleados(Gerente);
	        
		}
		

		//Obtiene los datos del objeto CajeroBol para posteriormente declararlos en el archivero de empleados
		void DeclararCajeroBol() {
			Empleado CajeroBol = new Empleado();
			CajeroBol.setTipo(2);
	        CajeroBol.setNombre(" Enrique ");
	        CajeroBol.setContraseña("Elpepe ");
	        CajeroBol.setSueldo(2500);
	        AgregarEmpleados(CajeroBol);
		}
		

		//Obtiene los datos del objeto CajeroDul para posteriormente declararlos en el archivero de empleados
		void DeclararCajeroDul() {
			Empleado CajeroDul = new Empleado();
			CajeroDul.setTipo(3);
	        CajeroDul.setNombre("Alejandro ");
	        CajeroDul.setContraseña("ElBicho ");
	        CajeroDul.setSueldo(2000);
	        AgregarEmpleados(CajeroDul);
		}
		
		//El método que se usará en el menú de gerente, el cual le permite ver todas las ganancas o pagos que se han añadido a lo largo del uso del programa
		
		/*void DeclararPalomitas() {
			Producto Palomitas = new Producto();
			Gerente.setTipo(1);
	        Gerente.setNombre("Francisco ");
	        Gerente.setContraseña("Pako13 ");
	        Gerente.setSueldo(5000);
	        AgregarEmpleados(Gerente);
	        
		}*/
		
		
	}




