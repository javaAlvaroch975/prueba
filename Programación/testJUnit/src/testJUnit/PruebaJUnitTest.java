package testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaJUnitTest {

	static TestJUnit ju;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ju=new TestJUnit();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Todas las pruebas han concluido");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFunc1() {
		int resultado=ju.func1(2);
		assertEquals(4,resultado);

	}

	@Test
	void testEsMayorEdad() {
		boolean resultado=ju.esMayorEdad(18);
		assertEquals(true,resultado);
	}

}
