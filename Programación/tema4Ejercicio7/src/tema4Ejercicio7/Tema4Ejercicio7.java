package tema4Ejercicio7;
import java.util.Scanner;
public class Tema4Ejercicio7 {
	
	void repetirNum (int ultimo) {
		int primero=1;
		while (primero<=ultimo) {
			System.out.println(primero);
			primero++;
		}
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner teclado=new Scanner(System.in);
			Tema4Ejercicio7 bucle=new Tema4Ejercicio7();
			System.out.println("Introduce un número entero al que quieras llegar");
			int valor=teclado.nextInt();

			bucle.repetirNum(valor);
		}

	}

	


