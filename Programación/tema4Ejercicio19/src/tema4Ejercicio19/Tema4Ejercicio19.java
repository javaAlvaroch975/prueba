package tema4Ejercicio19;

public class Tema4Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1=new Triangulo(5);					//Equilátero
		Triangulo t2=new Triangulo(7,5);				//Isósceles
		Triangulo t3= new Triangulo(13,7,5);		//Escaleno
	}

}
class Triangulo{
	double lado1, lado2, lado3;
	
	Triangulo(int lado){												//Equilátero
		this.lado1=lado;
		this.lado2=lado;
		this.lado3=lado;
	}
	
	Triangulo(int ladoLargo, int ladoCorto){	//Isósceles
		this.lado1=ladoLargo;
		this.lado2=ladoLargo;
		this.lado3=ladoCorto;
	}
	
	Triangulo(int ladoLargo, int ladoMedio, int ladoCorto){	//Escaleno
		this.lado1=ladoLargo;
		this.lado2=ladoMedio;
		this.lado3=ladoCorto;
	}
}