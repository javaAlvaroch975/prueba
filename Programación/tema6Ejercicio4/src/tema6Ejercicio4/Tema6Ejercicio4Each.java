package tema6Ejercicio4;
import java.util.Random;
public class Tema6Ejercicio4Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio= new Random();
		int []numeros= new int [30];
		
		for (int pos=0;pos<numeros.length;pos++) {
			numeros[pos]=aleatorio.nextInt(0, 100);
		}
		int escritor=0;
		int []pares= new int [30];
		for (int posicion=0;posicion<pares.length;posicion++) {
			
			if (numeros[posicion]%2==0) {
				pares[escritor]=numeros[posicion];
				escritor++;
			}
		}
		
		for (int position=0;position<escritor;position++) {
			System.out.println(pares[position]);
		}
		
	}
	
}
