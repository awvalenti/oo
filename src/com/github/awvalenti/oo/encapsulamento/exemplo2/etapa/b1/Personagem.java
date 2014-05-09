package com.github.awvalenti.oo.encapsulamento.exemplo2.etapa.b1;

public class Personagem {

	private int pontosDeVida = 10;

	public void receberAtaque() {
		--pontosDeVida;
	}

	public boolean morreu() {
		return pontosDeVida <= 0;
	}

}
