package tema3Ejercicio37;
import java.util.Scanner;
public class Tema3Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int precio=0;
		System.out.println("¿Cuántas personas se van a alojar?");
		int personas=teclado.nextInt();
		System.out.println("¿Cuántas noches se van a alojar?");
		int noches=teclado.nextInt();
		System.out.println("¿Quiere desayuno? (1=sí, 0=no)");
		int desayuno=teclado.nextInt();
		int precioDesayuno=20;
		
		switch (personas) {
		case 1: precio=80; 		
					break;
					
		case 2: precio=150;
					break;
					
		case 3: precio=200;
					break;
					
		default: System.out.println("Operación inválida");
		}
		precio*=noches;
		if (desayuno==1) {
			precio=precio+precioDesayuno*noches;
			//Nota de programador, lo que sea igual se va fuera
		}
		System.out.println("El cobro total asciende a "+precio+"€");
	}

}
