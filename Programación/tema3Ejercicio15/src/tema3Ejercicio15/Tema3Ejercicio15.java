package tema3Ejercicio15;
import java.util.Scanner;
public class Tema3Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);

final int ANYO=2024;

//Recordemos, final nos permite fijar una variable como constante

System.out.println("Introduce tu año de nacimiento");
int nacimiento=teclado.nextInt();

int edad=ANYO-nacimiento;
int meses=edad*12;
int dias=edad*365;


System.out.println("Tienes "+edad+" años");
System.out.println("Tienes "+meses+" meses");
System.out.println("Tienes "+dias+" días");
	}

}
