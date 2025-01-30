package tema3Ejercicio62;
import java.util.Scanner;
import java.util.regex.*;
public class Tema3Ejercicio62a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
Pattern cuenta = Pattern.compile("ES\\d{2}-\\d{4}-\\d{4}-\\d{2}-\\d{10}$");

System.out.println("Introduzca su número de cuenta");
String numCuenta =teclado.nextLine();

Matcher coincide = cuenta.matcher(numCuenta);

if (coincide.matches()) {
	System.out.println("Cuenta válida");
}else {
	System.out.println("Cuenta inválida");
}
	}

}
