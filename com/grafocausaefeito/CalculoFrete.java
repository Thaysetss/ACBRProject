package br.com.grafocausaefeito;

import java.security.InvalidParameterException;

public class CalculoFrete {

	private double valorFreteGratis = 60;
	private int qtdFreteGratis = 3;

	public double calculaFrete(double valorCompra, int qtdItens) {

		if (valorCompra <= valorFreteGratis) {
			return 19.99;
		} else if (valorCompra > valorFreteGratis && qtdItens >= qtdFreteGratis) {
			return 19.99;
		} else if (valorCompra > valorFreteGratis && qtdItens < qtdFreteGratis) {
			return 0;
		}
		throw new InvalidParameterException(
				"Valor da compra ou quantidade de itens n�o possui regra definida de c�lculo de frete.");
	}
}
