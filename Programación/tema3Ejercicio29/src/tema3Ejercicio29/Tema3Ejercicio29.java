package tema3Ejercicio29;
import java.util.Scanner;
public class Tema3Ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce tu peso en Kilogramos");
		float peso=teclado.nextFloat();
		System.out.println("Introduce tu altura en metros");
		float altura=teclado.nextFloat();
		
		float imc= peso/(altura*altura);
		
		if (imc<18.5) {
			System.out.println("Tu peso es demasiado bajo, tu índice de masa corporal es del "+imc+"%");
		} else if (imc<25) {
			System.out.println("Tu peso es normal, tu índice de masa corporal es del "+imc+"%");
		} else if (imc<30) {
			System.out.println("Tienes sobrepeso, tu índice de masa corporal es del "+imc+"%");
		} else {
			System.out.println("Tienes obesidad, tu índice de masa corporal es del "+imc+"%");
		}
	}
	//Pues mira, con todo lo que como y tengo el índice normal, impresionante
}
