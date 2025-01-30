package entregaTarea1;
import java.util.Scanner;
public class EntregaTarea1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("¿Cuál es la nota del examen del alumno?(0-10)");
		float nota=teclado.nextFloat();
		System.out.println("¿El alumno ha entregado el trabajo? (0=no, 1=sí)");
		int trabajo=teclado.nextInt();
		
		if ((nota>=5)||((nota>4)&&(trabajo==1))) {
			System.out.println("El alumno ha aprobado");
		} else {
			System.out.println("El alumno ha suspendido");
		}
	}

}
