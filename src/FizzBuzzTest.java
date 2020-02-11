import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testEsperaba1() {
		String resultado = FizzBuzz.generarPara(1);
		String esperado = "1";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testEsperabaFizz() {
		String resultado = FizzBuzz.generarPara(3);
		String esperado = "Fizz";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testEsperabaBuzz() {
		String resultado = FizzBuzz.generarPara(5);
		String esperado = "Buzz";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testEsperabaFizzBuzz() {
		String resultado = FizzBuzz.generarPara(15);
		String esperado = "FizzBuzz";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testEsperaba28() {
		String resultado = FizzBuzz.generarPara(28);
		String esperado = "28";
		assertEquals(esperado, resultado);
	}
}
