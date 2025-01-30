package comprobacionNotas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaTipoTest {

	static ComprobacionNotas cn;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cn=new ComprobacionNotas();
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
	void testTipoTest1() {
		float resultado=cn.tipoTest(40, 0);
		assertEquals(10,resultado);
	}
		
	@Test
	void testTipoTest2() {
		float resultado=cn.tipoTest(39, 0);
		assertEquals(9.75,resultado);
	}
	
	@Test
	void testTipoTest3() {
		float resultado=cn.tipoTest(39, 1);
		assertEquals(9.6875,resultado);
		}
		
		@Test
		void testTipoTest4() {
			float resultado=cn.tipoTest(30, 10);
			assertEquals(6.875,resultado);
	}
		@Test
		void testTipoTest5() {
			float resultado=cn.tipoTest(20, 10);
			assertEquals(4.375,resultado);
		}
		
		@Test
		void testTipoTest6() {
			float resultado=cn.tipoTest(30, 5);
			assertEquals(7.1875,resultado);
		}
}
