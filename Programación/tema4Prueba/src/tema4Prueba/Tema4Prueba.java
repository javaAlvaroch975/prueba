package tema4Prueba;
import java.util.Scanner;
import java.util.regex.*;
public class Tema4Prueba {
	
	void mostrarMenu() {
		System.out.println("¿Qué desea hacer?");
		System.out.println("1 → Crear alumno");
		System.out.println("2 → Cambiar su nombre");
		System.out.println("3 → Cambiar su número de expediente");
		System.out.println("4 → Cambiar su primera nota");
		System.out.println("5 → Cambiar su segunda nota");
		System.out.println("6 → Cambiar su tercera nota");
		System.out.println("7 → Mostrar datos del alumno");
		System.out.println("8 → Hacer media");
		System.out.println("0→ Salir");
	}

	void mostrarAlumno(Alumno a) {
		System.out.println("El nombre del alumno es "+a.getNombre());
		System.out.println("El número de expediente del alumno es "+a.getNexp());
		System.out.println("La nota de la primera evaluación es "+a.getNota1());
		System.out.println("La nota de la segunda evaluación es "+a.getNota2());
		System.out.println("La nota de la tercera evaluación es "+a.getNota3());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		Alumno a=new Alumno();
		Tema4Prueba t=new Tema4Prueba();
		Pattern pat= Pattern.compile("^[0-9]{4}$");
		int opcion=0;
		String nombre;
		String nexp;
		float nota1=0, nota2=0, nota3=0;
		
		do {
		t.mostrarMenu();
		opcion=teclado.nextInt();
		
		switch (opcion) {	
		
		case 0:
		System.out.println("Hasta pronto");
		break;
		
		case 1:
			System.out.println("Dime el nombre del alumno");
					nombre=teclado.next();
				System.out.println("Dime el número de expediente del alumno");
					nexp=teclado.next();
					Matcher mat= pat.matcher(nexp);
					if (mat.matches()) {
				System.out.println("Dime la nota de la primera evaluación");
					nota1=teclado.nextFloat();
				System.out.println("Dime la nota de la segunda evaluación");
					nota2=teclado.nextFloat();
				System.out.println("Dime la nota de la tercera evaluación");
					nota3=teclado.nextFloat();		
					a= new Alumno(nombre,nexp,nota1,nota2,nota3);
					}else {
						System.out.println("Número de expediente inválido, tiene que tener 4 cifras");
					}
				break;
				
		case 2:
			System.out.println("Dime el nombre del alumno");
				nombre=teclado.next();
				a.setNombre(nombre);
				break;
				
		case 3: 
			System.out.println("Dime el número de expediente del alumno");
				nexp=teclado.next();
				mat= pat.matcher(nexp);
				if (mat.matches()) {
				a.setNexp(nexp);
				}else {
					System.out.println("Número de expediente inválido, tiene que tener 4 cifras");
				}
				break;
				
		case 4:
			System.out.println("Dime la nota de la primera evaluación");
				nota1=teclado.nextFloat();	
				a.setNota1(nota1);
				break;
				
		case 5:
			System.out.println("Dime la nota de la segunda evaluación");
				nota2=teclado.nextFloat();
				a.setNota2(nota2);
				break;
				
		case 6:		
			System.out.println("Dime la nota de la tercera evaluación");
				nota3=teclado.nextFloat();	
				a.setNota3(nota3);
				break;
		
		case 7:
			t.mostrarAlumno(a);
			break;
			
		case 8: 
			System.out.println("La media de las tres evaluaciones es "+a.media(nota1, nota2, nota3));
			break;
		
		default:
			System.out.println("Opción inválida");
			break;
		}
		
		}while (opcion!=0);
	}

}


class Alumno{
	String nombre;
	String nexp;
	float nota1, nota2, nota3;
	
	Alumno(){
		this.nombre="";
		this.nexp="";
		this.nota1=0;
		this.nota2=0;
		this.nota3=0;
	}
	
	Alumno(String nombre, String nexp, float nota1, float nota2, float nota3){
		this.nombre=nombre;
		this.nexp=nexp;
		this.nota1=nota1;
		this.nota2=nota2;
		this.nota3=nota3;
	}
	
	String getNombre() {
		return nombre;
	}
	
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	String getNexp() {
		return nexp;
	}
	
	void setNexp(String nexp) {
		this.nexp = nexp;
	}
	
	float getNota1() {
		return nota1;
	}
	
	void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	
	float getNota2() {
		return nota2;
	}
	
	void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	float getNota3() {
		return nota3;
	}
	
	void setNota3(float nota3) {
		this.nota3 = nota3;
	}
	
	float media(float nota1, float nota2, float nota3) {
		float media=(nota1+nota2+nota3)/3;
		return media;
	}
	
}