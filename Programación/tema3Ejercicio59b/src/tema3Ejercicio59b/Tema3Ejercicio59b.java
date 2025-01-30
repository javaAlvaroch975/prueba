package tema3Ejercicio59b;
import java.util.Scanner;
import java.util.regex.*;
public class Tema3Ejercicio59b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
Pattern patron=Pattern.compile("^\\w+@\\w+\\.\\w{2,3}$");
//SON CONTRABARRAS, ACUÉRDATE
System.out.println("Introduzca su email");
String mail=teclado.next();
Matcher coincide=patron.matcher(mail);
if (coincide.matches()) {
	System.out.println("Correo válido");
} else {
	System.out.println("Correo inválido");
}
	}

}
