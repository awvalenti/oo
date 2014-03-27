package oo.encapsulamento.exemplo2.etapa2.incorreto;

public class Jogo {

	private Personagem personagem;

	public void aoColidirComInimigo(Inimigo inimigo) {
		int dano;

		if (personagem.isInvencivel()) {
			// Nenhum dano, por estar invencivel
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

		if (dano > 0) {
			// Aplica dano apropriado
			personagem.setPontosDeVida(personagem.getPontosDeVida() - dano);

			// Se dano for positivo, perde todos os itens
			personagem.getItens().clear();
		}

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
