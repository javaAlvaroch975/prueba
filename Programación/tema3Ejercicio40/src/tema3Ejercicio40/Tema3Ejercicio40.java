package tema3Ejercicio40;
import java.util.Scanner;
public class Tema3Ejercicio40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int numero=1;
		int suma=0;
		int cantidadNumeros=0;
		while (numero!=0) {
			System.out.println("Teclee un número entero");
			numero=teclado.nextInt();
			suma+=numero;
			cantidadNumeros++;
		} 
		double media=suma/cantidadNumeros;
		System.out.println("La media es "+media);
	}
// Madre mía que mareo llevaba encima al pensar esto
}
