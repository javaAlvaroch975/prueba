package comprobacionNotas;

public class ComprobacionNotas {

	float tipoTest(float acierto, float fallo) {
		
		float nota=(acierto-fallo/4)/4;
		return nota;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
