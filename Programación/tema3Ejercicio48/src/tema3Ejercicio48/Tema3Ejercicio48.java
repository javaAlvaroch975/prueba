package tema3Ejercicio48;
import java.util.Scanner;
public class Tema3Ejercicio48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena=teclado.nextLine();
		for (int inicial=cadena.length()-1;inicial>=0;inicial--) {
			System.out.println("El carácter "+inicial+" es "+cadena.charAt(inicial)); 
		}
	}

}
