package tema4Ejercicio5;
import java.util.Scanner;
public class Tema4Ejercicio5 {

	int calcular100 (int anyoPresente) {
		int resultado=anyoPresente%100;
		return resultado;
	}
	
	int calcular4 (int anyoPresente) {
		int resultado=anyoPresente%4;
		return resultado;
	}
	
	int calcular400 (int anyoPresente) {
		int resultado=anyoPresente%400;
		return resultado;
	}
	
	boolean comprobarBisiesto (int resto100, int resto4, int resto400) {
		if (((resto100!=0) && (resto4==0))||(resto400==0)){
			return true;
		} else {
			return false;
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Tema4Ejercicio5 calcular=new Tema4Ejercicio5();
		Tema4Ejercicio5 comprobar=new Tema4Ejercicio5();
		System.out.println("Introduce un año");
		int anyo=teclado.nextInt();
		int resto100=calcular.calcular100(anyo);
		int resto4=calcular.calcular4(anyo);
		int resto400=calcular.calcular400(anyo);
		boolean comprobacion=comprobar.comprobarBisiesto(resto100, resto4, resto400);
		
		if (comprobacion){
			System.out.println("El año es bisiesto");
		} else {
			System.out.println("El año no es bisiesto");
			}

	}

}
