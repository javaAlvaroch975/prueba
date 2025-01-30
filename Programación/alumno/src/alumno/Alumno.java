package alumno;

public class Alumno {
	String nom;
	int edad;
	// Estos son los atributos

	float calcularMediaEvaluaciones(float ev1, float ev2, float ev3) {

		// Aquí están los parámetros que serán la nota de las evaluaciones

		float evFinal = (ev1 + ev2 + ev3) / 3;
		return evFinal;

		// Esta es la fórmula
	}

	// Esta es la fórmula de la media

	public static void main(String[] args) {

		Alumno alu1 = new Alumno();
		Alumno alu2 = new Alumno();

		alu1.nom = "Juan";
		alu1.edad = 20;
		alu2.nom = "Ana";
		alu2.edad = 21;

		// Aquí se crean los objetos y sus valores

		System.out.println(alu1.nom + " tiene " + alu1.edad + " años");

		// Utilizamos el print para imprimir la información de Juan

		System.out.println();

		// Hacemos esto para dejar un espacio en blanco

		float media1;
		media1 = alu1.calcularMediaEvaluaciones(10, 9, 8);
		System.out.println("La media de " + alu1.nom + " es " + media1);

		// Y aquí usamos el float para traer la media y calcularla

		System.out.println();

		System.out.println(alu2.nom + " tiene " + alu2.edad + " años");

		System.out.println();

		float media2;
		media2 = alu2.calcularMediaEvaluaciones(4, 7, 6);
		System.out.println("La media de " + alu2.nom + " es " + media2);
	}
}
