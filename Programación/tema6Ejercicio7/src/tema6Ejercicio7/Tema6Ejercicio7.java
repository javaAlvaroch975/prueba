package tema6Ejercicio7;

import java.util.Scanner;

public class Tema6Ejercicio7 {

	void mostrarMenu () {
		System.out.println("Elija una opción");
		System.out.println("1 → Crear nuevas Personas");
		System.out.println("2 → Cambiar el nombre de una Persona");
		System.out.println("3 → Cambiar la edad de una Persona");
		System.out.println("4 → Mostrar los datos de las Personas");
		System.out.println("5 → Salir");
	}
	
	void mostrarPersona(Persona p) {
		
		System.out.print("Esta persona tiene de nombre "+p.getNombre());
		System.out.println(" y tiene "+p.getEdad()+" años");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Tema6Ejercicio7 t=new Tema6Ejercicio7();
		Persona p= new Persona();
		int opcion=0;
		int i;
		String nombre;
		int edad;
		
		Persona[] gente= new Persona [5];

		do {

		t.mostrarMenu();
		opcion= teclado.nextInt();

		switch (opcion) {

		case 1:
			for (i=0;i<gente.length;i++) {
			System.out.println("Introduzca el nuevo nombre");
			nombre=teclado.next();
			System.out.println("Introduzca la nueva edad");
			edad=teclado.nextInt();
			gente[i]= new Persona (nombre, edad);
			}
			break;

		case 2: 
			System.out.println("¿A qué persona le quieres cambiar el nombre?");
			i=teclado.nextInt();
			System.out.println("Introduzca el nuevo nombre");
			nombre=teclado.next();
			gente[i].setNombre(nombre);
			break;
			
		case 3: 
			System.out.println("¿A qué persona le quieres cambiar la edad?");
			i=teclado.nextInt();
			System.out.println("Introduzca la nueva edad");
			edad=teclado.nextInt();
			gente[i].setEdad(edad);
			break;
			
		case 4: 
			for (Persona per:gente)
			t.mostrarPersona(per);
			break;

		case 5: System.out.println("Adiós, hasta pronto");
		break;

		default: System.out.println("Opción inválida");
		}

		}while (opcion!=5);
			}
		
	}


class Persona{
	int edad;
	String nombre;
	
	Persona(){
		this.nombre="";
		this.edad=0;
	}
	
	Persona(String nombre, int edad){
		this.edad=edad;
		this.nombre=nombre;
	}
	
	int getEdad() {
		return this.edad;
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	void setEdad(int edad) {
		this.edad=edad;
	}
	
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
}
