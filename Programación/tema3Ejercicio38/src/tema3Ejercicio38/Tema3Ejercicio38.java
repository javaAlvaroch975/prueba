package tema3Ejercicio38;
import java.util.Scanner;
public class Tema3Ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un número entero al que quieras llegar");
		int valor=teclado.nextInt();
		System.out.println("¿Cuánto quieres que se le sume al valor inicial?(Un número entero)");
		int salto=teclado.nextInt();
		int inicio=1;
while (inicio<=valor) {
	System.out.println(inicio);
	inicio+=salto;
}
	}

}
