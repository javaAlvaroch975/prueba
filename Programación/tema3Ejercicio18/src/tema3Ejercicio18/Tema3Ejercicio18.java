package tema3Ejercicio18;
import java.util.Scanner;
public class Tema3Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el primer número");
		double a=teclado.nextDouble();
		System.out.println("Introduce el segundo número");
		double b=teclado.nextDouble();
		System.out.println("Introduce el tercer número");
		double c=teclado.nextDouble();
		
		double ec2gradosuma=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		double ec2gradoresta=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		
		//La fórmula es más fácil de entender en vertical, la verdad
		
		System.out.println("La solución 1 a la ecuación es "+String.format("%.3f", ec2gradosuma));
		System.out.println("La solución 2 a la ecuación es "+String.format("%.3f", ec2gradoresta));
	}

}
