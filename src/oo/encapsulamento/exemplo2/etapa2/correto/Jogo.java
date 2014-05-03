package oo.encapsulamento.exemplo2.etapa2.correto;

public class Jogo {

	private Personagem personagem;
	private boolean modoDesafio;

	public Jogo(Personagem personagem, boolean modoDesafio) {
		this.personagem = personagem;
		this.modoDesafio = modoDesafio;
	}

	public void aoColidirComCaqui() {
		personagem.coletarCaqui();
	}

	public void aoColidirComItemDeInvencibilidade() {
		if (!modoDesafio) {
			personagem.ficarInvencivel();
		}
	}

	public void aoColidirComInimigo(Inimigo inimigo) {
		personagem.receberAtaque(inimigo);

		if (personagem.morreu()) {
			reiniciarFase();
		}
	}

	private void reiniciarFase() {
		// ...
	}

}
