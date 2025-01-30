package tema6Ejercicio6;
import java.util.Random;
public class Tema6Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int mayorPorc=0;
		int menorPorc=100;
		int mayor=0;
		int menor=0;
		int[] descargas= new int [6];
		
		for (int i=0;i<descargas.length;i++) {
			descargas[i]=r.nextInt(0, 100);
			if (descargas[i]>mayorPorc) {
				mayorPorc=descargas[i];
			}
			
			if (descargas[i]<menorPorc) {
				menorPorc=descargas[i];
			}
		}
			
			for (int i=0; i<descargas.length;i++) {
				
			if (mayorPorc==descargas[i]) {
				mayor=i;
			}
			
			if (menorPorc==descargas[i]) {
				menor=i;
			}
			
			}
			System.out.println("La app con más índice de descarga es la número "+mayor+" y tiene un "+mayorPorc+"%");
		System.out.println("La app más menos índice de descarga es la número "+menor+" y tiene un "+menorPorc+"%");
		}
		
	}