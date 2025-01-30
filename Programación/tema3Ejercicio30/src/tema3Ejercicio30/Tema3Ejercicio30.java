package tema3Ejercicio30;
import java.util.Scanner;
public class Tema3Ejercicio30 {

	public static void main (String[]args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce tu sueldo anual (Rendimientos del trabajo)");
		float sueldoAnyo=teclado.nextFloat();
		System.out.println("Introduce los ingresos obtenidos de los intereses de tus cuentas bancarias (Rendimientos del capital mobiliario)");
		float ingresoInteres=teclado.nextFloat();
		System.out.println("Ingresa lo que se te ha ido reteniendo de tu sueldo (Retenciones e ingrsos a cuenta)");
		float retencionSueldo=teclado.nextFloat();
		
		float capitalTotal=sueldoAnyo+ingresoInteres;
		float resultado=capitalTotal-retencionSueldo;
		
		if (resultado<0) {
			System.out.println("La declaración anual te ha salido devolver. Hacienda te debe devolver "+(-resultado)+"€");
		} else {
			System.out.println("La declaración anual te ha salido a ingresar. Le debes "+resultado+"€ a Hacienda. Cómo deseas efectuar el pago? escribe 1 si quieres pagarlo de golpe o 2 si quieres pagar en dos plazos");
			int pago=teclado.nextInt();
			if ((pago<1 || pago>2)) {
				System.out.println("Valor inválido");
			} else if (pago==1) {
				System.out.println("Entonces pagará "+resultado+"€ de golpe");
			} else {
				System.out.println("Entonces pagará "+resultado/2+"€ en dos plazos");
			}
		}
	}
}
