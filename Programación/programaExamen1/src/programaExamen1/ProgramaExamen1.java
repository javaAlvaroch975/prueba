package programaExamen1;
import java.util.Scanner;
public class ProgramaExamen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String cadena1;
		String cadena2;
		
		System.out.println("Introduce una cadena");
		cadena1=teclado.next();
		System.out.println("Introduce otra cadena");
		cadena2=teclado.next();
		
		if (cadena2.length()<=5) {
			System.out.print(cadena1.charAt(0)+", ");
			System.out.print(cadena1.charAt(cadena1.length()-1)+", ");	//Esto es para que imprima el último carácter, ya que length es mayor al número de la última posición
			System.out.print(cadena2.charAt(0)+", ");
			System.out.print(cadena2.charAt(cadena2.length()-1));
		}else {
			System.out.print(cadena1.charAt(1)+", ");
			System.out.print(cadena1.charAt(cadena1.length()-2));		//Esto es lo mismo, pero para la penúltima posición
		}
	}

}
