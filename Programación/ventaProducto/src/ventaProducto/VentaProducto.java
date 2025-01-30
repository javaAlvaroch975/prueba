package ventaProducto;

import java.util.Scanner;

public class VentaProducto {
	
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
		}else {		//Dios, vaya fumada de if, menos mal que funciona bien
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
	}	//Ambos comprobantes me hacen las cosas más fáciles

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		VentaProducto v=new VentaProducto();
		Cliente c= new Cliente();
		Producto p=new Producto();
		int opcion;
		String nombreP;
		String nombreC;
		int precio;
		int dinero;
		int unidades;
		int unidadesCompra;
		
		do {
		v.mostrarMenu();
		opcion=teclado.nextInt();
		
		switch (opcion) {
		
		case 1: 
			
			System.out.println("Dime el nuevo nombre del producto");
			nombreP=teclado.next();
			System.out.println("Dime el nuevo precio del producto");
			precio=teclado.nextInt();
			System.out.println("Dime las unidades del producto");
			unidades=teclado.nextInt();
			p=new Producto(nombreP, precio, unidades);
			break;
			
		case 2: 
			
			System.out.println("Dime el nuevo nombre del producto");
			nombreP=teclado.next();
			p.setNombre(nombreP);
			break;
			
		case 3:
			
			System.out.println("Dime el nuevo precio del producto");
			precio=teclado.nextInt();
			p.setPrecio(precio);
			break;
			
		case 4:
			
			System.out.println("Dime las unidades del producto");
			unidades=teclado.nextInt();
			p.setUnidades(unidades);
			break;
			
		case 5:
			
			v.mostrarProducto(p);
			break;
			
		case 6:
			
			System.out.println("Dime el nuevo nombre del cliente");
			nombreC=teclado.next();
			System.out.println("Dime el saldo que hay en su cuenta");
			dinero=teclado.nextInt();
			c=new Cliente(nombreC, dinero);
			break;
			
		case 7:
			
			System.out.println("Dime el nuevo nombre del cliente");
			nombreC=teclado.next();
			c.setNombre(nombreC);
			break;
			
		case 8:
			System.out.println("Dime el saldo que hay en su cuenta");
			dinero=teclado.nextInt();
			c.setDinero(dinero);
			break;
			
		case 9:
			
			v.mostrarCliente(c);
			break;
			
		case 10:
		
			System.out.println("¿Cuántas unidades va a comprar?");
			unidadesCompra=teclado.nextInt();
			
			if (!v.comprobarCompra(p)) {
				System.out.println("No quedan existencias");
			}else if (!v.comprobarDinero(c, p, unidadesCompra)){
				System.out.println("No tiene suficiente dinero");
			}else {
				v.compra(c, unidadesCompra, p);
			}	//Gracias a ambos comprobantes, esto se me hace más fácil
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
