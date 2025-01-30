package tema4Ejercicio2;
import java.util.Scanner;
public class Tema4Ejercicio2 {
	
	float calcularMediaEvaluaciones(float ev1, float ev2, float ev3) { //A ver si me acuerdo de que los tipos coincidan
	float evFinal = ( ev1 + ev2 + ev3) / 3;
	return evFinal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Tema4Ejercicio2 calcular=new Tema4Ejercicio2();
		
		System.out.println("Dime la nota de la primera evaluación");
		float nota1=teclado.nextFloat();
		System.out.println("Dime la nota de la segunda evaluación");
		float nota2=teclado.nextFloat();
		System.out.println("Dime la nota de la tercera evaluación");
		float nota3=teclado.nextFloat();
		
		float media=calcular.calcularMediaEvaluaciones(nota1, nota2, nota3);
		
		System.out.println("La nota media es "+media);
		

	}

}
