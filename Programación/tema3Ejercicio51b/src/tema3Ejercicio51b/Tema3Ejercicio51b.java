package tema3Ejercicio51b;
import java.util.Scanner;
public class Tema3Ejercicio51b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una palabra");
			String palabra = teclado.next();
			int longitud=palabra.length();
			int vocales=0;
			char letra='b';
			for (int posicion=0;posicion<longitud;posicion++) {
				letra = palabra.charAt(posicion);
				switch (letra) {
				case 'a' , 'e' , 'i' , 'o' , 'u' , 'A' , 'E' , 'I' , 'O' , 'U': vocales++;
				}
					
				
			}
			System.out.println("Hay "+vocales+" vocales en la palabra");
	}

}
