package examen;

public class Examen {
	String nombre;
	int edad;
	
	float calcularNotaMedia(float nota1, float nota2, float nota3 ) {
		
		float notaFinal=(nota1+nota2+nota3)/3;
		return notaFinal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Examen alu1=new Examen();
		Examen alu2=new Examen();
		
		alu1.nombre="Junpei";
		alu2.nombre="Mitsuru";
		alu1.edad=16;
		alu2.edad=18;
		
		float media1;
		float media2;
		media1 = alu1.calcularNotaMedia(4, 5, 8);
		media2 = alu2.calcularNotaMedia(9, 7, 10);
		
		System.out.println("El alumno " +alu1.nombre+ " de edad "+alu1.edad+" tiene una nota de "+media1);
		System.out.println();
		System.out.println("El alumno " +alu2.nombre+ " de edad "+alu2.edad+" tiene una nota de "+media2);
	}

}
