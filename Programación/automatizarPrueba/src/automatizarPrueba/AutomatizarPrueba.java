package automatizarPrueba;

public class AutomatizarPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Alumno{
	
	Alumno(int nexp, String nombre) {
		this.nexp = nexp;
		this.nombre = nombre;
	}
	int nexp;
	String nombre;
	int getNexp() {
		return nexp;
	}
	void setNexp(int nexp) {
		this.nexp = nexp;
	}
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 
	
}