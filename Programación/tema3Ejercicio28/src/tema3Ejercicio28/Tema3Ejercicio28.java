package tema3Ejercicio28;

import java.util.Scanner;

public class Tema3Ejercicio28 {

	public static void main (String[]args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el primer número");
		double a=teclado.nextDouble();
		System.out.println("Introduce el segundo número");
		double b=teclado.nextDouble();
		System.out.println("Introduce el tercer número");
		double c=teclado.nextDouble();
		
		if (b*b-4*a*c<0) {
			System.out.println("No se puede calcular, el resultado no es real");
		} else {
			
			double ec2gradosuma=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
			double ec2gradoresta=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
			
			//La fórmula es más fácil de entender en vertical, la verdad
			
			System.out.println("La solución 1 a la ecuación es "+String.format("%.3f", ec2gradosuma));
			System.out.println("La solución 2 a la ecuación es "+String.format("%.3f", ec2gradoresta));
		}
		
		//Vale, eso de tener que meter la parte tocha del código en el else me va a pasar más veces, verdad?
	}


	}
	

