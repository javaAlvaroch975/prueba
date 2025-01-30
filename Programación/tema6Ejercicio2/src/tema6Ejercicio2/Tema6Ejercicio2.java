package tema6Ejercicio2;
import java.util.Scanner;
public class Tema6Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
String []palabras = new String[7];
System.out.println("Introduce 7 palabras");
	for (int pos=0;pos<palabras.length;pos++) {
		palabras[pos]=teclado.next();
	}
	
	for (String palabra:palabras) {
		System.out.println(palabra+" tiene "+palabra.length()+" letras");
	}
	
	}

}
