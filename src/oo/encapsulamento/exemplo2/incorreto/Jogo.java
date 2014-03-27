package oo.encapsulamento.exemplo2.incorreto;

public class Jogo {

	private Personagem personagem;

	public void aoColidirComInimigo() {
		// Personagem recebe ataque
		personagem.setPontosDeVida(personagem.getPontosDeVida() - 1);

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
