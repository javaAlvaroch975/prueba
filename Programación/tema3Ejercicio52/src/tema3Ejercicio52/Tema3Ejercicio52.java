package tema3Ejercicio52;
import java.util.Scanner;
public class Tema3Ejercicio52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado = new Scanner(System.in);
			int sumaTotal=0;
			int numero=0;
			for (int contador=0;contador<7;contador++) {
				System.out.println("Introduce un número del 1 al 50");
				numero=teclado.nextInt();
				if ((numero>=1)&&(numero<=50)) {
				sumaTotal+=numero;
			}else {
				System.out.println("Número inválido, preuba otra vez");
				contador--;
			}
			}
			System.out.println("La suma de los números es "+sumaTotal);
	}

}
