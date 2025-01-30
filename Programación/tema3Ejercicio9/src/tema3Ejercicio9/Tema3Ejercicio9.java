package tema3Ejercicio9;
import java.util.Scanner;

// Esto se pone sí o sí

public class Tema3Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		//Esto de aquí arriba también es obligatorio
		
			System.out.println("Dime el primer número");
			int num1=entrada.nextInt();
			
			//Tienes que poner el tipo como si fuera el atributo de un objeto
			
			System.out.println("Dime el segundo número");
			int num2=entrada.nextInt();
			int suma=num1+num2;
			int resta=num1-num2;
			int multiplicacion=num1*num2;
			int division=num1/num2;
			int resto=num1%num2;
			
			//Guardarlo todo en variables nos ahorra muchos problemas... Tenlo en cuenta, yo del futuro
			
			System.out.println("El resultado de la suma es "+suma+" ");
			System.out.println("El resultado de la resta es "+resta+" ");
			System.out.println("El resultado de la multiplicación es "+multiplicacion+" ");
			System.out.println("El resultado de la división es "+division+" ");
			System.out.println("El resto de la división es "+resto+" ");
	}

}
