package tema4Ejercicio9;

import java.util.Scanner;
import java.util.regex.*;

public class Tema4Ejercicio9 {

	
	boolean comprobarExpresionRegular(String expresion, String cadena) {
		Pattern patron=Pattern.compile(expresion);
		Matcher m=patron.matcher(cadena);
		if (m.matches()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Tema4Ejercicio9 patron=new Tema4Ejercicio9();
		String email="^\\w+@\\w+\\.\\w{2,3}$";
		String movil="^[67]\\d{8}$";
		String nif="^\\d{8,9}[A-Z]$";
		String ip="^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])$";
		
		System.out.println("Indtroduzca su email");
		String mail=teclado.next();
		System.out.println("Indtroduzca su número de teléfono");
		String tlf=teclado.next();
		System.out.println("Indtroduzca su NIF");
		String dni=teclado.next();
		System.out.println("Indtroduzca su dirección IP");
		String direccion=teclado.next();
		
		boolean gmail=patron.comprobarExpresionRegular(email, mail);
		boolean numtlf=patron.comprobarExpresionRegular(movil, tlf);
		boolean id=patron.comprobarExpresionRegular(nif, dni);
		boolean iP=patron.comprobarExpresionRegular(ip, direccion);
		
		if (gmail) {
			System.out.println("Email válido");
		} else {
			System.out.println("Email inválido");
		}
		
		if (numtlf) {
			System.out.println("Número de teléfono válido");
		} else {
			System.out.println("Número de teléfono inválido");
		}
		
		if (id) {
			System.out.println("NIF válido");
		} else {
			System.out.println("NIF inválido");
		}
		
		if (iP) {
			System.out.println("Dirección IP válida");
		} else {
			System.out.println("Dirección IP inválida");
		}

	}

}
