package pais;

public class Pais {

	private static final int ANYO_ACTUAL = 2025;
	String nomPais;
	int habitantes;
	double superficie;
	Capital data = new Capital();
	int anyoCreacion;

	String getNomPais() {
		return nomPais;
	}

	int getHabitantes() {
		return habitantes;
	}

	double getSuperficie() {
		return superficie;
	}

	int getAnyoCreacion() {
		return anyoCreacion;
	}

	void setNomPais(String nomPais) {
		this.nomPais = nomPais;
	}

	void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	void setSuperficie(double s) {
		this.superficie = s;
	}

	void setAnyoCreacion(int anyoCreacion) {
		this.anyoCreacion = anyoCreacion;
	}

	double calcularDensidad() {
		double densidad;

		densidad = this.habitantes / this.superficie;
		return densidad;
	}

	void calcularSiglosHistoria() {

		int siglo = 100;
		if ((ANYO_ACTUAL - this.anyoCreacion) / siglo <= 3)
			System.out.println("País reciente");
		else if (((ANYO_ACTUAL - this.anyoCreacion) / siglo > 3) && ((ANYO_ACTUAL - this.anyoCreacion) / siglo <= 5))
			System.out.println("País fundado hace varios siglos");
		else
			System.out.println("País longevo");

	}
}
