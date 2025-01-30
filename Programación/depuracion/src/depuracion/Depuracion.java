package depuracion;
import java.util.Scanner;
public class Depuracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int i=8;
		int x,y,num;
		
		x=i+2;
		y=x-3;
		x++;
		System.out.println("Introduzca número: ");
		num=teclado.nextInt();
		y=y+num;
		System.out.println("El valor final de x es "+x);
		System.out.println("El valor final de y es "+y);
	}

}
