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
		assertEquals("Ber�ario", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou ber��rio.");
	}

	void testBercarioSegundaDecisao() {
		double idade = 2;
		assertEquals("Ber�ario", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou ber��rio.");
	}

	@Test
	void testMaternalPrimeiraDecisao() {
		double idade = 2.1;
		assertEquals("Maternal", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou maternal.");
	}

	@Test
	void testMaternalSegundaDecisao() {
		double idade = 4;
		assertEquals("Maternal", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou maternal.");
	}

	@Test
	void testPreEscolaPrimeiraDecisao() {
		double idade = 4.1;
		assertEquals("Pr�-Escola", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou Pr�-Escola.");
	}

	@Test
	void testPreEscolaSegundaDecisao() {
		double idade = 6;
		assertEquals("Pr�-Escola", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou Pr�-Escola.");
	}
	
	@Test
	void testPrimeiroAnoFundamentalPrimeiraDecisao() {
		double idade = 6.1;
		assertEquals("1� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 1� ano fundamental.");
	}

	@Test
	void testPrimeiroAnoFundamentalSegundaDecisao() {
		double idade = 7;
		assertEquals("1� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 1� ano fundamental.");
	}
	
	@Test
	void testSegundoAnoFundamentalPrimeiraDecisao() {
		double idade = 7.1;
		assertEquals("2� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 2� ano fundamental.");
	}
	
	@Test
	void testSegundoAnoFundamentalSegundaDecisao() {
		double idade = 8;
		assertEquals("2� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 2� ano fundamental.");
	}


	@Test
	void testTerceiroAnoFundamentalPrimeiraDecisao() {
		double idade = 8.1;
		assertEquals("3� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 3� ano fundamental.");
	}
	
	@Test
	void testTerceiroAnoFundamentalSegundaDecisao() {
		double idade = 9;
		assertEquals("3� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 3� ano fundamental.");
	}

	@Test
	void testQuartoAnoFundamentalPrimeiraDecisao() {
		double idade = 9.1;
		assertEquals("4� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 4� ano fundamental.");
	}
	
	@Test
	void testQuartoAnoFundamentalSegundaDecisao() {
		double idade = 10;
		assertEquals("4� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 4� ano fundamental.");
	}

	@Test
	void testQuintoAnoFundamentalPrimeiraDecisao() {
		double idade = 10.1;
		assertEquals("5� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 5� ano fundamental.");
	}
	
	@Test
	void testQuintoAnoFundamentalSegundaDecisao() {
		double idade = 11;
		assertEquals("5� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 5� ano fundamental.");
	}

	@Test
	void testSextoAnoFundamentalPrimeiraDecisao() {
		double idade = 11.1;
		assertEquals("6� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 6� ano fundamental.");
	}

	@Test
	void testSextoAnoFundamentalSegundaDecisao() {
		double idade = 12;
		assertEquals("6� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 6� ano fundamental.");
	}
	
	@Test
	void testSetimoAnoFundamentalPrimeiraDecisao() {
		double idade = 12.1;
		assertEquals("7� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 7� ano fundamental.");
	}

	@Test
	void testSetimoAnoFundamentalSegundaDecisao() {
		double idade = 13;
		assertEquals("7� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 7� ano fundamental.");
	}

	@Test
	void testOitavoAnoFundamentalPrimeiraDecisao() {
		double idade = 13.1;
		assertEquals("8� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 8� ano fundamental.");
	}

	@Test
	void testOitavoAnoFundamentalSegundaDecisao() {
		double idade = 14;
		assertEquals("8� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 8� ano fundamental.");
	}

	@Test
	void testNonoAnoFundamentalPrimeiraDecisao() {
		double idade = 14.1;
		assertEquals("9� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 9� ano fundamental.");
	}

	@Test
	void testNonoAnoFundamentalSegundaDecisao() {
		double idade = 15;
		assertEquals("9� ano fundamental", new CoberturaLogicaEDecisoes().verificaAnoEscolar(idade),
				"Fun��o n�o retornou 9� ano fundamental.");
	}

}
