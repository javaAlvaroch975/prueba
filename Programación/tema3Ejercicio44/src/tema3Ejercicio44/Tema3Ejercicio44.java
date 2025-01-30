package tema3Ejercicio44;

import java.util.Scanner;

public class Tema3Ejercicio44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el nombre del primer personaje");
		String nombre1=teclado.next();
		System.out.println("Introduce los puntos de vitalidad del primer personaje (0-1000)");
		double hp1=teclado.nextInt();
		System.out.println("Introduce el ataque físico del primer personaje (0-100)");
		int atk1=teclado.nextInt();
		System.out.println("Introduce el ataque mágico del primer personaje (0-100)");
		int matk1=teclado.nextInt();
		System.out.println("Introduce la defensa física del primer personaje (0-100)");
		int def1=teclado.nextInt();
		System.out.println("Introduce la defensa mágica del primer personaje (0-100)");
		int mdef1=teclado.nextInt();
		System.out.println("Introduce el nivel del primer personaje (1-100)");
		int nv1=teclado.nextInt();
		
		//Por el momento esto basta para el primer personaje, repetimos para el segundo
		
		System.out.println("Introduce el nombre del segundo personaje");
		String nombre2=teclado.next();
		System.out.println("Introduce los puntos de vitalidad del segundo personaje (0-1000)");
		double hp2=teclado.nextInt();
		System.out.println("Introduce el ataque físico del segundo personaje (0-100)");
		int atk2=teclado.nextInt();
		System.out.println("Introduce el ataque mágico del segundo personaje (0-100)");
		int matk2=teclado.nextInt();
		System.out.println("Introduce la defensa física del segundo personaje (0-100)");
		int def2=teclado.nextInt();
		System.out.println("Introduce la defensa mágica del segundo personaje (0-100)");
		int mdef2=teclado.nextInt();
		System.out.println("Introduce el nivel del segundo personaje (1-100)");
		int nv2=teclado.nextInt();
		
		double multiplicador1=nv1/10;
		double multiplicador2=nv2/10;
		int totalatk1=atk1+matk1;
		int totalatk2=atk2+matk2;
		double maxatk1=totalatk1+totalatk1*multiplicador1;
		double maxatk2=totalatk2+totalatk2*multiplicador2;
		int totaldef1=def1+mdef1;
		int totaldef2=def2+mdef2;
		double maxdef1=totaldef1+totaldef1*multiplicador1;
		double maxdef2=totaldef2+totaldef2*multiplicador2;
		double danyo1=maxatk2-maxdef1;
		double danyo2=maxatk1-maxdef2;
		
		//Nota de programador, hace falta ir en orden para hacer fórmulas
		//Nota dos, los multiplicadores son menos fáciles de lo que aparentan
		//Nota tres, si tengo que evaluar negativas, mejor me acuerdo de usar un && y no un ||
		
		System.out.println("El personaje "+nombre1+" es nivel "+nv1+" tiene "+hp1+" de vida, "+atk1+" de ataque, "+matk1+" de ataque mágico, "+def1+" de defensa y "+mdef1+" de defensa mágica");
		System.out.println("El personaje "+nombre2+" es nivel "+nv2+" tiene "+hp2+" de vida, "+atk2+" de ataque, "+matk2+" de ataque mágico, "+def2+" de defensa y "+mdef2+" de defensa mágica");
		
		do {
		

		System.out.println(nombre1+" ha inflingido "+danyo2+" a "+nombre2+". ");
		System.out.println(nombre2+" responde con "+danyo1+" de daño a "+nombre1+" . ");
		hp1-=danyo1;
		hp2-=danyo2;
		System.out.println(nombre1+" tiene "+hp1+" de vida y "+nombre2+" tiene "+hp2+" de vida");
		} while ((hp1>0)&&(hp2>0));
		
		if (hp2<=0) {
			System.out.println(nombre2+" ha perdido...");
		}
		if (hp1<=0) {
			System.out.println(nombre1+" ha perdido...");
		}
	}

}
