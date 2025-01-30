package tema3Ejercicio36;
import java.util.Scanner;
public class Tema3Ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int saldo=1000;
		
		System.out.println("Elija una opción");
		System.out.println("1) Consultar saldo");
		System.out.println("2) Introducir dinero");
		System.out.println("3) Extraer dinero");
		int opcion=teclado.nextInt();
		
		switch (opcion) {
		case 1: System.out.println("Tu saldo es "+saldo);
		break;
		
		case 2: System.out.println("¿Cuánto dinero quieres ingresar?");
		int dinero=teclado.nextInt();
		saldo+=dinero;
		System.out.println("El saldo actual es "+saldo);
		break;
		
		case 3: System.out.println("¿Cuánto dinero quieres extraer?");
		dinero=teclado.nextInt();
		saldo-=dinero;
		if (saldo>0) {
			System.out.println("El saldo actual es "+saldo);
		} else {
			System.out.println("Cuenta en números rojos");
		}
		break;
		
		default: System.out.println("Operación inválida");
		}

	}

}
