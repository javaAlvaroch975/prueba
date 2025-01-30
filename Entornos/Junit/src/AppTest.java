import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    App a = new App();

    @Test
    void testComprobarExpReg() {
        assertTrue(a.comprobarExpReg("juan@gmail.com", "^\\w+@\\w+\\.\\w{2,3}$"));
    }

    @Test
    void testComprobarExpReg2() {
        assertTrue(a.comprobarExpReg("hola", "^\\w+$"));
    }

    @Test
    void testComprobarExpReg3() {
        assertTrue(a.comprobarExpReg("hola", "^\\d{7}$"));
    }

    @Test
    void testComprobarExpReg4() {
        assertTrue(a.comprobarExpReg("3453457", "^\\d{7}$"));
    }

}
