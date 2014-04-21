package oo.encapsulamento.exemplo2.etapa2.incorreto;

public class Jogo {

	private Personagem personagem;

	public Jogo(Personagem personagem) {
		this.personagem = personagem;
	}

	public void aoColidirComCaqui() {
		personagem.setContagemDeCaquis(personagem.getContagemDeCaquis() + 1);
	}

	public void aoColidirComItemDeInvencibilidade() {
		personagem.setInvencivel(true);
	}

	public void aoColidirComInimigo(Inimigo inimigo) {
		int dano = 0;

		if (personagem.isInvencivel()) {
			// Nenhum dano, por estar invencivel
			dano = 0;
		} else if (inimigo.ehMenor()) {
			// Dano de inimigo menor: 1
			dano = 1;
		} else if (inimigo.ehMaior()) {
			// Dano de inimigo maior: 2 (e faz perder os caquis)
			dano = 2;
			personagem.setContagemDeCaquis(0);
		} else if (inimigo.ehChefe()) {
			// Dano de chefe: todos os pontos de vida
			dano = personagem.getPontosDeVida();
		}

		// Aplica dano apropriado
		personagem.setPontosDeVida(personagem.getPontosDeVida() - dano);

		// Verifica se personagem morreu
		if (personagem.getPontosDeVida() == 0) {
			reiniciarFase();
		}
	}

	private void reiniciarFase() {
		// ...
	}

}
