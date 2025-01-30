package tema6Ejercicio1;
import java.util.Scanner;
public class Tema6Ejercicio1c {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int [] numeros = new int [10];
		for (int array=0;array<numeros.length;array++) {
		System.out.println("Introduce un valor");
		int valor = teclado.nextInt();
		numeros[array]=valor;
		}
		int suma=0;
		for (int posicion=0;posicion<numeros.length;posicion++) {
			suma+=numeros[posicion];
		}
		
		System.out.println("El total de números es "+suma);
	}
	
}
