package oo.encapsulamento.exemplo2.etapa2.correto;

public class Jogo {

	private Personagem personagem;

	public void aoColidirComInimigo(Inimigo inimigo) {
		personagem.receberAtaque(inimigo);

		if (personagem.morreu()) {
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
