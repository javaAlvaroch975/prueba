package tienda;

import java.util.Scanner;

class Tienda {

	void imprimir_menu() {
		System.out.println("Seleccione opción:");
		System.out.println("1. Crear nuevo producto");
		System.out.println("2. Cambiar nombre de un producto");
		System.out.println("3. Cambiar precio de un producto");
		System.out.println("4. Aumentar stock de un producto");
		System.out.println("5. Mostrar producto");
		System.out.println("6. Crear nuevo cliente");
		System.out.println("7. Cambiar nombre de un cliente");
		System.out.println("8. Cambiar dinero de un cliente");
		System.out.println("9. Mostrar cliente");
		System.out.println("10. Venta de un producto a un cliente");
		System.out.println("0. Salir");
	}

	void mostrarProducto(Producto pr) {
		System.out
				.println("Nombre: " + pr.getNombre() + " Precio: " + pr.getPrecio() + " Unidades: " + pr.getUnidades());
	}

	void mostrarCliente(Cliente c) {
		System.out.println("Nombre: " + c.getNombre() + " Dinero: " + c.getDinero());
	}

	double calcularPago(int udsCompra, Producto p, Cliente c) {
		double pago;

		if (udsCompra > p.getUnidades()) {
			udsCompra = p.getUnidades();
		}

		if (udsCompra * p.getPrecio() > c.getDinero()) {
			return -1; // El cliente no tiene suficiente dinero
		} else {
			// Se calcula el coste
			pago = p.getPrecio() * udsCompra;
			// Se descuenta dinero al cliente
			c.setDinero(c.getDinero() - pago);
			// Se descuentan las unidades compradas del almacén
			p.setUnidades(p.getUnidades() - udsCompra);
			return pago; // La función devuelve el dinero gastado
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int opcion;
		int numProd, numCli;
		Producto p = null;
		Cliente c = null;
		Tienda t = new Tienda();

		do {
			System.out.println("----------");
			t.imprimir_menu();
			opcion = s.nextInt();
			switch (opcion) {
			case 1:
				String nombreProducto;
				double precioProducto;
				int udsProducto;

				System.out.print("Introduce nombre del producto: ");
				nombreProducto = s.next();
				System.out.print("Introduce precio del producto: ");
				precioProducto = s.nextDouble();
				System.out.print("Introduce unidades del producto: ");
				udsProducto = s.nextInt();
				p = new Producto(nombreProducto, precioProducto, udsProducto);

				break;
			case 2:

				System.out.print("Introduce nombre del producto: ");
				nombreProducto = s.next();
				p.setNombre(nombreProducto);

				break;
			case 3:

				System.out.print("Introduce precio del producto: ");
				precioProducto = s.nextDouble();
				p.setPrecio(precioProducto);

				break;
			case 4:

				System.out.print("Introduce unidades a a�adir del producto: ");
				udsProducto = s.nextInt();
				p.setUnidades(udsProducto + p.getUnidades());

				break;
			case 5:
				t.mostrarProducto(p);
				break;

			case 6:
				String nombreCliente;
				double dineroCliente;

				System.out.print("Introduce nombre del cliente: ");
				nombreCliente = s.next();
				System.out.print("Introduce dinero del cliente: ");
				dineroCliente = s.nextDouble();
				c = new Cliente(nombreCliente, dineroCliente);

				break;
			case 7:

				System.out.print("Introduce nombre del cliente: ");
				nombreCliente = s.next();
				c.setNombre(nombreCliente);

				break;
			case 8:

				System.out.print("Introduce dinero del cliente: ");
				dineroCliente = s.nextDouble();
				c.setDinero(dineroCliente);

				break;
			case 9:
				t.mostrarCliente(c);
				break;

			case 10:
				int udsCompra;
				double pago;
				if (!p.quedan_unidades()) {
					System.out.println("No quedan unidades del producto");
				} else if (!c.quedaDinero()) {
					System.out.println("Al cliente no le queda dinero");
				} else {
					System.out.println("Introduzca n� de unidades a comprar: ");
					udsCompra = s.nextInt();
					pago = t.calcularPago(udsCompra, p, c);
					if (pago == -1) {
						System.out.println("Compra no realizada. No tiene dinero suficiente para la compra");
					} else {
						System.out.println("Coste de la compra: " + pago);
					}
				}
				break;
			case 0:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opci�n no v�lida");
			}
		} while (opcion != 0);
	}
}
