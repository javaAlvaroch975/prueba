package tema3Ampliacion;
import java.util.Scanner;
import java.util.regex.*;
import java.util.Random;
public class Tema3Ampliacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Random valorAleatorio=new Random();
		final int CURACION=100;	//← Esto queda mejor como constante
		final int CURACIONMAGIA=10;
		int vida=500;
		int pm=30; //PM significa puntos de magia
		int vidaE=0;
		int atk=valorAleatorio.nextInt(51, 101); 	//El mínimo de ataque es 51 y el máximo es 100
		int def=valorAleatorio.nextInt(1, 50);	//El mínimo de defensa es 1 y el máximo es 50
		int atkE=0;
		int defE=0;
		int danyo=0;
		int danyoE=0;
		int enemigo=0;
		int pociones=3;
		int elixir=3;
		int turno=0;
		int experiencia=0;
		int subeNivel=10;
		int expRestante=0;
		int nivel=1;
		boolean comenzar=false;
		int critico=0;
		
		//Estas variables me facilitarán la vida
		
		Pattern nombreJugador=Pattern.compile("^[A-Z][a-z]{1,6}$"); 		//Este patrón me permite hacer que el nombre se ajuste a peticiones
		
		do {
		
		System.out.println("Introduce el nombre del personaje. (Máximo 7 caracteres)");		//Con esto puedo asegurarme que se repetirá hasta que el nombre sea correcto
		String nombre=teclado.next();
		
		Matcher correcto=nombreJugador.matcher(nombre);
		
		if (correcto.matches()) {
		comenzar=true;
			do {
			enemigo++;
			if (enemigo==10) {	
				vidaE=2000; //El jefe tendrá 2000 de vida, será el enemigo nº10
			}else {
		vidaE=500;
			}
		atkE=valorAleatorio.nextInt(51, 101);
		defE=valorAleatorio.nextInt(1, 50);
		System.out.println("¡Ha aparecido un enemigo con "+atkE+" de ataque y "+defE+" de defensa!");
		do {
			turno++;
			System.out.println("Turno "+turno+". Enemigo "+enemigo);
			System.out.println("¿Qué harás este turno?"); //Aquí indico las opciones
			System.out.println();
			System.out.println("0= Atacar");
			System.out.println("1=Usar objeto");
			System.out.println("2= Magia");
			System.out.println();
			int eleccion=teclado.nextInt();
			
			switch (eleccion) {	//Al final cambié todo por un switch
			
			case 0: 
				System.out.println("¡Atacas con "+atk+" al enemigo con "+defE+" de defensa!");
				critico=valorAleatorio.nextInt(11);
				if (critico!=7) {
				danyoE=atk-defE;	
				} else {
					danyoE=atk*2-defE; //El crítico es un *2 solo si el número aleatorio es 7
					System.out.println("¡El golpe ha sido crítico! ¡Has hecho "+danyoE+" de daño!");
				}vidaE-=danyoE;
				System.out.println("Al enemigo le queda "+vidaE+" de vida.");
				break;
				
			case 1:  System.out.println("¿Qué objeto vas a usar? (Número de pociones: "+pociones+". Número de elixires: "+elixir+")"); //Aquí indico el número de pociones y elixires
			System.out.println("1 → Poción (+100 de vida)");
			System.out.println("2 → Elixir (+10 de PM)");
			int inventario=teclado.nextInt();
			
			switch (inventario) {
				
			case 1:
				if (pociones>0) {
				pociones--;
				vida+=CURACION;
				System.out.println(nombre+" ha recuperado 100 de vida, ahora tiene "+vida+" de vida."); //Cada poción recupera 100
				
				}else{
				System.out.println("No le quedan pociones a "+nombre+"."); //Ahora dejo claro que el personaje no tiene pociones
			} 
			break;
			case 2: 
			if (elixir>0) {
				elixir--;
				pm+=CURACIONMAGIA;
			System.out.println(nombre+" ha recuperado 10 PM, ahora tiene "+pm+" de PM"); //El elixir cura 10 PM
			
			}else {
			System.out.println("No le quedan elixires a "+nombre+".");
			} break;
			} break;
			
			case 2: System.out.println("Elige un conjuro. PM: "+pm);
			
			System.out.println("1 → Tarukaja = Sube ataque al jugador (12 PM)");
			System.out.println("2 → Rakunda = Baja defensa al enemigo (6 PM)");
			System.out.println("3 → Filo Valeroso = Daño grave al enemigo, ignora defensa y puede ser critico (50 HP)"); //Esta es un arma de doble filo, 50 de vida es bastante
			System.out.println("4 → Diarama = +200 HP (16 PM)"); //Cuesta más de la mitad de PM
			System.out.println("Otro → Volver");
			int magia=teclado.nextInt();
			
			switch (magia) {
			
			case 1: 
				if (pm<12) {
					System.out.println(nombre+" no tiene suficiente magia.");			//Si el personaje no tiene PM, no podrá hacer hechizos
				}else if (atk<96) {
				atk+=5;
				pm-=12;
				System.out.println("¡El ataque de "+nombre+" ha aumentado en 5 puntos!");
				} else {
					System.out.println("El ataque no puede subir más"); //Evidentemente, hay un tope
					atk=100;
				}
				break;
			case 2:
				if (pm<6) {
					System.out.println(nombre+" no tiene suficiente magia.");			
				}else if (defE>5){
				defE-=5;
				pm-=6;
				System.out.println("La defensa del enemigo ha bajado en 5 puntos");
				} else {
				System.out.println("La defensa del enemigo no puede bajar más"); //Lo mismo para la defensa del enemigo
				defE=1;
				}
				break;
			case 3:
				if (vida<50) {
					System.out.println(nombre+" no tiene suficiente vida.");			
				}else {
				vida-=50;
				System.out.println(nombre+" carga su valor en un filo descomunal");
				critico=valorAleatorio.nextInt(11);
				if (critico!=7) {
				danyoE=atk*3;
				System.out.println("El golpe ha hecho "+danyoE+" de daño");
				} else {
					danyoE=atk*4;
					System.out.println("¡El golpe ha sido crítico! ¡Has hecho "+danyoE+" de daño!"); //Como salga... Da una ventaja descomunal
				}
				vidaE-=danyoE;
				System.out.println("Al enemigo le queda "+vidaE+" de vida.");
				}
				break;
			case 4:
				if (pm<16) {
				System.out.println(nombre+" no tiene suficiente magia.");	
				}else {
				pm-=16;
				vida+=200;
				System.out.println(nombre+" ha recuperado 200 de vida."); //200 es mucho, pero 16 PM también
				}
				break;
			}
			break;		
			default: System.out.println("Opción inválida");
			}		
			System.out.println("¡Cuidado! El enemigo con "+atkE+" de ataque ataca a "+nombre+" que tiene "+def+" de defensa."); //El enemigo solo ataca
			critico=valorAleatorio.nextInt(11);
			if (critico!=7) {
			danyo=atkE-def;
			} else {
			danyo=atkE*2-def;
			System.out.println("¡Cuidado! El golpe ha sido crítico! El enemigo ha hecho "+danyo+" de daño");
			}
			vida-=danyo;
			System.out.println("Te queda "+vida+" de vida.");	
		} while ((vida>0)&&(vidaE>0));
		System.out.println();
		if (vidaE<=0) {
			System.out.println("¡Felicidades! Has ganado el combate");
			experiencia+=turno;	//A más turnos, más experiencia
			turno=0;		//Hay que dejar los turnos a 0 después de recibir la experiencia, si no, ganas demasiado
			System.out.println("Tienes un total de "+experiencia+" puntos de experiencia.");
			expRestante=subeNivel-experiencia;
			if (expRestante>0) {
			System.out.println("Necesitas "+expRestante+" puntos de experiencia para subir de nivel.");
			} else {
				nivel++;
				System.out.println("¡Has subido de nivel! Ahora eres nivel "+nivel+". Tu ataque y defensa aumentan en 7 puntos.");	//Originalmente eran 10, pero eso rompía mucho el juego... Aunque ahora hay un límite de todas formas ,luego lo puse en 5, pero apenas pasaba del inicio... A ver cómo me va con 7
				atk+=7;
				if (atk>=100) {
					System.out.println("No te puede subir más el ataque, toma una poción en su lugar");		//← Esto lo hago para que el subir niveles no se vuelva inútil
					atk=100;
					pociones++;
				}
				def+=7;
				if (def>=50) {
					System.out.println("No te puede subir más la defensa, toma una pequeña curación en su lugar (+ 50 de vida y +10 de PM!)");		//← Lo mismo aquí
					def=50;
					vida+=50;
					pm+=10;
				}
				subeNivel*=1.5;	//← Esto aumenta de forma incremental la dificultad de subir de nivel
			}
		}
		if (vida<=0) {
			System.out.println("Diste lo mejor de tí en batalla... Y aún así parece que el destino tuvo otros planes para tí... ¿Volverás a levantarte?");
		}  //Desde luego, el mensaje de aquí arriba es increíble

		} while ((enemigo<10)&&(vida>0));
		if ((enemigo>=10)&&(vida>0)) {		//← Esta condición es por si mueres en el jefe final, que no te salte el mensaje de abajo
			System.out.println("Al final, llegaste a tu destino, has adquirido una experiencia incalculable... Tu nombre será recordado por aquellos que observan...");
		}	//Aquí también me quedó bien el mensaje
	}else {
		System.out.println("Ese nombre es inválido");
	}
	} while (!comenzar);		//← Esto es el bucle del nombre
		
		
	}

}