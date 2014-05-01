package oo.encapsulamento.exemplo2.etapa2.correto;

public class Jogo {

	private Personagem personagem;
	private boolean invencibilidadeHabilitada;

	public Jogo(Personagem personagem, boolean invencibilidadeHabilitada) {
		this.personagem = personagem;
		this.invencibilidadeHabilitada = invencibilidadeHabilitada;
	}

	public void aoColidirComCaqui() {
		personagem.coletarCaqui();
	}

	public void aoColidirComItemDeInvencibilidade() {
		if (invencibilidadeHabilitada) {
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
