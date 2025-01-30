package tema3Ejercicio35;
import java.util.Scanner;
public class Tema3Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introcude el número del mes (1-12)");
		int mes=teclado.nextInt();
		int dias=0;
		switch (mes) {
		case 1,3,5,7,8,10,12:  dias=31 ;
		break;
		case 4,6,9,11: dias=30;
		break;
		case 2: dias=28; break;
		default: System.out.println("Número inválido");
		}
		System.out.println("El mes tiene "+dias+" días");
	}

}
