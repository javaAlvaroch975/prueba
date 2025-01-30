package tema3Ejercicio47;
import java.util.Scanner;
public class Tema3Ejercicio47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un número entero al que quieras llegar");
		int valor=teclado.nextInt();
		System.out.println("¿Cuánto quieres que se le sume al valor inicial?(Un número entero)");
		int salto=teclado.nextInt();

for (int inicio=1;inicio<=valor;inicio+=salto) {
	System.out.println(inicio);
}
	}

}
