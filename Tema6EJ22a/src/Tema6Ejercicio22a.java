import java.util.Scanner;

public class Tema6Ejercicio22a {
	static void imprimirMenu() { // Lo hago estático para ahorrarme la invocación
		System.out.println("Elija una operación");
		System.out.println("1 → Introducir un término y su definición en el diccionario");
		System.out.println("2 → Mostrar todos los términos");
		System.out.println("3 → Obtener la definición de un término");
		System.out.println("4 → Eliminar un término y su definición");
		System.out.println("0 → Salir");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int DEFINICIONES = 5; // He puesto 5, pero pon lo que veas necesario para comprobarlo
		Scanner teclado = new Scanner(System.in);
		Palabra[] diccionario = new Palabra[DEFINICIONES];
		int opcion = 0;
		String entrada = "";
		String significado = ""; // Dejo esto fuera para ya tenerlo declarado y evitar errores

		do {
			imprimirMenu();
			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:
				for (int i = 0; i < diccionario.length; i++) {
					System.out.println("Escribe un término");
					entrada = teclado.next();
					System.out.println("Escribe su definición");
					teclado.nextLine();
					significado = teclado.nextLine(); // Duplico esto porque si no, no me deja introducir valores y lo buguea todo :(
														
					diccionario[i] = new Palabra(entrada, significado); // Se hace así para añadir una entrada en el array
																		
				}
				System.out.println();
				break;

			case 2:
				try {
					for (int i = 0; i < diccionario.length; i++) {
						System.out.println(diccionario[i].getTermino()); // Los getters en un print
					}
					System.out.println();
				}catch(Exception e) {
					
				}
				
				break;

			case 3:
				try {
					System.out.println("Escribe un término:");
					entrada = teclado.next();
					for (Palabra palabra : diccionario) {
						if (palabra.getTermino().equals(entrada)) {
							System.out.println("Definición: " + palabra.getDefinicion());
						} 				
					}
				}catch(Exception e){
					System.out.println("");
				}
				
				System.out.println();
				break;

			case 4:
				//BUSCAR POSICION PALABRA
			    System.out.println("Que palabra quieres borrar?:");
			    entrada = teclado.next();
			    int posicion = -1;

			  //MANDARLA PAL LOBBY
				//De esta forma le obligo a pasar el if else, pq nunca el valor va a ser -1, bueno algun indio lo haya hecho quizas
			    for (int i = 0; i < diccionario.length; i++) {
			        if (diccionario[i] != null && diccionario[i].getTermino().equals(entrada)) {
			            posicion = i;
			            break;
			        }
			    }
			    
			    if (posicion != -1) {
			        for (int i = posicion; i < diccionario.length - 1; i++) {
			            diccionario[i] = diccionario[i + 1];
			        }
			        diccionario[diccionario.length - 1] = null;
			        System.out.println("El término y su definición han sido eliminados.");
			    } else {
			        System.out.println("El término no se encontró en el diccionario.");
			    }
			    break;				

			case 0:
				System.out.println("Hasta pronto");
				break;

			default:
				System.out.println("Opción inválida");
				break; // Sí, esto se puede hacer, no preguntes
			}

		} while (opcion != 0);
	}

}

class Palabra {
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