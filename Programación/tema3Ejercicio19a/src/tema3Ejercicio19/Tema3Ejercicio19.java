package tema3Ejercicio19;
import java.util.Scanner;
public class Tema3Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce tu nombre y apellidos.");
		String nombre=teclado.nextLine();
		int longitud , caracter;
		longitud=nombre.length();
		
		//Así se pide la longitud de una variable
		
		
		caracter=nombre.indexOf('a');
		
		//Recuerda, los caracteres son una sola coma (y si es un index, se hace con un int)
		
		char primero , ultimo;
		
		primero=nombre.charAt(0);
		ultimo=nombre.charAt(longitud-1);
		
		//El sentido común es clave para esto
		
		System.out.println("La longitud de la cadena es "+longitud);
		System.out.println("La primera letra de la cadena es "+primero);
		System.out.println("La última letra de la cadena es "+ultimo);
		System.out.println("La primera vez que aparece la letra a es en la posición "+caracter);
	}

}
