package tema4Ejercicio1b;
import java.util.Scanner;

public class Tema4Ejercicio1b {

	int calcular (int n1,int n2, int opcion) {
		int resultado=0;
		switch (opcion) {
		
		case 1:
		int resultadoSuma;
		resultadoSuma=n1+n2;
		resultado=resultadoSuma;
		break;
	
		case 2:
		int resultadoResta;
		resultadoResta=n1-n2;
		resultado=resultadoResta;
		break;
		
		case 3:
		int resultadoMultiplicacion;
		resultadoMultiplicacion=n1*n2;
		resultado=resultadoMultiplicacion;
		break;
		
		case 4:
		int resultadoDivision;
		resultadoDivision=n1/n2;
		resultado=resultadoDivision;
		break;
	
		case 5:
		int resultadoResto;
		resultadoResto=n1%n2;
		resultado=resultadoResto;
		break;
		
		default:
		resultado=0;
		break;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tema4Ejercicio1b calcular=new Tema4Ejercicio1b();
		Scanner entrada=new Scanner(System.in);
			System.out.println("Dime el primer número");
			int num1=entrada.nextInt();			
			System.out.println("Dime el segundo número");
			int num2=entrada.nextInt();
			System.out.println("¿Qué operación quieres hacer?");
			System.out.println("1 → Suma");
			System.out.println("2 → Resta");
			System.out.println("3 → Multiplicación");
			System.out.println("4 → División");
			System.out.println("5 → Resto");
			int opcion=entrada.nextInt();
			
			int calculo=calcular.calcular(num1, num2, opcion);
			
			System.out.println("El resultado del cálculo es "+calculo+" ");
	}

}
