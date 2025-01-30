package programa2PorParejas;

import java.util.Scanner;
import java.util.regex.*;

public class Programa2PorParejas {

	public static void main(String[] args) {
		final int ANYOACTUAL = 2024;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime tu nombre ");
		String nombre = sc.next();

		System.out.println("Dime tu apellido ");
		String apellido = sc.next();

		System.out.println("Dime tu fecha de nacimiento ");
		int nacimiento = sc.nextInt();

		Pattern pat = Pattern.compile("^[A-Z][a-z]+$");

		Matcher mat1 = pat.matcher(nombre);
		if (mat1.matches()) {
			Matcher mat2 = pat.matcher(apellido);
			if (mat2.matches()) {
				if ((nacimiento < ANYOACTUAL) && (nacimiento > 1910)) {
					for (int i = 0; i < 3; i++) {
						System.out.print(nombre.charAt(i));
					}

					for (int j = 0; j < 3; j++) {
						System.out.print(apellido.charAt(j));
					}
					System.out.print(ANYOACTUAL - nacimiento);
				} else {
					System.out.println("Año inválido");
				}
			} else {
				System.out.println("El apellido no cumple el patrón");
			}
		} else {
			System.out.println("El nombre no cumple el patrón");
		}

	}

}
