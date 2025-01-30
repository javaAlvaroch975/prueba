package circulo;

public class Circulo {

	double radio;
	String color;

	/* Como vamos a trabajar con números que tienen mucho decimal, ponemos double en
	* vez de float
	*/

	double calcularLongitud(double radio) {

		double longitud = (double) (2 * 3.14 * radio);
		return longitud;
	}

	//Esto es por añadir algoç
	
	//Y esto es por responder
	
	double calcularArea(double radio) {
		double area = (double) (3.14 * radio * radio);
		return area;
	}

	double calcularDiametro(double radio) {
		double diametro = (double) 2 * radio;
		return diametro;
	}

	/* Cada método funciona mejor si hay una única función por método en este caso,
	*ya que solo se puede devolver un dato por método
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo cir1 = new Circulo();
		Circulo cir2 = new Circulo();
		cir1.color = "azul";
		cir2.color = "amarillo";
		cir1.radio = 5;
		cir2.radio = 3;

		double longitud2;
		longitud2 = cir2.calcularLongitud(3);

		double area2;
		area2 = cir2.calcularArea(3);

		double diametro2;
		diametro2 = cir2.calcularDiametro(3);

		// Los cálculos se ponen en double por si salen muchos decimales

		System.out.println("El color del círculo 1 es " + cir1.color + " su radio es " + cir1.radio + " su longitud es "
				+ cir1.calcularLongitud(5) + " su area es " + cir1.calcularArea(5) + " y su diametro es "
				+ cir1.calcularDiametro(5));
		System.out.println();
		System.out.println("El color del círculo 2 es " + cir2.color + " su radio es " + cir2.radio + " su longitud es "
				+ longitud2 + " su area es " + area2 + " y su diametro es " + diametro2);

		/* Se pueden meter los cálculos en el println, el resultado es el mismo que
		*calculando fuera, pero se reduce considerablemente la cantidad de líneas
		*/

	}
}
