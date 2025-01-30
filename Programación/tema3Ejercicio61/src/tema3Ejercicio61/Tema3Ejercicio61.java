package tema3Ejercicio61;
import java.util.Scanner;
import java.util.regex.*;
public class Tema3Ejercicio61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Pattern contrasenya= Pattern.compile("^[a-zA-Z0-9]{8,}");
		//La verdadera fórmula es un dolor de cabeza
		System.out.println("Introduzca una contraseña con mínimo 8 caracteres, una mayúscula y un número");
		String passwd=teclado.next();
		
		Matcher coincide=contrasenya.matcher(passwd);
		
		if (coincide.matches()) {
			System.out.println("Contraseña válida");
		} else {
			System.out.println("Contraseña inválida");
		}
	}

}
