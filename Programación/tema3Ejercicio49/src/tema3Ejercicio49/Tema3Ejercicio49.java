package tema3Ejercicio49;
import java.util.Scanner;
public class Tema3Ejercicio49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pesoFacturado, pesoReal;
		int diferencia, coste, costeTotal=0;
		int totalMaletas, numMaleta;
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce número de maletas: ");
		totalMaletas = s.nextInt();
		
		for (numMaleta = 1;numMaleta <= totalMaletas;numMaleta++) {
		coste=0;
		System.out.println("Maleta "+numMaleta);
		System.out.print("Introduce peso facturado (10/20/25 kg): ");
		pesoFacturado = s.nextInt();
		System.out.print("Introduce peso real (kg): ");
		pesoReal = s.nextInt();
		diferencia = pesoReal - pesoFacturado;
		if (diferencia > 0) {
		coste = 12 * diferencia;
		}
		costeTotal += coste;
		System.out.println("Coste: " + coste + "€");
		
		}
		System.out.println("El coste total es "+costeTotal+" €");
	}

}
