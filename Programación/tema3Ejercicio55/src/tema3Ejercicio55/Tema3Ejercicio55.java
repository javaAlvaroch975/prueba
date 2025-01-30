package tema3Ejercicio55;

public class Tema3Ejercicio55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1;i<=12;i++) {
	
	switch (i) {
	
	case 1,3,5,7,8,10,12: for (int j=1;j<=31;j++) {
		System.out.println(j+"/"+i);
	}
	System.out.println();
	break;	
	case 4,6,9,11: for (int j=1;j<=30;j++) {
		System.out.println(j+"/"+i);
	}
	System.out.println();
	break;	
	case 2:	for (int j=1;j<=28;j++) {
		System.out.println(j+"/"+i);
	}
	System.out.println();
	break;
	}
}
//Vaya, este ha sido significativamente más fácil que el anterior, un switch dentro de un for, así de simple
	}

}
