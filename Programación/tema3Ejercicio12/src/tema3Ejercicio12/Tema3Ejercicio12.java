package tema3Ejercicio12;
import java.util.Scanner;

public class Tema3Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el número de seguidores");
		float seguidores=teclado.nextInt();
		float abreviado=seguidores/1000;
		System.out.println("Tienes "+String.format("%.1f", abreviado)+"K seguidores");
		
		//String format limita el número de decimales de un argumento en concreto en función del número al lado de "f"
	}

}
