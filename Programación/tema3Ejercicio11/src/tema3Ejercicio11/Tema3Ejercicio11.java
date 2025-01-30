package tema3Ejercicio11;
import java.util.Scanner;

public class Tema3Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame una cantidad de segundos");
		float segundos=teclado.nextInt();
		float minutos=segundos/60;
		float horas=minutos/60;
		float dias=horas/24;
		
		//Se puede usar un int o un float dependiendo de la precisión que quieras tener a la hora de calcular
		
		System.out.println(segundos+" segundos son:");
		System.out.println(minutos+" minutos");
		System.out.println(horas+" horas");
		System.out.println(dias+" días");
	}

}
