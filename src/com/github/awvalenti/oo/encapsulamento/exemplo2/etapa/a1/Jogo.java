package com.github.awvalenti.oo.encapsulamento.exemplo2.etapa.a1;

public class Jogo {

	private Personagem personagem;

	public Jogo(Personagem personagem) {
		this.personagem = personagem;
	}

	public void aoColidirComInimigo() {
		// Personagem recebe ataque
		personagem.setPontosDeVida(personagem.getPontosDeVida() - 1);

		// Verifica se personagem morreu
		if (personagem.getPontosDeVida() <= 0) {
			reiniciarFase();
		}
	}

	private void reiniciarFase() {
		// ...
	}

}
