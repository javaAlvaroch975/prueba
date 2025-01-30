package tema3Ejercicio10;
import java.util.Scanner;

public class Tema3Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime la nota de la primera evaluación");
		float nota1=teclado.nextFloat();
		System.out.println("Dime la nota de la segunda evaluación");
		float nota2=teclado.nextFloat();
		System.out.println("Dime la nota de la tercera evaluación");
		float nota3=teclado.nextFloat();
		
		float media=(nota1+nota2+nota3)/3;
		
		System.out.println("La nota media es "+media);
		
		//Pues hacerlo así es más rápido que la otra vez
	}

}
