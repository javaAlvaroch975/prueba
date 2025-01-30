package ventaProducto;

public class Cliente {
	
	String nombre;
	int dinero;
	
	Cliente () {
		this.nombre="";
		this.dinero=0;
	}
	
	Cliente (String nombre, int dinero){
		this.nombre=nombre;
		this.dinero=dinero;
	}
	
	String getNombre () {
		return this.nombre;
	}
	
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	int getDinero() {
		return this.dinero;
	}
	
	void setDinero(int dinero) {
		this.dinero=dinero;
	}
	boolean comprobarDinero (int dinero, int precio) {
		if (dinero>precio) {
			return true;
		}else {
			return false;
		}
	}
}
