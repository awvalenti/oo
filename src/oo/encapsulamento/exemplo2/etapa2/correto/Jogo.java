package oo.encapsulamento.exemplo2.etapa2.correto;

public class Jogo {

	private Personagem personagem;

	public Jogo(Personagem personagem) {
		this.personagem = personagem;
	}

	public void aoColidirComCaqui() {
		personagem.coletarCaqui();
	}

	public void aoColidirComItemDeInvencibilidade() {
		personagem.ficarInvencivel();
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
