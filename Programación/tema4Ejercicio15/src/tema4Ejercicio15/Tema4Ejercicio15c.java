package tema4Ejercicio15;

import java.util.Scanner;

public class Tema4Ejercicio15c {
	
	static void repetirNum (int ultimo) {
		int primero=1;
		while (primero<=ultimo) {
			System.out.println(primero);
			primero++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un número entero al que quieras llegar");
		int valor=teclado.nextInt();

		Tema4Ejercicio15c.repetirNum(valor);
	}
	}


