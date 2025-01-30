package tema3Ejercicio51d;
import java.util.Scanner;
public class Tema3Ejercicio51d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una palabra");
			String palabra = teclado.next();
			int longitud=palabra.length();
			int consonantes=0;
			char letra='b';
			for (int posicion=0;posicion<longitud;posicion++) {
				letra = palabra.charAt(posicion);
				switch (letra) {
				case 'a' , 'e' , 'i' , 'o' , 'u' , 'A' , 'E' , 'I' , 'O' , 'U': consonantes+=0;
				break;
				default: consonantes++;
				}
				//En vez de cambiar la condición, a veces es más inteligente cambiar el resultado
			}
			System.out.println("Hay "+consonantes+" consonantes en la palabra");
	}

}
