package tema4Proyecto;
import java.util.Random;
public class Enemigo {
Random r=new Random();
	
final int VIDAMAX=500;
	
int vida;
int atkE;
int defE;
int numEnemigo;
int turno;

Enemigo(){
	vida=VIDAMAX;
	atkE=r.nextInt(51, 100);
	defE=r.nextInt(1, 50);
	numEnemigo=1;
	turno=0;
}

Enemigo(int vida, int atkE, int defE, int numEnemigo, int turno) {
	this.vida = vida;
	this.atkE = atkE;
	this.defE = defE;
	this.numEnemigo=numEnemigo;
	this.turno=turno;
}


int getVida() {
	return vida;
}

void setVida(int vida) {
	this.vida = vida;
}

int getAtkE() {
	return atkE;
}

void setAtkE(int primerValor, int segundoValor) {
	this.atkE=r.nextInt(primerValor, segundoValor);
}

int getDefE() {
	return defE;
}

void setDefE(int primerValor, int segundoValor) {
	this.defE=r.nextInt(primerValor, segundoValor);
}

int getNumEnemigo() {
	return numEnemigo;
}

void setNumEnemigo(int numEnemigo) {
	this.numEnemigo=numEnemigo;
}

int getTurno() {
	return turno;
}

void setTurno(int turno) {
	this.turno = turno;
}

boolean comprobarNumEnemigos(int numEnemigo) {
	
	if (numEnemigo==10) {
		return false;
	}else {
		return true;
	}
}

}
