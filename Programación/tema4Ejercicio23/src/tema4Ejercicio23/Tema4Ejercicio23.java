package tema4Ejercicio23;

import java.util.Scanner;

public class Tema4Ejercicio23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		try {
		System.out.println("Dime la nota de la primera evaluación");
			
				float nota1=teclado.nextFloat();
		System.out.println("Dime la nota de la segunda evaluación");
	
			float nota2=teclado.nextFloat();
		
		System.out.println("Dime la nota de la tercera evaluación");
		
			float nota3=teclado.nextFloat();
		
				float media=(nota1+nota2+nota3)/3;
				System.out.println("La nota media es "+media);
			}catch (Exception e) {
				System.out.println("Alguno de los datos es incorrecto");
			}
		
	}
}
