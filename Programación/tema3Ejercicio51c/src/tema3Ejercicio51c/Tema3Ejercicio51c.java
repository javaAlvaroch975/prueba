package tema3Ejercicio51c;
import java.util.Scanner;
public class Tema3Ejercicio51c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra = teclado.next();
		int longitud=palabra.length();
		int aes=0;
		int es=0;
		int ies=0;
		int oes=0;
		int ues=0;
		char letra='b';
		for (int posicion=0;posicion<longitud;posicion++) {
			letra = palabra.charAt(posicion);
			//Recordatorio, es importante poner breaks, de lo contrario se desmadra todo
			switch (letra) {
			case 'a' , 'A' : aes++;
			break;
			case 'e' , 'E' : es++;
			break;
			case 'i' , 'I' : ies++;
			break;
			case 'o' , 'O' : oes++;
			break;
			case 'u' , 'U' : ues++;
			break;
			}
		}
		System.out.println("Hay "+aes+" aes, "+es+" es, "+ies+" ies, "+oes+" oes y "+ues+" ues en la palabra");
	}

}
