package tema6Ejercicio9;

import java.util.Random;

public class Tema6Ejercicio9a {

	static final int FILAS = 5;
	static final int COLUMNAS = 2;

	static void mostrarMatrizEnteros(String nomMatriz, int[][] m) {
		System.out.println("Matriz " + nomMatriz);
		for (int[] n : m) {
			for (int x : n) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat1 = new int[FILAS][COLUMNAS];
		int[][] mat2 = new int[FILAS][COLUMNAS];
		Random azar = new Random();
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j] = azar.nextInt(20);
			}
		}
		mostrarMatrizEnteros("mat1", mat1);
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				mat2[i][j] = mat1[i][j] * 2;
			}
		}
		mostrarMatrizEnteros("mat2", mat2);
	}

}
