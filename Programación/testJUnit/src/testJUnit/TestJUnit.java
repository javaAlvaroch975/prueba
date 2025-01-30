package testJUnit;

public class TestJUnit {

	int func1(int x) {
		int m;
		switch (x) {
		case 1:
		m = 5;
		break;
		case 2:
		m = 2 * x;
		break;
		default:
		m = 0;
		}
		return m;
		}
		boolean esMayorEdad(int edad) {
		if (edad >= 18) {
		return true;
		} else {
		return false;
		}
		
		}
	}
