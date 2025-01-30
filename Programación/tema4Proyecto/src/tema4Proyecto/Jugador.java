package tema4Proyecto;
import java.util.Random;
public class Jugador {
Random r=new Random();
	
final int NUMMAXPOCIONES=3;
final int MAXVIDA=1000;

int vida;
int pociones;
int atk;
int def;


Jugador(){
	vida=MAXVIDA;
	pociones=NUMMAXPOCIONES;
	atk=r.nextInt(51, 100);
	def=r.nextInt(1, 50);
}


Jugador(int vida, int pociones, int atk, int def) {
	this.vida = vida;
	this.pociones = pociones;
	this.atk = atk;
	this.def = def;
}

int getVida() {
	return vida;
}


void setVida(int vida) {
	this.vida = vida;
}


int getPociones() {
	return pociones;
}


void setPociones(int pociones) {
	this.pociones = pociones;
}


int getAtk() {
	return atk;
}


int getDef() {
	return def;
}


void setAtk(int inicio, int limite) {
	this.atk =r.nextInt(inicio, limite );
}


void setDef(int inicio, int limite) {
	this.def =r.nextInt(inicio, limite);
}


}
