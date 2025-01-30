package tema3Ejercicio13;
import java.util.Scanner;

public class Tema3Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el número total de resultados de tu búsqueda");
		int busqueda=teclado.nextInt();
		
		//Las de encima no
		
		System.out.println("¿Cuántos resultados por búsqueda quieres?");
		int resultado=teclado.nextInt();
		int pagina=busqueda/resultado;
		
		//Basta con modificar las líneas por encima de este comentario cada vez que quieras modificar la cantidad de resultados
		
		System.out.println("Hay "+pagina+" páginas en total");
	}

}
