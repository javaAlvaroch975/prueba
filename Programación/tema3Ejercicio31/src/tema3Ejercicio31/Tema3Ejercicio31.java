package tema3Ejercicio31;
import java.util.Scanner;
public class Tema3Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("¿Cuántas vidas tiene Mario?");
		int vidas=teclado.nextInt();
		System.out.println("¿Cuántas monedas tiene Mario?");
		int monedas=teclado.nextInt();
		
		monedas++;
		
		if ((vidas==99)&&(monedas>=100)) {
			monedas=0;
		} else if (monedas>=100) {
			monedas=0;
			vidas++;
		} 
			
		System.out.println("Mario tiene "+vidas+" vidas y "+monedas+" monedas");
		//Mamma mia, tremendo programita
	}

}
