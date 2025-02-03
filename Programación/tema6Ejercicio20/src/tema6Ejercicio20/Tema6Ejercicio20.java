package tema6Ejercicio20;

import java.util.HashMap;
import java.util.Scanner;



public class Tema6Ejercicio20 {
	
	static void imprimirMenu() {
		System.out.println("Seleccione una operación");
		System.out.println("1 → Añadir un nuevo país con sus habitantes");
		System.out.println("2 → Eliminar un país por nombre");
		System.out.println("3 → Mostrar el número de habitantes de un país");
		System.out.println("4 → Listar los nombres de los países");
		System.out.println("5 → Mostrar cada país con sus habitantes");
		System.out.println("6 → Eliminar los contenidos del mapa");
		System.out.println("7 → Buscar el país con más habitantes");
		System.out.println("0 → Salir");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mayor=0;
		String mayorNombre="";
		int opcion=0;
		String nombre="";
		Integer poblacion=0;
		Scanner teclado=new Scanner(System.in);
		HashMap<String,Integer> paises=new HashMap <>();
		
		do {
		
		imprimirMenu();
		opcion=teclado.nextInt();
		
		switch (opcion) {
		
		case 1:
			System.out.println("Dime el nombre del país");
				nombre=teclado.next();
			System.out.println("Dime los habitantes que tiene");
				poblacion=teclado.nextInt();
		paises.put(nombre, poblacion);
		break;
		
		case 2:
			System.out.println("¿Qué país quieres borrar?");
				nombre=teclado.next();
				paises.remove(nombre);
			break;
		
		case 3:
			System.out.println("¿De qué país quieres ver sus habitantes?");
			nombre=teclado.next();
			if (paises.containsKey(nombre)) {
				System.out.println(paises.get(nombre));
			}else {
				System.out.println("País inexistente");
			}
		break;
		
		case 4:
			System.out.println(paises.keySet());
		break;
		
		case 5:
			for (String pais:paises.keySet()) {
				System.out.print(pais+", ");
				System.out.print(paises.get(pais));
				System.out.println();
			}
		break;
		
		case 6:
			paises.clear();
			System.out.println("Datos eliminados");
		break;
		
		case 7:
			mayorNombre="";
			mayor=0;
			for (String llave:paises.keySet()) {
				if (paises.get(llave)>mayor) {
					mayor=paises.get(llave);
					mayorNombre=llave;
				}
			}
			System.out.println("El pais con más habitantes es "+mayorNombre+" con "+mayor+" habitantes");
		break;
		
		case 0: System.out.println("Hasta pronto"); break;
		
		default: System.out.println("Opción inválida"); break;
		}
		
		}while (opcion!=0);
	}

}
