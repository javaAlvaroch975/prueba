package tema3Ejercicio59a;
import java.util.Scanner;
import java.util.regex.*;
public class Tema3Ejercicio59a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
	Pattern patron=Pattern.compile("^a...m$");
	//Nota mental, NO PONGAS NEW
	System.out.println("Introduce una cadena de 5 caracteres que comience en a y acabe en m");
		String cadena=teclado.next();
		Matcher coincide=patron.matcher(cadena);
		if (coincide.matches()) {
			System.out.println("Cadena válida");
		} else {
			System.out.println("Cadena inválida");
		}
	}

}
