package tema3Ejercicio41;
import java.util.Scanner;
public class Tema3Ejercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero;
		int pares=0;
		int impares=0;
		
		do {
			
			System.out.println("Teclee un número entero");
			numero=teclado.nextInt();
			
			if (numero%2==0) {
				pares+=numero;
			}else {
				impares+=numero;
			}
		} while(numero!=0);
		System.out.println("Los numeros impares suman "+impares);
		System.out.println("Los números pares suman "+pares);
	}

}
