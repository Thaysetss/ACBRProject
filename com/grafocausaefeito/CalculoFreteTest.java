package br.com.grafocausaefeito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculoFreteTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	/*
	 * Cenário 01: 
	 * 		Valor da compra R$59,99 
	 * 		Quantidade de itens: 2 
	 * 		RESULTADO: Cobra frete
	 */

	@Test
	void testCompraAbaixoValorMinimo() {
		double valorCompra = 59.99;
		int qtdItens = 2;
		CalculoFrete frete = new CalculoFrete();
		assertEquals(19.99, frete.calculaFrete(valorCompra, qtdItens) , "Cálculo de frete não está retornando o valor esperado. ");
	}
	
	/*
	 * Cenário 02: 
	 * 		Valor da compra R$60,00 e 
	 * 		Quantidade de itens: 4 
	 * 		RESULTADO: Cobra frete
	 */
	@Test
	void testCompraValorMenorMinimo() {
		double valorCompra = 60;
		int qtdItens = 4;
		CalculoFrete frete = new CalculoFrete();
		assertEquals(19.99, frete.calculaFrete(valorCompra, qtdItens) , "Cálculo de frete não está retornando o valor esperado. ");
	}
	
	/*
	 * Cenário 03: 
	 * 		Valor da compra R$60,01 
	 * 		Quantidade de itens: 2
	 * 		Resultado: Frete grátis
	 */
	@Test
	void testCompraValorMaiorMinimoEItensIgualMinimo() {
		double valorCompra = 60.01;
		int qtdItens = 2;
		CalculoFrete frete = new CalculoFrete();
		assertEquals(0, frete.calculaFrete(valorCompra, qtdItens) , "Cálculo de frete não está retornando o valor esperado. ");
	}
	
	/*
	 * Cenário 04:
	 * 		Valor da compra R$60,01 
	 * 		Quantidade de itens: 3
	 *  	RESULTADO: Cobra frete
	 */
	@Test
	void testCompraValorMaiorMinimoEItensMaiorMinimo() {
		double valorCompra = 60.01;
		int qtdItens = 3;
		CalculoFrete frete = new CalculoFrete();
		assertEquals(19.99, frete.calculaFrete(valorCompra, qtdItens) , "Cálculo de frete não está retornando o valor esperado. ");
	}
}
