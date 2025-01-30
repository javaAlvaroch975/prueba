package tema4Ejercicio4;
import java.util.Scanner;
public class Tema4Ejercicio4 {
	
	boolean calcularMayoriaEdad (int edad) {

		if (edad>=18) { //Vendrá bien aprender esto
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Tema4Ejercicio4 calcular=new Tema4Ejercicio4();
		
		System.out.println("Introduce tu edad");
		int edad=teclado.nextInt();
		
		boolean comprobante=calcular.calcularMayoriaEdad(edad);
		
		if (comprobante) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		

	}

}
