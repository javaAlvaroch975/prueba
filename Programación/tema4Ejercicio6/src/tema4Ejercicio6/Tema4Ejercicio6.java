package tema4Ejercicio6;
import java.util.Scanner;
public class Tema4Ejercicio6 {
	
	boolean real (double a, double b, double c) {
	boolean numreal;
	if (b*b-4*a*c<0) {
		numreal=false;
	} else {
		numreal=true;
	}
	return numreal;
	}
	
	double ec2gradosuma (double a, double b, double c) {
			double resultado= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			return resultado;
	}
	
	double ec2gradoresta (double a, double b, double c) {
		double resultado= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		return resultado;
}

	public static void main (String[]args) {
		Scanner teclado=new Scanner(System.in);
		Tema4Ejercicio6 comprobante=new Tema4Ejercicio6();
		Tema4Ejercicio6 calculo=new Tema4Ejercicio6();
		
		System.out.println("Introduce el primer número");
		double a=teclado.nextDouble();
		System.out.println("Introduce el segundo número");
		double b=teclado.nextDouble();
		System.out.println("Introduce el tercer número");
		double c=teclado.nextDouble();
		
		boolean comprobacion=comprobante.real(a, b, c);
		
		if (!comprobacion) {
			System.out.println("No se puede calcular, el resultado no es real");
		} else {
			
			double ec2gradopositivo=calculo.ec2gradosuma(a, b, c);
			double ec2gradonegativo=calculo.ec2gradoresta(a, b, c);
			
			//La fórmula es más fácil de entender en vertical, la verdad
			
			System.out.println("La solución 1 a la ecuación es "+String.format("%.3f", ec2gradopositivo));
			System.out.println("La solución 2 a la ecuación es "+String.format("%.3f", ec2gradonegativo));
		}

	}

}
