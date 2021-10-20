
public class Pelicula extends Producto {
	Funcionalidades Fun = new Funcionalidades();
	String Tiempo;
	int Sala;
	String Asiento;
	
	void Gasto(float dinero){
		
	}

	public Funcionalidades getFun() {
		return Fun;
	}

	public void setFun(Funcionalidades fun) {
		Fun = fun;
	}

	public String getTiempo() {
		return Tiempo;
	}

	public void setTiempo(String tiempo) {
		Tiempo = tiempo;
	}

	public int getSala() {
		return Sala;
	}

	public void setSala(int sala) {
		Sala = sala;
	}

	public String getAsiento() {
		return Asiento;
	}

	public void setAsiento(String asiento) {
		Asiento = asiento;
	}

	
}
