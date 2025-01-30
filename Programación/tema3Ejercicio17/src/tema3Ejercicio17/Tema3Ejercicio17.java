package tema3Ejercicio17;
import java.util.Scanner;
public class Tema3Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el tamaño del fichero en MB");
		double tamanyo=teclado.nextInt();
		System.out.println("Introduce el tamaño ya descargado en MB");
		double descargado=teclado.nextInt();
		System.out.println("Introduce la velocidad de descarga en MB/s");
		double velocidad=teclado.nextInt();
		
		double porcentaje=descargado/tamanyo*100;
		
		//Grábate esta puta fórmula a fuego
		
		double tiempo=(tamanyo-descargado)/velocidad;
		
		System.out.println("El archivo lleva un "+porcentaje+"% de descarga");
		System.out.println("El archivo se descargará en "+tiempo+" segundos");
	}

}
