package oo.encapsulamento.exemplo2.etapa2.correto;

public class Personagem {

	private int contagemDeCaquis = 0;
	private boolean invencivel = false;
	private int pontosDeVida = 10;

	public void coletarCaqui() {
		++contagemDeCaquis;

		if (contagemDeCaquis % 10 == 0) {
			++pontosDeVida;
		}
	}

	public void ficarInvencivel() {
		invencivel = true;
	}

	public void receberAtaque(Inimigo inimigo) {
		int dano = 0;

		if (invencivel) {
			dano = 0;
		} else if (inimigo.ehMenor()) {
			dano = 1;
		} else if (inimigo.ehMaior()) {
			dano = 2;
		} else if (inimigo.ehChefe()) {
			dano = pontosDeVida;
		}

		if (dano > 0) {
			pontosDeVida -= dano;
			contagemDeCaquis = 0;
		}
	}

	public boolean morreu() {
		return pontosDeVida <= 0;
	}

}
