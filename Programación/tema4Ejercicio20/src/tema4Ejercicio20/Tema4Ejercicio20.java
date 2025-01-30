package tema4Ejercicio20;
enum Genero {DRAMA, COMEDIA, TERROR, MUSICAL}

public class Tema4Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula p1=new Pelicula("Shrek",120,2000,Genero.COMEDIA);
		Pelicula p2=new Pelicula("Frozen",180,2012,Genero.MUSICAL);
	}

}
class Pelicula{
	String titulo;
	int duracion;
	int anyo;
	Genero genero;
	
	Pelicula(String titulo, int duracion, int anyo, Genero genero) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.anyo = anyo;
		this.genero=genero;
		
	}	
}