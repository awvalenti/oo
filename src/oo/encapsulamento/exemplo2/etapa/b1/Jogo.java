package oo.encapsulamento.exemplo2.etapa.b1;

public class Jogo {

	private Personagem personagem;

	public Jogo(Personagem personagem) {
		this.personagem = personagem;
	}

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
