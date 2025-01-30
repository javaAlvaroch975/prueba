package entrega1;
import java.util.Scanner;
public class Entrega1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int sueldo=1000;
		int pago=10;
		System.out.println("¿Cuántos productos ha vendido?");
		int ventas=teclado.nextInt();
		
		if (ventas>20) {
			 pago=13;
		} 
		int ganancias=pago*ventas;
		sueldo+=ganancias;
		
		System.out.println("¿Cuántos días ha faltado?");
		int faltas=teclado.nextInt();
		
		if (faltas>5) {
			sueldo=sueldo-sueldo*15/100;
		}
		System.out.println("El sueldo mensual del empleado es "+sueldo);
	}

}
