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
			// Nenhum dano, por estar invencivel
			dano = 0;
		} else if (inimigo.ehMenor()) {
			// Dano de inimigo menor: 1
			dano = 1;
		} else if (inimigo.ehMaior()) {
			// Dano de inimigo maior: 2
			dano = 2;
		} else if (inimigo.ehChefe()) {
			// Dano de chefe: todos os pontos de vida
			dano = pontosDeVida;
		}

		if (dano > 0) {
			// Aplica dano apropriado
			pontosDeVida -= dano;

			// Quando sofre dano, personagem perde os caquis coletados
			contagemDeCaquis = 0;
		}
	}

	public boolean morreu() {
		return pontosDeVida <= 0;
	}

}
