package tema3Ejercicio51;
import java.util.Scanner;
public class Tema3Ejercicio51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
			System.out.println("Introduce una palabra");
				String palabra = teclado.next();
				int longitud=palabra.length();
				int aes=0;
				for (int posicion=0;posicion<longitud;posicion++) {
					if (palabra.charAt(posicion)=='a') {
						aes++;
					}
				}
				System.out.println("Hay "+aes+" aes en la palabra");
	}

}
