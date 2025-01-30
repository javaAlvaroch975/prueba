package tema4Ejercicio32;

import java.util.Scanner;

public class Tema4Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserta un número de más de tres cifras");
				String cadena=teclado.next();
				
				StringBuilder sb= new StringBuilder(cadena);
				
				sb.reverse();
				
				for (int posicion=3;posicion<sb.length();posicion+=4) {
					sb.insert(posicion, ".");
				}
				
				sb.reverse();
				
				cadena=sb.toString();
				
				System.out.println(cadena);
	}
}
