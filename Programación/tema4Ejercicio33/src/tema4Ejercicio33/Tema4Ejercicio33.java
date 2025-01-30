package tema4Ejercicio33;

import java.util.Scanner;

public class Tema4Ejercicio33 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Float n1, n2, n3;
		
		System.out.println("Dime la nota de la primera evaluación");
		n1=teclado.nextFloat();
		System.out.println("Dime la nota de la segunda evaluación");
		n2=teclado.nextFloat();
		System.out.println("Dime la nota de la tercera evaluación");
		n3=teclado.nextFloat();
		
		Float media=(n1+n2+n3)/3;
		
		System.out.println("La nota media es "+media);
		
	}

}

