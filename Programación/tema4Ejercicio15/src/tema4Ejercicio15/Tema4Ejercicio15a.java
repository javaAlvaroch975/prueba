package tema4Ejercicio15;

import java.util.Scanner;

public class Tema4Ejercicio15a {

	static int sumar (int n1,int n2) {
		int resultado;
		resultado=n1+n2;
		return resultado;
	}
	
	static int restar (int n1,int n2) {
		int resultado;
		resultado=n1-n2;
		return resultado;
	}
	
	static int mutiplicar (int n1,int n2) {
		int resultado;
		resultado=n1*n2;
		return resultado;
	}
	
	static int dividir (int n1,int n2) {
		int resultado;
		resultado=n1/n2;
		return resultado;
	}
	
	static int calcularResto (int n1,int n2) {
		int resultado;
		resultado=n1%n2;
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
			System.out.println("Dime el primer número");
			int num1=entrada.nextInt();			
			System.out.println("Dime el segundo número");
			int num2=entrada.nextInt();
			
			int suma=Tema4Ejercicio15a.sumar(num1, num2);
			int resta=Tema4Ejercicio15a.restar(num1, num2);
			int multiplicacion=Tema4Ejercicio15a.mutiplicar(num1, num2);
			int division=Tema4Ejercicio15a.dividir(num1, num2);
			int resto=Tema4Ejercicio15a.calcularResto(num1, num2);
			
			System.out.println("El resultado de la suma es "+suma+" ");
			System.out.println("El resultado de la resta es "+resta+" ");
			System.out.println("El resultado de la multiplicación es "+multiplicacion+" ");
			System.out.println("El resultado de la división es "+division+" ");
			System.out.println("El resto de la división es "+resto+" ");
	}

}
