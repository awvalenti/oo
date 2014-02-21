package oo.projetonovo.encapsulamento.exemplo2.correto;

public class Personagem {

	private int pontosDeVida;

	public void receberAtaque() {
		--pontosDeVida;
	}

	public boolean morreu() {
		return pontosDeVida <= 0;
	}

}
