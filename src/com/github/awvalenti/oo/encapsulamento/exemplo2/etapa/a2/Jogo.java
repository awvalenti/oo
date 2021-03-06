package com.github.awvalenti.oo.encapsulamento.exemplo2.etapa.a2;

public class Jogo {

	private Personagem personagem;
	private boolean modoDesafio;

	public Jogo(Personagem personagem, boolean modoDesafio) {
		this.personagem = personagem;
		this.modoDesafio = modoDesafio;
	}

	public void aoColidirComCaqui() {
		// Coletou um caqui
		personagem.setContagemDeCaquis(personagem.getContagemDeCaquis() + 1);

		// A cada 10 caquis, aumenta um ponto de vida
		if (personagem.getContagemDeCaquis() % 10 == 0) {
			personagem.setPontosDeVida(personagem.getPontosDeVida() + 1);
		}
	}

	public void aoColidirComItemDeInvencibilidade() {
		if (!modoDesafio) {
			personagem.setInvencivel(true);
		}
	}

	public void aoColidirComInimigo(Inimigo inimigo) {
		int dano = 0;

		if (personagem.isInvencivel()) {
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
			dano = personagem.getPontosDeVida();
		}

		if (dano > 0) {
			// Aplica dano apropriado
			personagem.setPontosDeVida(personagem.getPontosDeVida() - dano);

			// Quando sofre dano, personagem perde os caquis coletados
			personagem.setContagemDeCaquis(0);
		}

		// Verifica se personagem morreu
		if (personagem.getPontosDeVida() <= 0) {
			reiniciarFase();
		}
	}

	private void reiniciarFase() {
		// ...
	}

}
