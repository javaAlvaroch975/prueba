package a;

public class A {
	int a1, a2, a3;

	
	A(){
		a1=0;
		a2=0;
		a3=0;
	}
	
		A(int a1, int a2, int a3) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
		
		int funcA1(int x, int y) {
			int z;
			z=x+y;
			return z;
		}

		int funcA2(int x, int y) {
			int z;
			z=x-y;
			return z;
		}
		
		static int funcA3(int x, int y) {
			int z;
			z=x*y;
			return z;
		}
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class B {
	
	static final int CONSTANTEB=0;
	
	int b1, b2;
	
	int getB1() {
		return b1;
	}

	void setB1(int b1) {
		this.b1 = b1;
	}

	int getB2() {
		return b2;
	}

	void setB2(int b2) {
		this.b2 = b2;
	}
	
	int funcB1(int x, int y) {
		int z;
		z=x+y;
		return z;
	}

	int funcB2(int x, int y) {
		int z;
		z=x-y;
		return z;
	}
	
	int funcB3(int x, int y) {
		int z;
		z=x*y;
		return z;
	}
	static int funcB4(int x, int y) {
		int z;
		z=x/y;
		return z;
	
}
}
class C {
	int c1,c2;
	static int c3;
	
	C() {
		c1 = 0;
		c2 = 0;
	}
	
	int getC1() {
		return c1;
	}

	void setC1(int c1) {
		this.c1 = c1;
	}

	int getC2() {
		return c2;
	}

	void setC2(int c2) {
		this.c2 = c2;
	}

	static int getC3() {
		return c3;
	}

	static void setC3(int c3) {
		C.c3 = c3;
	}


	
	int funcC1(int x, int y) {
		int z;
		z=x+y;
		return z;
	}

	C(int c1, int c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	int funcC2(int x, int y) {
		int z;
		z=x-y;
		return z;
	}
	
	static int funcC3(int x, int y) {
		int z;
		z=x*y;
		return z;
	}
	
}