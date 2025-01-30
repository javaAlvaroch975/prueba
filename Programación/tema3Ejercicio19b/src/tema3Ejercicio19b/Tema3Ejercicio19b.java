package tema3Ejercicio19b;
import java.util.Scanner;
public class Tema3Ejercicio19b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el NIF");
		String nif=teclado.next();
		int longitud=nif.length();
		char ultimo=nif.charAt(longitud-1);
		
		System.out.println("La letra de su NIF es "+ultimo);
	}

}
