package tema3Ejercicio39;
import java.util.Scanner;
public class Tema3Ejercicio39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena=teclado.nextLine();
		int inicial=cadena.length()-1;
		while (inicial>=0) {
			System.out.println("El carácter "+inicial+" es "+cadena.charAt(inicial)); 
			inicial--;
		}
	}

}
