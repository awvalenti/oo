package oo.encapsulamento.exemplo2.etapa1.correto;

public class Personagem {

	private int pontosDeVida = 10;

	public void receberAtaque() {
		--pontosDeVida;
	}

	public boolean morreu() {
		return pontosDeVida <= 0;
	}

}
