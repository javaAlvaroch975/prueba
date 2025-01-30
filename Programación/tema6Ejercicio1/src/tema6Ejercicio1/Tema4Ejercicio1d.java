package tema6Ejercicio1;
import java.util.Random;
public class Tema4Ejercicio1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio=new Random();
		
		int [] numeros= new int [10];	
		
		for (int pos=0;pos<numeros.length;pos++) {
			numeros[pos]=aleatorio.nextInt(0, 50);	
		}
		
		int suma=0;
		for (int posicion=0;posicion<numeros.length;posicion++) {
			suma+=numeros[posicion];	
		}
		
		System.out.println("El total de números es "+suma);
	}
	
}
