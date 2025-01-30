package tema6Ejercicio1;

import java.util.Random;

public class Tema6Ejercicio1e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio=new Random();
		
		int [] numeros= new int [10];	
		
		for (int pos=0;pos<numeros.length;pos++) {
			numeros[pos]=aleatorio.nextInt(0, 50);	
		}
		
		for (int posicion=0;posicion<numeros.length;posicion++) {
				System.out.print("Numero: "+numeros[posicion]+" ");
				System.out.print("Cuadrado: "+numeros[posicion]*numeros[posicion]+" ");
				System.out.println("Cubo: "+numeros[posicion]*numeros[posicion]*numeros[posicion]);
		}
	}
	
}
