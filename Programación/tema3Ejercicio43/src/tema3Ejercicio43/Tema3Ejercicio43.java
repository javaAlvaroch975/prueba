package tema3Ejercicio43;
import java.util.Random;
import java.util.Scanner;
public class Tema3Ejercicio43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio=new Random();
		Scanner teclado=new Scanner(System.in);
		int numeroAleatorio=aleatorio.nextInt(50);
		int numero;
		int intentos=0; 
		do {
			intentos++;
			System.out.print("Introduce un número (0-50) ");
			numero=teclado.nextInt();
			
			if (numero>numeroAleatorio) {
				System.out.println("El número buscado es menor");
			} else  if (numero<numeroAleatorio){
				System.out.println("El número buscado es mayor");
			}
		} while ((numero!=numeroAleatorio)&&(intentos<3));
		
		if (intentos<3) {
		System.out.println("¡Felicidades! Te ha tomado "+intentos+" intentos");
		}else {
			System.out.println("Se siente, no lo has conseguido. El número era "+numeroAleatorio);
		}
	}
//El porculo que me ha dado la condición no cotiza
}
