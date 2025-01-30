package tema4Ejercicio22;

import java.util.Scanner;

public class Tema4Ejercicio22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
			System.out.println("Dime el primer número");
			int num1=entrada.nextInt();
						
			System.out.println("Dime el segundo número");
			int num2=entrada.nextInt();
			int suma=num1+num2;
			int resta=num1-num2;
			int multiplicacion=num1*num2;
			try {
			int division=num1/num2;
			 int resto=num1%num2;
				System.out.println("El resultado de la división es "+division+" ");
				System.out.println("El resto de la división es "+resto+" ");
			}catch (Exception e){
			System.out.println("No se puede dividir por cero");	
			}
			
			System.out.println("El resultado de la suma es "+suma+" ");
			System.out.println("El resultado de la resta es "+resta+" ");
			System.out.println("El resultado de la multiplicación es "+multiplicacion+" ");

	}
}
