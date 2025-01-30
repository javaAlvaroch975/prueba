package tema3Ejercicio24;
import java.util.Scanner;
public class Tema3Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int entero=teclado.nextInt();
		
		if ((entero%2)==0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}

}
