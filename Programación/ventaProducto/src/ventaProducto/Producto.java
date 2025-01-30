package ventaProducto;

public class Producto {
	String nombre;
	int precio;
	int unidades;
	
	Producto(){
		this.nombre="";
		this.precio=0;
		this.unidades=0;
	}
	
	Producto (String nombre, int precio, int unidades){
		this.nombre=nombre;
		this.precio=precio;
		this.unidades=unidades;
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	int getPrecio() {
		return this.precio;
	}
	
	void setPrecio(int precio) {
		this.precio=precio;
	}
	
	int getUnidades() {
		return this.unidades;
	}
	
	void setUnidades(int unidades) {
		this.unidades=unidades;
	}
	
	boolean comprobarExistencias(int unidades, int compra) {
		if (unidades>compra) {
			return true;
		}else {
			return false;
		}
	}
	
}
