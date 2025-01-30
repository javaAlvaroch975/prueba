package tema3Ejercicio14;
import java.util.Scanner;

public class Tema3Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce el precio del objeto para aplicar el descuento");
		float precio=teclado.nextFloat();
		System.out.println("Introduce el descuento");
		
		//Todo es cuestión de añadir variables o datos a introducir
		float porcentaje=teclado.nextFloat();
		float descuento=(precio*porcentaje)/100;
		//Como es el caso del área entre comentarios
		
		float preciofinal=precio-descuento;
		System.out.println("El precio a pagar es de "+String.format("%.2f", preciofinal)+"€");
		
	}

}
