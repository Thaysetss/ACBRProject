package br.com.cobertura;

public class CoberturaLogicaEDecisoes {

	public String verificaAnoEscolar(double idade) {

		String anoEscolar = "";

		if (idade >= 0 && idade <= 2) {
			anoEscolar = "Ber�ario";
		} else if (idade > 2 && idade <= 4) {
			anoEscolar = "Maternal";
		} else if (idade > 4 && idade <= 6) {
			anoEscolar = "Pr�-Escola";
		} else if (idade > 6 && idade <= 7) {
			anoEscolar = "1� ano fundamental";
		} else if (idade > 7 && idade <= 8) {
			anoEscolar = "2� ano fundamental";
		} else if (idade > 8 && idade <= 9) {
			anoEscolar = "3� ano fundamental";
		} else if (idade > 9 && idade <= 10) {
			anoEscolar = "4� ano fundamental";
		} else if (idade > 10 && idade <= 11) {
			anoEscolar = "5� ano fundamental";
		} else if (idade > 11 && idade <= 12) {
			anoEscolar = "6� ano fundamental";
		} else if (idade > 12 && idade <= 13) {
			anoEscolar = "7� ano fundamental";
		} else if (idade > 13 && idade <= 14) {
			anoEscolar = "8� ano fundamental";
		} else if (idade > 14 && idade <= 15) {
			anoEscolar = "9� ano fundamental";
		}
		return anoEscolar;
	}
}




