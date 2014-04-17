package oo.encapsulamento.exemplo2.etapa1.incorreto;

public class Jogo {

	private Personagem personagem;

	public Jogo(Personagem personagem) {
		this.personagem = personagem;
	}

	public void aoColidirComItem() {
		personagem.getItens().add(new Item());
	}

	public void aoColidirComInimigo() {
		// Personagem recebe ataque
		personagem.setPontosDeVida(personagem.getPontosDeVida() - 1);

		if (personagem.getPontosDeVida() == 0) { // Personagem morreu
			reiniciarFase();
		}
	}

	private void reiniciarFase() {
		// ...
	}

}
