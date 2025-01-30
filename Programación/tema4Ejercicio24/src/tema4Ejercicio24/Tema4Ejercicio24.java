package tema4Ejercicio24;

import java.util.Scanner;

public class Tema4Ejercicio24 {

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
	
	int dividir (int n1,int n2) throws ArithmeticException {
		int resultado;
		if (n2==0) {
			throw new ArithmeticException("No se puede dividir entre cero");
		}else {
		resultado=n1/n2; 
		return resultado;
	}
	}
	
	int calcularResto (int n1,int n2) throws ArithmeticException {
		int resultado;
		if (n2==0) {
			throw new ArithmeticException("No se puede dividir entre cero");
		}else {
		resultado=n1%n2; 
		return resultado;
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tema4Ejercicio24 calcular=new Tema4Ejercicio24();
		Scanner entrada=new Scanner(System.in);
			System.out.println("Dime el primer número");
			int num1=entrada.nextInt();			
			System.out.println("Dime el segundo número");
			int num2=entrada.nextInt();
			
			int suma=calcular.sumar(num1, num2);
			int resta=calcular.restar(num1, num2);
			int multiplicacion=calcular.mutiplicar(num1, num2);
			try {
			int division=calcular.dividir(num1, num2);
			int resto=calcular.calcularResto(num1, num2);
			System.out.println("El resultado de la división es "+division+" ");
			System.out.println("El resto de la división es "+resto+" ");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("El resultado de la suma es "+suma+" ");
			System.out.println("El resultado de la resta es "+resta+" ");
			System.out.println("El resultado de la multiplicación es "+multiplicacion+" ");

	}
}
