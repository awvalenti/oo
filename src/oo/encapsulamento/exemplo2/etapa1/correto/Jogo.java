package oo.encapsulamento.exemplo2.etapa1.correto;

public class Jogo {

	private Personagem personagem;

	public void aoColidirComInimigo() {
		personagem.receberAtaque();

		if (personagem.morreu()) {
			reiniciarFase();
		}
	}

	private void reiniciarFase() {
		// ...
	}

}
