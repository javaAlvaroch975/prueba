package tema3Ejercicio54;

public class Tema3Ejercicio54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<5;i++) {
			for (int j=1;j<=5;j++) {	
		System.out.print(j);
	}
			System.out.println();
}
		System.out.println();
		//Esto de aquí arriba imprime del 1 al 5, para luego imprimir un salto de línea
		//Este es relativamente sencillo, aunque me hace falta mejorar en el anidamiento de for
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {	
				System.out.print(i);

			}
		System.out.println();
		}
		
		//Aparentemente, he de imprimir i mientras incremento j e i, además de dejar el espacio fuera
		
		System.out.println();

		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {	
				System.out.print(j);

			}
		System.out.println();
		}
		
		//Y aquí solo imprimo j, fascinante como puede evolucionar esto
		
		System.out.println();
		
		for (int i=5;i>=1;i--) {
			for (int j=5;j>=i;j--) {	
				System.out.print(j);

			}
		System.out.println();
		}
		//Este se resuelve con revertir el anterior, aún teniendo el mismo núcleo, maravilloso
	}

}
