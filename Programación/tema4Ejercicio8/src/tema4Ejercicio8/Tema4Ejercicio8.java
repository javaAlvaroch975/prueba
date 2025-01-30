package tema4Ejercicio8;
import java.util.Scanner;
public class Tema4Ejercicio8 {

	int bucle (String palabra) {
		int numVocales=0;
		for (int i=0;i<palabra.length();i++) {
			switch (palabra.charAt(i)) {
			case 'a' , 'e' , 'i' , 'o' , 'u' , 'A' , 'E' , 'I' , 'O' , 'U': numVocales++;
			}	
		}			
		return numVocales;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Tema4Ejercicio8 repeticion=new Tema4Ejercicio8();
		System.out.println("Introduce una palabra");
			String palabra = teclado.next();
			int vocales=repeticion.bucle(palabra);	//Aparentemente solo se pueden seleccionar los tipos especificados en el método
			System.out.println("Hay "+vocales+" vocales en la palabra");
	}
	}
