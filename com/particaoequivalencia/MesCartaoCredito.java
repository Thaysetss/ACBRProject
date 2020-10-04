package br.com.particaoequivalencia;

public class MesCartaoCredito {

	public boolean validaMesCartaoCredito(int mes) {

		if (mes >= 1 && mes <= 12) {
			return true;
		}
		return false;
	}

}
