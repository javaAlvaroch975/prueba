package programatema3;
import java.util.Scanner;
import java.util.Random;
import java.util.regex.*;

public class Programatema3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random azar = new Random();
		
		//Variables:
		
		String nombre1;
		int accion;
		
		double vitalidad_jugador = 500;
		double vitalidad_enemigo = 500;
		double vitalidad_enemigo10 = 2000;
		
		int ataque_jugador = azar.nextInt(49)+51;
		int defensa_jugador = azar.nextInt(50);
		
		int ataque_enemigo = azar.nextInt(49)+51;
		int defensa_enemigo = azar.nextInt(50);
		int ataque_enemigo10 = azar.nextInt(49)+51;
		int defensa_enemigo10 = azar.nextInt(50);
		int pociones = 3;
		
		Matcher mat;
		
		//Pedir el nombre al jugador 1:
		
		do{
			
		Pattern pat = Pattern.compile("^[A-Z][a-zA-Z]{0,6}$");
        System.out.println("Introduce tu nombre: ");
        nombre1=entrada.nextLine();

        mat = pat.matcher(nombre1);
        
		}while (!mat.matches());
		
		//Acción para pelear:
		
		 int enemigo_num = 1;
         while (vitalidad_jugador > 0 && enemigo_num <= 10) {
             System.out.println("Batalla contra el enemigo " + enemigo_num);

         //Enemigos:
         if (enemigo_num == 10) {
             vitalidad_enemigo = vitalidad_enemigo10;
             ataque_enemigo = azar.nextInt(49) + 51;
             defensa_enemigo = azar.nextInt(50);
         } else {
             vitalidad_enemigo = 500;
             ataque_enemigo = azar.nextInt(49) + 51;
             defensa_enemigo = azar.nextInt(50);
         }

         //Mostrar estadísticas:
         while (vitalidad_jugador > 0 && vitalidad_enemigo > 0) {
         System.out.println("Estadísticas:");
         System.out.println(nombre1 + ": Vida = " + vitalidad_jugador + " Ataque = " + ataque_jugador + " Defensa = " + defensa_jugador);
         System.out.println("Enemigo " + enemigo_num +": Vida = " + vitalidad_enemigo + " Ataque = " + ataque_enemigo + " Defensa = " + defensa_enemigo);

         //Acción del jugador:
         System.out.println("¿Qué quieres hacer?");
         System.out.println("(1) Atacar");
         System.out.println("(2) Usar poción" + "(Tienes " + pociones + ")");
         accion = entrada.nextInt();

         //Ataque del jugador y usar pocion:
         if (accion == 1) {
             double daño = ataque_jugador - defensa_enemigo;
             vitalidad_enemigo -= daño;
             System.out.println(nombre1 + " ataca al enemigo y le hace " + daño + " de daño.");
         } else if (accion == 2 && pociones > 0) {
             vitalidad_jugador += 100;
             pociones--;
             System.out.println(nombre1 + " usa una poción.");
             System.out.println("Te quedan " + pociones + " pociones.");
         } else if (accion == 2 && pociones == 0) {
             System.out.println("No tienes pociones disponibles.");
         } else {
             continue;
         }

         if (vitalidad_enemigo <= 0) {
             System.out.println(nombre1 + " ha derrotado al enemigo.");
             break;
          }
       //Turno del enemigo:
         double dañoEnemigo = ataque_enemigo - defensa_jugador;
         vitalidad_jugador -= dañoEnemigo;
         System.out.println("El enemigo ataca a " + nombre1 + " y le hace " + dañoEnemigo + " de daño.");

         if (vitalidad_jugador <= 0) {
               System.out.println(nombre1 + " ha sido derrotado.");
               System.out.println("Fin de la partida.");
             }
         }
         
          enemigo_num++;
         }

         //Felicitación al jugador:
         if (vitalidad_jugador > 0 && enemigo_num > 10) {
             System.out.println("¡Felicidades " + nombre1 + ", has ganado!");
         }
	}
}
