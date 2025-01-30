package tema4Ejercicio3;
import java.util.Scanner;
public class Tema4Ejercicio3 {
	
	float calcularPorcentaje (float coste, float porciento) {
		float resultado;
		resultado=(coste*porciento)/100;
		return resultado;
	}
	
	float calcularPrecioFinal (float precioInicial, float descuento) {
		float resultado;
		resultado=precioInicial-descuento;
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		Tema4Ejercicio3 calcular=new Tema4Ejercicio3();
		
		System.out.println("Introduce el precio del objeto para aplicar el descuento");
		float precio=teclado.nextFloat();
		System.out.println("Introduce el descuento");
		float porcentaje=teclado.nextFloat();
		
		float descuento=calcular.calcularPorcentaje(precio, porcentaje);
		float preciofinal=calcular.calcularPrecioFinal(precio, descuento);
		System.out.println("El precio a pagar es de "+String.format("%.2f", preciofinal)+"€");

	}

}
