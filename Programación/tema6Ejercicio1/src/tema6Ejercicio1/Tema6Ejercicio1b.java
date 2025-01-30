package tema6Ejercicio1;

public class Tema6Ejercicio1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros= {7,20,13,33,78,1,49,22,38,50};	//No te olvides el = ni las comas
		int suma=0;
		for (int posicion=0;posicion<numeros.length;posicion++) {
			suma+=numeros[posicion];
			
		}
		
		System.out.println("El total de números es "+suma);
	}

}
