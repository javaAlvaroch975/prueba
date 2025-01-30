package tema3Ejercicio52c;
import java.util.Scanner;
public class tema3Ejercicio52c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int sumaTotal=0;
		int numero=0;
		int mayor=0;
		int menor=50;
		for (int contador=0;contador<7;contador++) {
			System.out.println("Introduce un número del 1 al 50");
			numero=teclado.nextInt();
			if (mayor<numero) {
				mayor=numero;
			}
			if (menor>numero) {
				menor=numero;
			}
			if ((numero>=1)&&(numero<=50)) {
			sumaTotal+=numero;
		}else {
			System.out.println("Número inválido, preuba otra vez");
			contador--;
		}
		}
		System.out.println("La suma de los números es "+sumaTotal);
		System.out.println("El mayor de los números es "+mayor);
		System.out.println("El menor de los números es "+menor);
	}

}
