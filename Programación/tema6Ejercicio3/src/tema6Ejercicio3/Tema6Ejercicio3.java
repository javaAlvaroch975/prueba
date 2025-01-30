package tema6Ejercicio3;

import java.util.Random;

public class Tema6Ejercicio3 {

	public static void imprimirArrayEnteros(String nomArray, int[] numeros) {
		System.out.print("Contenido del array " + nomArray + ": ");
		for (int num : numeros) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		int[] notas = new int[20];
		int[] estadisticas = new int[11];

		for (int i = 0; i < notas.length; i++) {
			notas[i] = r.nextInt(0, 10);

		}
		imprimirArrayEnteros("notas", notas);

		for (int nota : notas) {		//Este for each lee lo que hay en cada posición de notas,
			estadisticas[nota]++;		//En base a ello se incrementa el valor de la posición correspondiente en estadísticas.
		}

		for (int i = 0; i < estadisticas.length; i++) {

			System.out.println(estadisticas[i] + " personas han sacado un " + i);

		}
	}

}
