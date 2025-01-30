package tema6Ejercicio1;

public class Tema6Ejercicio1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros= {7,20,13,33,78,1,49,22,38,50};	//No te olvides el = ni las comas
		int total=0;
		for (int suma:numeros) {
			total+=suma;
		}
		
		System.out.println("El total de números es "+total);
	}

}
