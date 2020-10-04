package br.com.particaoequivalencia;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MesCartaoCreditoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMesValido() {
		int mes = 9;
		assertTrue(new MesCartaoCredito().validaMesCartaoCredito(mes));
	}
	
	@Test
	void testMesMenorZero() {
		int mes = -8;
		assertTrue(!new MesCartaoCredito().validaMesCartaoCredito(mes));
	}

	@Test
	void testMesMaiorInvalido() {
		int mes = 21;
		assertTrue(!new MesCartaoCredito().validaMesCartaoCredito(mes));
	}

}
