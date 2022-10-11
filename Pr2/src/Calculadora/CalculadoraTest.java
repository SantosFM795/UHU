package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	int valorEsperado;
	int valorReal;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		valorEsperado=0;
		valorReal=0;
	}

	@AfterEach
	void tearDown() throws Exception {
		valorEsperado=0;
		valorReal=0;
	}

	@Test
	void testSuma() {
		
		valorEsperado=10;
		valorReal = Calculadora.suma(7, 3);
		assertEquals(valorEsperado,valorReal);
	}
	@Test
	void testFallaSuma() {
		
		valorEsperado=6;
		valorReal = Calculadora.suma(7, 3);
		assertNotSame(valorEsperado,valorReal);
	}

	@Test
	void testResta() {
		valorEsperado=4;
		valorReal = Calculadora.resta(7, 3);
		assertEquals(valorEsperado,valorReal);
	}
	@Test
	void testFallaResta() {
		valorEsperado=1;
		valorReal = Calculadora.resta(7, 3);
		assertNotSame(valorEsperado,valorReal);
	}

	@Test
	void testMultiplica() {
		valorEsperado=21;
		valorReal = Calculadora.multiplica(7, 3);
		assertEquals(valorEsperado,valorReal);
	}
	
	@Test
	void testFallaMultiplica() {
		valorEsperado=12;
		valorReal = Calculadora.multiplica(7, 3);
		assertNotSame(valorEsperado,valorReal);
	}

	@Test
	void testDivide() {
		valorEsperado=-1;
		valorReal = Calculadora.divide(7, 0);
		assertEquals(valorEsperado,valorReal);
	}
	
	@Test
	void testFallaDivide() {
		valorEsperado=7;
		valorReal = Calculadora.divide(7, 0);
		assertNotSame(valorEsperado,valorReal);
	}

}
