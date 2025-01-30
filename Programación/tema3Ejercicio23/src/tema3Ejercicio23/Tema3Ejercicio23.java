package tema3Ejercicio23;
import java.util.Scanner;
public class Tema3Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		int edad=teclado.nextInt();
		
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}
	//Hay que tener pies de plomo con estas llaves...
}
