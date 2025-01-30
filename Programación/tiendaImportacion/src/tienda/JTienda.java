package tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JTienda {
	
	static Tienda t;
	static Producto p;
	static Cliente c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		t=new Tienda();
		p=new Producto("libro",2,10);
		c=new Cliente("Juan",30);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Prueba concluida");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcularPago() {
		double resultado=t.calcularPago(7, p, c);
		assertEquals (14,resultado);
		
	}

}
