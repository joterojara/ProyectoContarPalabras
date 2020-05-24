import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CContarTest {

	@Test
	void test() {
		CContar contarTest = null;
		
		assertEquals(4,contarTest.contarNumeroPalabras("hola hola hola hola"));
		assertEquals(5,contarTest.contarCaracteresTotal("plato"));

	}

}
