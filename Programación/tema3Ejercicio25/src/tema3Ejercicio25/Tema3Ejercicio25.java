package tema3Ejercicio25;
import java.util.Scanner;
public class Tema3Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un año");
		int anyo=teclado.nextInt();
		int resto100=anyo%100;
		int resto4=anyo%4;
		int resto400=anyo%400;
		
		if (((resto100!=0) && (resto4==0))||(resto400==0)){
			//Más te vale acordarte de esta
			System.out.println("El año es bisiesto");
		} else {
				System.out.println("El año no es bisiesto");
			}
	}

}
