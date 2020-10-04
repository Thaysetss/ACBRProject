package br.com.cobertura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoberturaLogicaTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBercario() {
		double idade = 1.5;
		assertEquals("Ber�ario", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou ber��rio.");
	}

	@Test
	void testMaternal() {
		double idade = 3;
		assertEquals("Maternal", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou maternal.");
	}

	@Test
	void testPreEscola() {
		double idade = 5.5;
		assertEquals("Pr�-Escola", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou Pr�-Escola.");
	}

	@Test
	void testPrimeiroAnoFundamental() {
		double idade = 6.5;
		assertEquals("1� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 1� ano fundamental.");
	}

	@Test
	void testSegundoAnoFundamental() {
		double idade = 7.5;
		assertEquals("2� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 2� ano fundamental.");
	}

	@Test
	void testTerceiroAnoFundamental() {
		double idade = 8.5;
		assertEquals("3� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 3� ano fundamental.");
	}

	@Test
	void testQuartoAnoFundamental() {
		double idade = 10;
		assertEquals("4� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 4� ano fundamental.");
	}

	@Test
	void testQuintoAnoFundamental() {
		double idade = 11;
		assertEquals("5� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 5� ano fundamental.");
	}

	@Test
	void testSextoAnoFundamental() {
		double idade = 12;
		assertEquals("6� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 6� ano fundamental.");
	}

	@Test
	void testSetimoAnoFundamental() {
		double idade = 13;
		assertEquals("7� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 7� ano fundamental.");
	}

	@Test
	void testOitavoAnoFundamental() {
		double idade = 14;
		assertEquals("8� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 8� ano fundamental.");
	}

	@Test
	void testNonoAnoFundamental() {
		double idade = 15;
		assertEquals("9� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 9� ano fundamental.");
	}
}
