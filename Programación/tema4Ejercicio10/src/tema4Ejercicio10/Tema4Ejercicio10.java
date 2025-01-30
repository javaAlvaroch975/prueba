package tema4Ejercicio10;

import java.util.Scanner;

public class Tema4Ejercicio10 {
	
int saldo;		//Si declaras algo como un atributo, no hace falta declarar NADA en la clase, solo un objeto en el main y le asignas valor

void mostrarMenu() {
	System.out.println("Elija una opción");
	System.out.println("1) Consultar saldo");
	System.out.println("2) Introducir dinero");
	System.out.println("3) Extraer dinero");
	System.out.println("4) Salir");
}
void ingresarDinero (int dinero) {
	saldo+=dinero;		//No es un parámetro
}

void retirarDinero (int dinero) {
	saldo-=dinero;
}

boolean comprobarCuenta() {
	if (saldo>0) {
		return true;
	} else {
		return false;
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Tema4Ejercicio10 operacion = new Tema4Ejercicio10();
		operacion.saldo=1000;
		int opcion=0;
		int dinero;
		
		do {
		operacion.mostrarMenu();
		opcion=teclado.nextInt();
		
		switch (opcion) {
		case 1: System.out.println("Tu saldo es "+operacion.saldo);
		break;
		
		case 2: System.out.println("¿Cuánto dinero quieres ingresar?");
		dinero=teclado.nextInt();
		operacion.ingresarDinero(dinero);
		System.out.println("El saldo actual es "+operacion.saldo);
		break;
		
		case 3: System.out.println("¿Cuánto dinero quieres extraer?");
		dinero=teclado.nextInt();
		operacion.retirarDinero(dinero);
		if (operacion.comprobarCuenta()) {
			System.out.println("El saldo actual es "+operacion.saldo);
		} else {
			System.out.println("Cuenta en números rojos");
		}
		break;
		
		case 4: System.out.println("Hasta pronto, no se olvide de retirar la tarjeta");
		
		}
		}while (opcion!=4);
	}
	}