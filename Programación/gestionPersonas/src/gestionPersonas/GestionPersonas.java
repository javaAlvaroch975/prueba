package gestionPersonas;
import java.util.Scanner;
public class GestionPersonas {

	void mostrarMenu () {
		System.out.println("Elija una opción");
		System.out.println("1 → Crear una nueva Persona");
		System.out.println("2 → Cambiar el nombre de una Persona");
		System.out.println("3 → Cambiar la edad de una Persona");
		System.out.println("4 → Mostrar los datos de una Persona");
		System.out.println("5 → Salir");
	}
	
	void mostrarPersona(Persona p) {	//Parece que basta con llamar a un "objeto" de la clase Persona
		System.out.println("Esta persona tiene de nombre "+p.getNombre());
		System.out.println("Y tiene "+p.getEdad()+" años");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
GestionPersonas g=new GestionPersonas();
Persona p= new Persona();
int opcion=0;
String nombre;
int edad;

do {

g.mostrarMenu();
opcion= teclado.nextInt();

switch (opcion) {

case 1:
	System.out.println("Introduzca el nuevo nombre");
	nombre=teclado.next();	//No tiene sentido, pero bueno, toca joderse y poner Next, el switch se lleva mis privilegios de intro
	System.out.println("Introduzca la nueva edad");
	edad=teclado.nextInt();
	p= new Persona (nombre, edad);	//Vale, aparentemente se hace con un new si se cambian ambos
	break;

case 2: 
	System.out.println("Introduzca el nuevo nombre");
	nombre=teclado.next();
	p.setNombre(nombre);
	break;
	
case 3: 
	System.out.println("Introduzca la nueva edad");
	edad=teclado.nextInt();
	p.setEdad(edad);
	break;
	
case 4: 
	g.mostrarPersona(p);
	break;
	
case 5: System.out.println("Adiós, hasta pronto");	//Nota mental, si hay opción de salir y default de opción inválida, no te olvides del break y del caso especial
break;

default: System.out.println("Opción inválida");
}

}while (opcion!=5);
	}

}
class Persona{	
	int edad;
	String nombre;
	
	Persona(){ 		//Literalmente por defecto
		this.nombre="";
		this.edad=0;
	}
	
	Persona(String nombre, int edad){		//This.
		this.edad=edad;
		this.nombre=nombre;
	}
	
	int getEdad() {
		return this.edad;
	}
	
	String getNombre() {
		return this.nombre;
	}
			//Los gets son muy simples
	void setEdad(int edad) {
		this.edad=edad;
	}
	
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	//Los set tampoco son una complicación de la hostia
}