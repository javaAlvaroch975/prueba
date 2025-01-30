package tema3Ejercicio33;
import java.util.Scanner;
public class Tema3Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la facturación de la maleta en Kilogramos (10Kg, 20Kg o 25Kg)");
		int facturacion=teclado.nextInt();
		System.out.println("Introduce el peso de tu maleta");
		int peso=teclado.nextInt();
		int pagoExtra=12;
		int diferencia=peso-facturacion;
		
		if (peso<facturacion) {
			System.out.println("No tiene que pagar");
		} else {
			System.out.println("Tiene que pagar "+pagoExtra*diferencia+"€");
		}
	}

}
