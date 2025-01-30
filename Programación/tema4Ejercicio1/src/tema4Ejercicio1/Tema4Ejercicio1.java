package tema4Ejercicio1;
import java.util.Scanner;

public class Tema4Ejercicio1 { //Ahora sí que se meten más cosas aquí
	
	int sumar (int n1,int n2) {
		int resultado;
		resultado=n1+n2;
		return resultado;
	}
	
	int restar (int n1,int n2) {
		int resultado;
		resultado=n1-n2;
		return resultado;
	}
	
	int mutiplicar (int n1,int n2) {
		int resultado;
		resultado=n1*n2;
		return resultado;
	}
	
	int dividir (int n1,int n2) {
		int resultado;
		resultado=n1/n2;
		return resultado;
	}
	
	int calcularResto (int n1,int n2) {
		int resultado;
		resultado=n1%n2;
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tema4Ejercicio1 calcular=new Tema4Ejercicio1();
		Scanner entrada=new Scanner(System.in);
			System.out.println("Dime el primer número");
			int num1=entrada.nextInt();			
			System.out.println("Dime el segundo número");
			int num2=entrada.nextInt();
			
			int suma=calcular.sumar(num1, num2);
			int resta=calcular.restar(num1, num2);
			int multiplicacion=calcular.mutiplicar(num1, num2);
			int division=calcular.dividir(num1, num2);
			int resto=calcular.calcularResto(num1, num2);
			
			System.out.println("El resultado de la suma es "+suma+" ");
			System.out.println("El resultado de la resta es "+resta+" ");
			System.out.println("El resultado de la multiplicación es "+multiplicacion+" ");
			System.out.println("El resultado de la división es "+division+" ");
			System.out.println("El resto de la división es "+resto+" ");
	}


	}


