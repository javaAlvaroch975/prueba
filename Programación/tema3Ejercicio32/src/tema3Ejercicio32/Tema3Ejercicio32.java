package tema3Ejercicio32;
import java.util.Scanner;
public class Tema3Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el número de seguidores");
		int seguidores=teclado.nextInt();
		System.out.println("Introduce 1 si el botón dice 'seguir', introduce 0 si el botón dice 'dejar de seguir' ");
		int boton=teclado.nextInt();
		
		if ((boton<0||boton>1)) {
			System.out.println("Número de botón inválido");
		} else if (boton==1) {
			seguidores++;
			boton--;
			System.out.println("La cuenta tiene "+seguidores);
			System.out.println("El estado del boton es "+boton);
		} else {
			seguidores--;
			boton++;
			System.out.println("La cuenta tiene "+seguidores);
			System.out.println("El estado del boton es "+boton);
		}
	}

}
