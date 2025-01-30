package programaExamen2;
import java.util.Scanner;
import java.util.regex.*;
public class ProgramaExamen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Pattern adn= Pattern.compile("^[ACGT]+$");
		
		String adn1;
		String adn2;
		double adenina=0;	//Esta variable tiene que ser double para los cálculos
		int diferencia=0;
		
		System.out.println("Escribre una cadena de ADN.");
		adn1=teclado.next();
		System.out.println("Escribe una segunda cadena de ADN.");
		adn2=teclado.next();
		
		Matcher correcto1= adn.matcher(adn1);
		Matcher correcto2= adn.matcher(adn2);
		
		if (adn1.length()==adn2.length()) {
			if (correcto1.matches()&&(correcto2.matches())) {	//Es importante que se ponga el .matches, si no ,no se acepta el && (Ni la comparación)
				
				for (int posicion=0;posicion<adn1.length();posicion++) {
					if (adn1.charAt(posicion)=='A') {
						adenina++;		//Siempre que haya una A se incrementa el nivel de adenina
					}
				}
				double porcentaje=adenina*100/adn1.length();	//Esto es para el porcentaje
				System.out.println("El porcentaje de adenina es "+String.format("%.3f", porcentaje)+"%");		//El String.format es para el límite de decimales
				for (int posicion=0;posicion<adn1.length();posicion++) {
					if (adn1.charAt(posicion)!=adn2.charAt(posicion)) {		//Este if me compara si el carácter en ambas cadenas es el mismo en la misma posición
						diferencia++;
					}
				}
				System.out.println("Las cadenas "+adn1+" y "+adn2+" tienen "+diferencia+" diferencias.");
			}else {
				System.out.println("Las cadenas no son correctas.");
			}
		}else {
			System.out.println("Las cadenas de ADN no tienen la misma longitud.");
		}
	}
}