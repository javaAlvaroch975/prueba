package tema3Ejercicio34;
import java.util.Scanner;
public class Tema3Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la nota del alumno (0-10)");
		int nota=teclado.nextInt();
		
		//Así funciona un switch? Parece fácil
		switch (nota) {
		case 0:
		case 1:
		case 2:	System.out.println("Muy deficiente");
			break;
		case 3:
		case 4:	System.out.println("Insuficiente");
		break;
		case 5:	System.out.println("Suficiente");
		break;
		case 6:	 System.out.println("Bien");
		break;
		case 7:
		case 8: 	System.out.println("Notable");
		break;
		case 9: 	System.out.println("Sobresaliente");
		break;
		case 10:	System.out.println("Matrícula de honor");
		break;
		default: System.out.println("Nota inválida");
		}
	}

}
