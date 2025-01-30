package gestionBici;

public class Usuario {
String nombre;
int codigo;
int bici;
String getNombre() {
	return nombre;
}
void setNombre(String nombre) {
	this.nombre = nombre;
}
int getCodigo() {
	return codigo;
}
void setCodigo(int codigo) {
	this.codigo = codigo;
}
int getBici() {
	return bici;
}
void setBici(int bici) {
	this.bici = bici;
}
Usuario(String nombre, int codigo, int bici) {
	this.nombre = nombre;
	this.codigo = codigo;
	this.bici = bici;
}
Usuario (){
	this.nombre="";
	this.codigo=0;
	this.bici=0;
}
}
