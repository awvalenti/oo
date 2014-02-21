package oo.projetonovo.encapsulamento.exemplo2.correto;

public class Jogo {

	private Personagem personagem;

	public void aoColidirComInimigo() {
		personagem.receberAtaque();

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
