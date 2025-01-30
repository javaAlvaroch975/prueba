package tema4Ejercicio18;

public class Tema4Ejercicio18 {
	// Atributo para el precio base del producto
	  double precioBase=100;
	  
	  // Método para calcular el precio final del producto, sin impuestos
	  double calcularPrecio() {
	    return precioBase;
	  }
	  
	  // Método para calcular el precio final del producto, con impuestos
	  double calcularPrecio(double impuesto) {
	    return precioBase + (precioBase * impuesto);
	  }
	  
	  // Método para calcular el precio final del producto, con descuento
	  double calcularPrecio(double descuento, boolean aplicarImpuesto) {
	    double precioFinal = precioBase - (precioBase * descuento);
	    if (aplicarImpuesto) {
	      precioFinal += precioFinal * 0.16;
	    }
	    return precioFinal;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tema4Ejercicio18 t=new Tema4Ejercicio18();
		double impuesto4=0.04;
		double descuento8=0.08;
		double descuento10=0.10;
		
		System.out.println("1) "+t.calcularPrecio());
		System.out.println("2) "+t.calcularPrecio(impuesto4));
		System.out.println("3) "+t.calcularPrecio(descuento10, true));
		System.out.println("4) "+t.calcularPrecio(descuento8, false));
	}

}
