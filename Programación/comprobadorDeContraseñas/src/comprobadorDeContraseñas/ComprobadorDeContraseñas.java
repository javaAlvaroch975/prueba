package comprobadorDeContraseñas;
import java.util.Scanner;
public class ComprobadorDeContraseñas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);

		System.out.println("Introduczca una cadena de 5 caracteres que empiece por 'a' y acabe en 'm'");
		String contrasenya=teclado.next();
		int longitud=contrasenya.length();
		char primero=contrasenya.charAt(0);
		char ultimo=contrasenya.charAt(longitud-1);
		
		for (;longitud!=5;) {
			System.out.println("Longitud inválida, intente de nuevo");
			contrasenya=teclado.next();
			longitud=contrasenya.length();
		}
		for (;primero!='a';) {
			System.out.println("El primer carácter debe ser 'a' ");
			contrasenya=teclado.next();
			primero=contrasenya.charAt(0);
		}
		for (;ultimo!='m';) {
			System.out.println("El último carácter debe ser 'm' ");
			contrasenya=teclado.next();
			ultimo=contrasenya.charAt(longitud-1);
		}
		System.out.println("Cadena permitida, bienvenido");
		
		//Y HAGO LO QUE NO TOCA BIEN, ME DESCOJONO. NI SIQUIERA TENÍA QUE HACER ESTO XDDDDDDD
		//Igual esto me resulta útil algún día
	}

}
