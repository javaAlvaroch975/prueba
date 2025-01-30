package repeticionCadena;
import java.util.Scanner;
public class RepeticionCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca una palabra");
		String palabra=teclado.next();
		
		for (int i=0;i<=palabra.length();i++) {
			for (int j=0;j<i;j++) {
			System.out.print(palabra.charAt(j));
			}
			System.out.println("");
		}
	}

}
