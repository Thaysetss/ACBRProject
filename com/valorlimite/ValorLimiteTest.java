package br.com.valorlimite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.particaoequivalencia.MesCartaoCredito;

class ValorLimiteTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void testMesMinimoValido() {
		int mes = 1;
		assertTrue(new MesCartaoCredito().validaMesCartaoCredito(mes));
	}
	
	@Test
	void testMesMaximoValido() {
		int mes = 12;
		assertTrue(new MesCartaoCredito().validaMesCartaoCredito(mes));
	}
	
	@Test
	void testMesMenorInvalido() {
		int mes = 0;
		assertTrue(!new MesCartaoCredito().validaMesCartaoCredito(mes));
	}

	@Test
	void testMesMaiorInvalido() {
		int mes = 13;
		assertTrue(!new MesCartaoCredito().validaMesCartaoCredito(mes));
	}

}
