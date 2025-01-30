package tema3Ejercicio19c;
import java.util.Scanner;
public class Tema3Ejercicio19c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		final int PRESENTE=2024;
		
		System.out.println("Introduce tu nombre");
		String nombre=teclado.next();
		System.out.println("Introduce tu primer apellido");
		String apellido1=teclado.next();
		System.out.println("Introduce tu segundo apellido");
		String apellido2=teclado.next();
		System.out.println("Introduce tu año de nacimiento");
		int anyo=teclado.nextInt();
		
		int edad=PRESENTE-anyo;
		
		char iniNombre, iniApe1, iniApe2;
		
		iniNombre=nombre.charAt(0);
		iniApe1=apellido1.charAt(0);
		iniApe2=apellido2.charAt(0);
		
		System.out.println("Tu nombre es "+nombre);
		System.out.println("Tu primer apellido es "+apellido1);
		System.out.println("Tu segundo apellido es "+apellido2);
		System.out.println("Tu año de nacimiento es "+anyo);
		System.out.println("Código = "+iniNombre+iniApe1+iniApe2+edad);
	}

}
