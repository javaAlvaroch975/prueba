package tema6Ejercicio22c;

public class Tema6Ejercicio22c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Palabra{
	String termino;
	String definicion;
	
	Palabra(String termino, String definicion) {
		this.termino = termino;
		this.definicion = definicion;
	}

	String getTermino() {
		return termino;
	}

	void setTermino(String termino) {
		this.termino = termino;
	}

	String getDefinicion() {
		return definicion;
	}

	void setDefinicion(String definicion) {
		this.definicion = definicion;
	}
	
}