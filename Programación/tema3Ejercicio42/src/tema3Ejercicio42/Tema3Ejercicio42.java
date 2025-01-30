package tema3Ejercicio42;
import java.util.Scanner;
public class Tema3Ejercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		float nota1;
		float nota2;
		float nota3;
		
		do {
		
		System.out.println("Dime la nota de la primera evaluación");
		nota1=teclado.nextFloat();
		}
		
		while ((nota1<0)||(nota1>10));
		do {
		
		System.out.println("Dime la nota de la segunda evaluación");
		nota2=teclado.nextFloat();
		}
		while ((nota2<0)|(nota2>10));
		do {
		
		System.out.println("Dime la nota de la tercera evaluación");
		nota3=teclado.nextFloat();
		}
		while ((nota3<0)||(nota3>10)) ;
		
		float media=(nota1+nota2+nota3)/3;
		
		System.out.println("La nota media es "+media);
		
	}
//Madre mía con los while...
}


