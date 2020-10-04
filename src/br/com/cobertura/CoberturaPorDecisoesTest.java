package br.com.cobertura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoberturaPorDecisoesTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBercarioPrimeiraDecisao() {
		double idade = 0;
		assertEquals("Berçario", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou berçário.");
	}

	void testBercarioSegundaDecisao() {
		double idade = 2;
		assertEquals("Berçario", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou berçário.");
	}

	@Test
	void testMaternalPrimeiraDecisao() {
		double idade = 2.1;
		assertEquals("Maternal", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou maternal.");
	}

	@Test
	void testMaternalSegundaDecisao() {
		double idade = 4;
		assertEquals("Maternal", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou maternal.");
	}

	@Test
	void testPreEscolaPrimeiraDecisao() {
		double idade = 4.1;
		assertEquals("Pré-Escola", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou Pré-Escola.");
	}

	@Test
	void testPreEscolaSegundaDecisao() {
		double idade = 6;
		assertEquals("Pré-Escola", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou Pré-Escola.");
	}
	
	@Test
	void testPrimeiroAnoFundamentalPrimeiraDecisao() {
		double idade = 6.1;
		assertEquals("1º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 1º ano fundamental.");
	}

	@Test
	void testPrimeiroAnoFundamentalSegundaDecisao() {
		double idade = 7;
		assertEquals("1º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 1º ano fundamental.");
	}
	
	@Test
	void testSegundoAnoFundamentalPrimeiraDecisao() {
		double idade = 7.1;
		assertEquals("2º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 2º ano fundamental.");
	}
	
	@Test
	void testSegundoAnoFundamentalSegundaDecisao() {
		double idade = 8;
		assertEquals("2º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 2º ano fundamental.");
	}


	@Test
	void testTerceiroAnoFundamentalPrimeiraDecisao() {
		double idade = 8.1;
		assertEquals("3º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 3º ano fundamental.");
	}
	
	@Test
	void testTerceiroAnoFundamentalSegundaDecisao() {
		double idade = 9;
		assertEquals("3º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 3º ano fundamental.");
	}

	@Test
	void testQuartoAnoFundamentalPrimeiraDecisao() {
		double idade = 9.1;
		assertEquals("4º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 4º ano fundamental.");
	}
	
	@Test
	void testQuartoAnoFundamentalSegundaDecisao() {
		double idade = 10;
		assertEquals("4º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 4º ano fundamental.");
	}

	@Test
	void testQuintoAnoFundamentalPrimeiraDecisao() {
		double idade = 10.1;
		assertEquals("5º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 5º ano fundamental.");
	}
	
	@Test
	void testQuintoAnoFundamentalSegundaDecisao() {
		double idade = 11;
		assertEquals("5º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 5º ano fundamental.");
	}

	@Test
	void testSextoAnoFundamentalPrimeiraDecisao() {
		double idade = 11.1;
		assertEquals("6º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 6º ano fundamental.");
	}

	@Test
	void testSextoAnoFundamentalSegundaDecisao() {
		double idade = 12;
		assertEquals("6º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 6º ano fundamental.");
	}
	
	@Test
	void testSetimoAnoFundamentalPrimeiraDecisao() {
		double idade = 12.1;
		assertEquals("7º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 7º ano fundamental.");
	}

	@Test
	void testSetimoAnoFundamentalSegundaDecisao() {
		double idade = 13;
		assertEquals("7º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 7º ano fundamental.");
	}

	@Test
	void testOitavoAnoFundamentalPrimeiraDecisao() {
		double idade = 13.1;
		assertEquals("8º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 8º ano fundamental.");
	}

	@Test
	void testOitavoAnoFundamentalSegundaDecisao() {
		double idade = 14;
		assertEquals("8º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 8º ano fundamental.");
	}

	@Test
	void testNonoAnoFundamentalPrimeiraDecisao() {
		double idade = 14.1;
		assertEquals("9º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 9º ano fundamental.");
	}

	@Test
	void testNonoAnoFundamentalSegundaDecisao() {
		double idade = 15;
		assertEquals("9º ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Função não retornou 9º ano fundamental.");
	}

}
