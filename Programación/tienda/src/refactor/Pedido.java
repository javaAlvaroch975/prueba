package refactor;

public class Pedido {

	private static final double IVA = 0.16;
	PedidoData prod = new PedidoData();
	static int idcliente;
	static int udsCompra;

	 int getIdproducto() {
		return prod.getIdproducto();
	}

	double getPrecio() {
		return prod.getPrecio();
	}

	int getUnidades() {
		return prod.getUnidades();
	}

	void setIdproducto(int idproducto) {
		this.prod.setIdproducto(idproducto);
	}

	void setPrecio(double precio) {
		this.prod.setPrecio(precio);
	}

	void setUnidades(int unidades) {
		this.prod.setUnidades(unidades);
	}

	double calcularPrecioTotal() {
		double precioTotal;
		int id = this.getIdproducto();
		double precioProducto = this.getPrecio();
		if (id == 4)
			precioTotal = (precioProducto + IVA * precioProducto) + 5;
		else if (id == 6)
			precioTotal = (precioProducto + IVA * precioProducto) - 2;
		else
			precioTotal = precioProducto + IVA * precioProducto;
		return precioTotal;
	}

	void realizar_venta(int udsCompra) {
		if (udsCompra>0) {
		double precio;
		precio = calcularPrecioTotal();
		imprimirDatosProducto(precio);
	}
	}

	private void imprimirDatosProducto(double precio) {
		System.out.println("El id del producto es " + this.getIdproducto());
		System.out.println("El precio es " + precio);
	}

}
