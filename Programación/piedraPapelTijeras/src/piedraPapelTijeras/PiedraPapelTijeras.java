package piedraPapelTijeras;
import java.util.Scanner;
import java.util.random.*;
import java.util.Random;
public class PiedraPapelTijeras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
Random aleatorio=new Random();
int jugadaIA=0;
int respuesta=0;
int jugada=0;
int victoria=0;
int derrota=0;
final int PIEDRA=0;
final int PAPEL=1;
final int TIJERA=2;
	
	
	while (respuesta==0) {
		System.out.println("¿Quieres jugar? (0=Sí)");
		respuesta=teclado.nextInt();
	System.out.println("Elige: Piedra (0) Papel (1) o Tijera (2)");
	jugada=teclado.nextInt();
	
	jugadaIA=aleatorio.nextInt(3);
	
	if (jugada==jugadaIA) {
		System.out.println("Empate");
	} else {
		switch (jugada) {
		
		case PIEDRA: if (jugadaIA==PAPEL) {
			System.out.println("Tú sacas piedra, la IA saca papel. Has perdido");
			derrota++;
		}
		 if (jugadaIA==TIJERA) {
				System.out.println("Tú sacas piedra, la IA saca tijera. Has ganado");
				victoria++;
		 } break;
		case PAPEL: if (jugadaIA==PIEDRA) {
			System.out.println("Tú sacas papel, la IA saca piedra. Has ganado");
			victoria++;
		}
		 if (jugadaIA==TIJERA) {
				System.out.println("Tú sacas papel, la IA saca tijera. Has perdido");
				derrota++;
		 } break;
		case TIJERA: if (jugadaIA==PAPEL) {
			System.out.println("Tú sacas tijera, la IA saca papel. Has ganado");
			victoria++;
		}
		 if (jugadaIA==PIEDRA) {
				System.out.println("Tú sacas tijera, la IA saca piedra. Has perdido");
				derrota++;
		 }break;
		 default: System.out.println("Jugada inválida");
		 break;
		}
	}
} 
System.out.println("Has ganado "+victoria+" veces y has perdido "+derrota+" veces.");
	}

}
