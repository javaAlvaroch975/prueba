package gestionBici;

public class Bicicleta {
int codigo;
boolean libre;
int usuario;
int getCodigo() {
	return codigo;
}
void setCodigo(int codigo) {
	this.codigo = codigo;
}
boolean isLibre() {
	return libre;
}
void setLibre(boolean libre) {
	this.libre = libre;
}
int getUsuario() {
	return usuario;
}
void setUsuario(int usuario) {
	this.usuario = usuario;
}
Bicicleta(int codigo, boolean libre, int usuario) {
	this.codigo = codigo;
	this.libre = libre;
	this.usuario = usuario;
}
Bicicleta(){
	this.codigo=0;
	this.libre=true;
	this.usuario=0;
}
}
