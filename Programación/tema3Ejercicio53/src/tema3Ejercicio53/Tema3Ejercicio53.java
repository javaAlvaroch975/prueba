package tema3Ejercicio53;
import java.util.Scanner;
public class Tema3Ejercicio53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		float mayor=0;
		float menor=10;
		int suma=0;
		int cantidad=0;
		float notaExamen=0;
		int aprobado=0;
		int suspendido=0;
		
		for (int contador=1;contador<=10;contador++) {
			System.out.println("Dime la nota de un alumno");
			notaExamen=teclado.nextFloat();
			if ((notaExamen<0)||(notaExamen>10)) {
				System.out.println("Nota inválida");
				contador--;
			//Este tipo de condiciones pueden evitarse en ciertos casos
			}else {
				cantidad++;
				suma+=notaExamen;
				if (mayor<notaExamen) {
					mayor=notaExamen;
				}
				if (menor>notaExamen) {
					menor=notaExamen;
				}
				if (notaExamen<5) {
					suspendido++;
				} else {
					aprobado++;
				}
			}
		}
		int media=suma/cantidad;
		System.out.println("La nota máxima es "+mayor);
		System.out.println("La nota mínima es "+menor);
		System.out.println("La media de los alumnos es de "+media);
		System.out.println("Han aprobado "+aprobado+" alumnos");
		System.out.println("Han suspendido "+suspendido+" alumnos");
	}

}
