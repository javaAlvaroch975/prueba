package gestionBici;
import java.util.Scanner;
public class GestionBici {
		//TRUE ES QUE LA BICI ESTÁ LIBRE
	void mostrarMenu() {
		System.out.println("Bienvenido, qué desea hacer?");
		System.out.println("1 → Crear usuario");
		System.out.println("2 → Mostrar datos del usuario");
		System.out.println("3 → Crear bici");
		System.out.println("4 → Mostrar datos de la bici");
		System.out.println("5 → Alquilar bici");
		System.out.println("6 → Devolver bici");
		System.out.println("7 → Salir");
	}
	void mostrarBici (Bicicleta b) {
		System.out.print("La bicicleta "+b.getCodigo() );
		if (b.isLibre()) {
			System.out.println(" está libre.");		//Esta parte del código funciona, aunque se puede confundir con facilidad
		}else {
		System.out.println(" está ocupada por el usuario "+b.getUsuario()+".");
		}
	}
	void mostrarUsuario(Usuario u, Bicicleta b) {
		System.out.print("El usuario "+u.getNombre()+" tiene el código "+u.getCodigo());
		if (!b.isLibre()) {
			System.out.println(" y tiene la bicicleta "+u.getBici());		//Esta se muestra correctamente, aunque la de veces que he tenido que corregirla no cotiza
		}else {
			System.out.println(" y no tiene una bicicleta alquilada");
		}
	}
	
	void alquilarBici(Bicicleta b) {
		b.setLibre(false);
	}
	
	void devolverBici(Bicicleta b) {
		b.setLibre(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		GestionBici g=new GestionBici();
		Bicicleta b=new Bicicleta();
		Usuario u=new Usuario();
		int opcion=0;
		int codBici=0;
		int usuario;
		int codUsuario;
		int ocupacion;
		int bici;
		boolean libre;
		String nombre;		//Estas variables bastan
		
		do {
			g.mostrarMenu();
			opcion=teclado.nextInt();
			
			switch (opcion) {
			
			case 1:
				System.out.println("Dime el nombre del usuario");
					nombre=teclado.next();
				System.out.println("Dime el código del usuario");
					usuario=teclado.nextInt();
				System.out.println("Escribe la bici que ocupa, o 0 si no ocupa ninguna");
					bici=teclado.nextInt();
				u=new Usuario(nombre, usuario, bici);
				break;
				
			case 2:
				g.mostrarUsuario(u, b);
				break;
				
			case 3:
				System.out.println("Introducza el código de la bicicleta");
					codBici=teclado.nextInt();
				System.out.println("Está la bicicleta disponible 0=No, 1=Sí");
					ocupacion=teclado.nextInt();
				if (ocupacion==0) {
					System.out.println("¿Qué código de usuario la ocupa?");
						codUsuario=teclado.nextInt();		//Este if, o estaba aquí, o se me rayaba el programa
						libre=false;
					}else {
						codUsuario=0;
						libre=true;
					}
				b=new Bicicleta(codBici, libre, codUsuario);
				break;
				
				case 4:
			g.mostrarBici(b);
				break;
				
			case 5:
				if (b.isLibre()) {
					g.alquilarBici(b);
					System.out.println("Gracias por alquilar la bici");
					u.setBici(codBici);
					break;
				}else {
					System.out.println("Lo sentimos, la bici está ocupada");
				}
				break;
				
			case 6:
				if (!b.isLibre()) {
					g.devolverBici(b);
					System.out.println("Gracias por devolver la bici");
					u.setBici(0);
					break;
				}else {
					System.out.println("No tiene una bici que devolver");
				}
				break;
				
			case 7:
				System.out.println("Hasta pronto");
				break;
				
			default: 
				System.out.println("Opción inválida");
				break;
			}
		}while (opcion!=7);
	}

}
