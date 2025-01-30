package tema3Ejercicio60;
import java.util.Scanner;
import java.util.regex.*;
public class Tema3Ejercicio60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Pattern email=Pattern.compile("^\\w+@\\w+\\.\\w{2,3}$");
		Pattern movil=Pattern.compile("^[67]\\d{8}$");
		Pattern nif=Pattern.compile("^\\d{8,9}[A-Z]$");
		Pattern ip=Pattern.compile("^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])$");
		System.out.println("Indtroduzca su email");
		String mail=teclado.next();
		System.out.println("Indtroduzca su número de teléfono");
		String tlf=teclado.next();
		System.out.println("Indtroduzca su NIF");
		String dni=teclado.next();
		System.out.println("Indtroduzca su dirección IP");
		String direccion=teclado.next();
		
		Matcher gmail=email.matcher(mail);
		Matcher numtlf=movil.matcher(tlf);
		Matcher id=nif.matcher(dni);
		Matcher iP=ip.matcher(direccion);
		
		if (gmail.matches()) {
			System.out.println("Email válido");
		} else {
			System.out.println("Email inválido");
		}
		
		if (numtlf.matches()) {
			System.out.println("Número de teléfono válido");
		} else {
			System.out.println("Número de teléfono inválido");
		}
		
		if (id.matches()) {
			System.out.println("NIF válido");
		} else {
			System.out.println("NIF inválido");
		}
		
		if (iP.matches()) {
			System.out.println("Dirección IP válida");
		} else {
			System.out.println("Dirección IP inválida");
		}
				}

}
