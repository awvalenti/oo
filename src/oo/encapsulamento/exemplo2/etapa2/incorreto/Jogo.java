package oo.encapsulamento.exemplo2.etapa2.incorreto;

public class Jogo {

	private Personagem personagem;

	public void aoColidirComInimigo(Inimigo inimigo) {
		int dano;

		if (personagem.isInvencivel()) {
			// Nenhum dano por estar invencivel
			dano = 0;
		} else if (inimigo.ehMaior() ) {
			// Dano de inimigo maior: 2
			dano = 2;
		} else if (inimigo.ehChefe()) {
			// Dano de chefe: todos os pontos de vida
			dano = personagem.getPontosDeVida();
		} else {
			// Dano normal: 1
			dano = 1;
		}

		// Aplica dano apropriado dependendo do inimigo
		personagem.setPontosDeVida(personagem.getPontosDeVida() - dano);

		if (personagem.getPontosDeVida() == 0) { // Personagem morreu
			mostrarMensagemVocePerdeu();
			reiniciarFase();
		}
	}

	private void mostrarMensagemVocePerdeu() {
		// ...
	}

	private void reiniciarFase() {
		// ...
	}

}
