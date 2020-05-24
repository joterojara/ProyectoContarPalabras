import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * 
 * @author Jesus Otero
 *
 */
public class CContarTest {

	@Test
	void test() {
		CContar contarTest = null;
		// Comprobamos las funciones para observar si funcionan correctamente
		assertEquals(4,contarTest.contarNumeroPalabras("hola hola hola hola"));
		assertEquals(5,contarTest.contarCaracteresTotal("plato"));

	}

}
