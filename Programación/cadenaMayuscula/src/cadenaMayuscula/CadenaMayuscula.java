package cadenaMayuscula;
import java.util.Scanner;
import java.util.regex.*;
public class CadenaMayuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
Pattern patron= Pattern.compile("^[A-Z]+$");

System.out.println("Escribe una palabra en mayúsculas");
String cadena=teclado.next();

Matcher mayuscula= patron.matcher(cadena);

if (mayuscula.matches()) {
	for (int i=0;i<=cadena.length()-1;i++) {
		if (i%2==0) {
			System.out.println(cadena.charAt(i));
		}
	}
}else {
	System.out.println("Error");
}
	}

}
