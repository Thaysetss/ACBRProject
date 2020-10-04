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
		assertEquals("Berçario", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou berçário.");
	}

	@Test
	void testMaternal() {
		double idade = 3;
		assertEquals("Maternal", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou maternal.");
	}

	@Test
	void testPreEscola() {
		double idade = 5.5;
		assertEquals("Pré-Escola", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou Pré-Escola.");
	}

	@Test
	void testPrimeiroAnoFundamental() {
		double idade = 6.5;
		assertEquals("1º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 1º ano fundamental.");
	}

	@Test
	void testSegundoAnoFundamental() {
		double idade = 7.5;
		assertEquals("2º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 2º ano fundamental.");
	}

	@Test
	void testTerceiroAnoFundamental() {
		double idade = 8.5;
		assertEquals("3º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 3º ano fundamental.");
	}

	@Test
	void testQuartoAnoFundamental() {
		double idade = 10;
		assertEquals("4º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 4º ano fundamental.");
	}

	@Test
	void testQuintoAnoFundamental() {
		double idade = 11;
		assertEquals("5º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 5º ano fundamental.");
	}

	@Test
	void testSextoAnoFundamental() {
		double idade = 12;
		assertEquals("6º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 6º ano fundamental.");
	}

	@Test
	void testSetimoAnoFundamental() {
		double idade = 13;
		assertEquals("7º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 7º ano fundamental.");
	}

	@Test
	void testOitavoAnoFundamental() {
		double idade = 14;
		assertEquals("8º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 8º ano fundamental.");
	}

	@Test
	void testNonoAnoFundamental() {
		double idade = 15;
		assertEquals("9º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 9º ano fundamental.");
	}
}
