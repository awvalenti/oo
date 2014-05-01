package oo.encapsulamento.exemplo2.etapa2.correto;

public class Jogo {

	private Personagem personagem;
	private boolean invencibilidadePermitida;

	public Jogo(Personagem personagem, boolean invencibilidadePermitida) {
		this.personagem = personagem;
		this.invencibilidadePermitida = invencibilidadePermitida;
	}

	public void aoColidirComCaqui() {
		personagem.coletarCaqui();
	}

	public void aoColidirComItemDeInvencibilidade() {
		if (invencibilidadePermitida) {
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
