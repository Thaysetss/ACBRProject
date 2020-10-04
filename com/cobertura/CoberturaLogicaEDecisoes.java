package br.com.cobertura;

public class CoberturaLogicaEDecisoes {

	public String verificaAnoEscolar(double idade) {

		String anoEscolar = "";

		if (idade >= 0 && idade <= 2) {
			anoEscolar = "Berçario";
		} else if (idade > 2 && idade <= 4) {
			anoEscolar = "Maternal";
		} else if (idade > 4 && idade <= 6) {
			anoEscolar = "Pré-Escola";
		} else if (idade > 6 && idade <= 7) {
			anoEscolar = "1º ano fundamental";
		} else if (idade > 7 && idade <= 8) {
			anoEscolar = "2º ano fundamental";
		} else if (idade > 8 && idade <= 9) {
			anoEscolar = "3º ano fundamental";
		} else if (idade > 9 && idade <= 10) {
			anoEscolar = "4º ano fundamental";
		} else if (idade > 10 && idade <= 11) {
			anoEscolar = "5º ano fundamental";
		} else if (idade > 11 && idade <= 12) {
			anoEscolar = "6º ano fundamental";
		} else if (idade > 12 && idade <= 13) {
			anoEscolar = "7º ano fundamental";
		} else if (idade > 13 && idade <= 14) {
			anoEscolar = "8º ano fundamental";
		} else if (idade > 14 && idade <= 15) {
			anoEscolar = "9º ano fundamental";
		}
		return anoEscolar;
	}
}




