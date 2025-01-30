package programa3PorParejas;
import java.util.Scanner;
public class Programa3PorParejas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);		
		final int COLESTEROL = 200;
		
		System.out.println("Dime tu cantidad de colesterol en sangre");
		int colesterol=teclado.nextInt();
		System.out.println("Dime tu cantidad de glucosa en sangre");
		int glucosa=teclado.nextInt();
		
		if (colesterol < COLESTEROL) {
			System.out.println("Tu colesterol es normal");
		}else {
			System.out.println("Tienes demasado colesterol");
		}
		
			if (glucosa<90) {
				System.out.println("Tu glucosa es demasiado baja");
			}else if (glucosa>150) {
				System.out.println("Tu glucosa es demasiado alta");
			}else {
				System.out.println("Tu nivel de glucosa es normal");
			}
		}
	}


