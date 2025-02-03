package tema6Ejercicio22a;

import java.util.Scanner;

public class Tema6Ejercicio22a {

	static void imprimirMenu() {		//Lo hago estático para ahorrarme la invocación
		System.out.println("Elija una operación");
		System.out.println("1 → Introducir un término y su definición en el diccionario");
		System.out.println("2 → Mostrar todos los términos");
		System.out.println("3 → Obtener la definición de un término");
		System.out.println("4 → Eliminar un término y su definición");
		System.out.println("0 → Salir");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 final int DEFINICIONES = 5;		//He puesto 5, pero pon lo que veas necesario para comprobarlo
			Scanner teclado=new Scanner(System.in);
			Palabra[] diccionario=new Palabra[DEFINICIONES];
			int opcion=0;
			String entrada="";
			String significado="";		//Dejo esto fuera para ya tenerlo declarado y evitar errores
			
			
			do {
			
			imprimirMenu();
			opcion=teclado.nextInt();
			
			switch (opcion) {
			
			case 1:
				for (int i=0;i<diccionario.length;i++) {
				System.out.println("Escribe un término");
					entrada=teclado.next();	
				System.out.println("Escribe su definición");
					significado=teclado.nextLine();
					significado=teclado.nextLine();		//Duplico esto porque si no, no me deja introducir valores y lo buguea todo :(
					diccionario[i]=new Palabra(entrada,significado);		//Se hace así para añadir una entrada en el array
				}
				break;
				
			case 2:
				for (int i=0;i<diccionario.length;i++) {
					System.out.println(diccionario[i].getTermino());		//Los getters en un print
				}
				break;
				
				
				
			case 0: System.out.println("Hasta pronto"); break;
				
				default: System.out.println("Opción inválida"); break;		//Sí, esto se puede hacer, no preguntes
			}
						
			}while (opcion!=0);
	}

}

class Palabra{
	String termino;
	String definicion;
	
	Palabra(String termino, String definicion) {
		this.termino = termino;
		this.definicion = definicion;
	}

	String getTermino() {
		return termino;
	}

	void setTermino(String termino) {
		this.termino = termino;
	}

	String getDefinicion() {
		return definicion;
	}

	void setDefinicion(String definicion) {
		this.definicion = definicion;
	}
	
}