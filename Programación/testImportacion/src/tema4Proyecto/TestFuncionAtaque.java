package tema4Proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFuncionAtaque {
	
	Jugador j=new Jugador();
	Enemigo en=new Enemigo();
	
static Tema4Proyecto t;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		t=new Tema4Proyecto();
		Jugador j=new Jugador();
		Enemigo en=new Enemigo();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Prueba terminada");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAtacar() {
		int resultado=t.atacar(j, en);
		assertEquals(en.getVida(),resultado);
		
		
	}

}
