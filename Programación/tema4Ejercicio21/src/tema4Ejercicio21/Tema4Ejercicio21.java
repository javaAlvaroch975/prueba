package tema4Ejercicio21;

import java.util.Scanner;
enum Valoracion {MUY_DEFICIENTE, INSUFICIENTE,SUFICIENTE,BIEN,NOTABLE,SOBRESALIENTE,MATRICULA_DE_HONOR,INVALIDA }
public class Tema4Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la nota del alumno (0-10)");
		int nota=teclado.nextInt();
		Valoracion v;
		switch (nota) {
		case 0,1, 2:	v=Valoracion.MUY_DEFICIENTE;
		break;
		
		case 3,4:	v=Valoracion.INSUFICIENTE;
		break;
		
		case 5:	v=Valoracion.SUFICIENTE;
		break;
		
		case 6:	 v=Valoracion.BIEN;
		break;
		
		case 7, 8: 	v=Valoracion.NOTABLE;
		break;
		
		case 9: 	v=Valoracion.SOBRESALIENTE;
		break;
		
		case 10:	v=Valoracion.MATRICULA_DE_HONOR;
		break;
		default: v=Valoracion.INVALIDA;
		}
		System.out.println("La valoración es "+v);
	}
}


