package Empleado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaVentasMayor1500() {
		float valorEsperado = 3000;
		float valorReal = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.encargado, (float)2000, (float)10);
		assertEquals(valorEsperado,valorReal);
	}
	@Test
	void testCalculoNominaBrutaVentasMayor1100Menor1500() {
		float valorEsperado = 2900;
		float valorReal = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.encargado, (float)1000, (float)10);
		assertEquals(valorEsperado,valorReal);
	}
	@Test
	void testCalculoNominaBrutaSinPrimasVentas() {
		float valorEsperado = 2800;
		float valorReal = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.encargado, (float)800, (float)10);
		assertEquals(valorEsperado,valorReal);
	}

	@Test
	void testCalculoNominaBrutaVendedor() {
		float valorEsperado = 2400;
		float valorReal = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.encargado, (float)1100, (float)10);
		assertEquals(valorEsperado,valorReal);
	}
	@Test
	void testCalculoNominaBrutaEncargado() {
		float valorEsperado = 2900;
		float valorReal = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.encargado, (float)1100, (float)10);
		assertEquals(valorEsperado,valorReal);
	}
	@Test
	void testCalculoNominaBrutaSinHorasExtra() {
		float valorEsperado = 2100;
		float valorReal = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.vendedor, (float)1000, (float)0);
		assertEquals(valorEsperado,valorReal);
	}
	@Test
	void testCalculoNominaBrutaConHorasExtra() {
		float valorEsperado = 2400;
		float valorReal = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.vendedor, (float)1000, (float)10);
		assertEquals(valorEsperado,valorReal);
	}
	

	@Test
	void testCalculoNominaNetaSinRetencion() {
		float valorEsperado = 1800;
		float valorReal = Empleado.calculoNominaNeta(1800);
		assertEquals(valorEsperado,valorReal);
	}
	@Test
	void testCalculoNominaNetaRetencion15() {
		float valorEsperado = 1870;
		float valorReal = Empleado.calculoNominaNeta(2200);
		assertEquals(valorEsperado,valorReal);
	}
	@Test
	void testCalculoNominaNetaRetencion18() {
		float valorEsperado = 2132;
		float valorReal = Empleado.calculoNominaNeta(2600);
		assertEquals(valorEsperado,valorReal);
	}

}
