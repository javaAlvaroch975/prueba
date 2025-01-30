package tema3Ejercicio57;
import java.util.Scanner;
public class Tema3Ejercicio57 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una palabra de 5 letras, que comience en a y acabe en m");
		String palabra=teclado.next();
		int longitud=palabra.length();
		char primero = palabra.charAt(0);
		char ultimo = palabra.charAt(longitud-1);
		
		if (longitud!=5) {
			System.out.println("Longitud incorrecta");
		} else if (primero!='a') {
			System.out.println("El primer carácter es erróneo");
		} else if (ultimo!='m') {
			System.out.println("El último carácter es erróneo");
		}else {
			System.out.println("Cadena aceptada");
		}
		
	}

}
