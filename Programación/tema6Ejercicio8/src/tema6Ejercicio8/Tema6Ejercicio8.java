package tema6Ejercicio8;

import java.util.Scanner;

public class Tema6Ejercicio8 {

	void mostrarMenu() {
		System.out.println("¿Qué operación necesita realizar?");
		System.out.println("1 → Crear un producto");
		System.out.println("2 → Modificar nombre del producto");
		System.out.println("3 → Modificar precio del producto");
		System.out.println("4 → Modificar unidades del producto");
		System.out.println("5 → Mostrar datos del producto");
		System.out.println("6 → Crear nuevo cliente");
		System.out.println("7 → Modificar nombre del cliente");
		System.out.println("8 → Modificar dinero del cliente");
		System.out.println("9 → Mostrar datos del cliente");
		System.out.println("10 → Comprar producto");
		System.out.println("11 → Salir");
	}

	void mostrarCliente (Cliente c) {
		System.out.print("El nombre del cliente es "+c.getNombre());
		System.out.println(" y su saldo es "+c.getDinero());
	}

	void mostrarProducto (Producto p) {
		System.out.print("El nombre del producto es "+p.getNombre());
		System.out.print(", su precio es "+p.getPrecio()+"€");
		System.out.println(" y hay "+p.getUnidades()+" unidades");
	}

	void compra (Cliente c, int unidadesCompra, Producto p) {
		if (p.getUnidades()<unidadesCompra) {
			unidadesCompra=p.getUnidades();
			p.setUnidades(0);
			c.setDinero(c.getDinero()-p.getPrecio()*unidadesCompra);
			System.out.println("La compra de "+unidadesCompra+" "+p.getNombre()+" por el precio de "+p.getPrecio()*unidadesCompra+ "€ ha sido efectuada con éxito");
		}else {
			p.setUnidades(p.getUnidades()-unidadesCompra);
			c.setDinero(c.getDinero()-p.getPrecio()*unidadesCompra);
			System.out.println("La compra de "+unidadesCompra+" "+p.getNombre()+" por el precio de "+p.getPrecio()*unidadesCompra+ "€ ha sido efectuada con éxito");
		}
		}

	boolean comprobarCompra(Producto p) {
		if (p.getUnidades()==0) {
			return false;
	}else {
		return true;
	}
	}

	boolean comprobarDinero(Cliente c, Producto p, int unidadesCompra) {
		if (c.getDinero()<(unidadesCompra*p.getPrecio())) {
			return false;
		}else {
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		Tema6Ejercicio8 t=new Tema6Ejercicio8();
		Cliente c= new Cliente();
		Producto p=new Producto();
		int opcion;
		String nombreP;
		String nombreC;
		int precio;
		int dinero;
		int unidades;
		int unidadesCompra;
		int i=0;
		int j=0;

		Producto[] productos=new Producto[3];
		Cliente[] personas=new Cliente[2];

		do {
		t.mostrarMenu();
		opcion=teclado.nextInt();

		switch (opcion) {

		case 1:

			for (i=0;i<productos.length;i++) {
			System.out.println("Dime el nuevo nombre del producto");
			nombreP=teclado.next();
			System.out.println("Dime el nuevo precio del producto");
			precio=teclado.nextInt();
			System.out.println("Dime las unidades del producto");
			unidades=teclado.nextInt();
			productos[i]=new Producto(nombreP, precio, unidades);
			}
			break;

		case 2:
			System.out.println("¿A qué producto le quieres cambiar el nombre?");
			i=teclado.nextInt();
			System.out.println("Dime el nuevo nombre del producto");
			nombreP=teclado.next();
			productos[i].setNombre(nombreP);
			break;

		case 3:
			System.out.println("¿A qué producto le quieres cambiar el precio?");
			i=teclado.nextInt();
			System.out.println("Dime el nuevo precio del producto");
			precio=teclado.nextInt();
			productos[i].setPrecio(precio);
			break;

		case 4:
			System.out.println("¿A qué producto le quieres cambiar las unidades?");
			i=teclado.nextInt();
			System.out.println("Dime las unidades del producto");
			unidades=teclado.nextInt();
			productos[i].setUnidades(unidades);
			break;

		case 5:
			for (Producto prod:productos) {
			t.mostrarProducto(prod);
			}
			break;

		case 6:
			for (i=0;i<personas.length;i++) {
			System.out.println("Dime el nuevo nombre del cliente");
			nombreC=teclado.next();
			System.out.println("Dime el saldo que hay en su cuenta");
			dinero=teclado.nextInt();
			personas[i]=new Cliente(nombreC, dinero);
			}
			break;

		case 7:
			System.out.println("¿A qué persona le quieres cambiar el nombre?");
			i=teclado.nextInt();
			System.out.println("Dime el nuevo nombre del cliente");
			nombreC=teclado.next();
			personas[i].setNombre(nombreC);
			break;

		case 8:
			System.out.println("¿A qué persona le quieres cambiar el nombre?");
			i=teclado.nextInt();
			System.out.println("Dime el saldo que hay en su cuenta");
			dinero=teclado.nextInt();
			personas[i].setDinero(dinero);
			break;

		case 9:

			for (Cliente cli:personas) {
			t.mostrarCliente(cli);
			}
			break;

		case 10:
			System.out.println("¿Qué número de producto se va a comprar?");
			i=teclado.nextInt();
			System.out.println("¿Qué cliente va a comprar?");
			j=teclado.nextInt();
			System.out.println("¿Cuántas unidades va a comprar?");
			unidadesCompra=teclado.nextInt();

			try {
			if (!t.comprobarCompra(productos[i])) {
				System.out.println("No quedan existencias");
			}else if (!t.comprobarDinero(personas[j], productos[i], unidadesCompra)){
				System.out.println("No tiene suficiente dinero");
			}else {
				t.compra(personas[j], unidadesCompra, productos[i]);
			}
			}catch (NullPointerException e) {
				System.out.println("No hay clientes o productos, prueba a introducir alguno");
			}
			break;
		case 11:

			System.out.println("Adiós, hasta pronto");
		break;

		default: System.out.println("Opción inválida");
		break;
		}

		}while (opcion!=11);

	}

}

class Producto {
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

class Cliente {
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
