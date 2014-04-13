package oo.encapsulamento.exemplo2.etapa2.correto;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

	private int pontosDeVida;
	private boolean invencivel;
	private List<Item> itens = new ArrayList<>();

	public void receberAtaque(Inimigo inimigo) {
		int dano;

		if (invencivel) {
			// Nenhum dano, por estar invencivel
			dano = 0;
		} else if (inimigo.ehMaior() ) {
			// Dano de inimigo maior: 2
			dano = 2;
		} else if (inimigo.ehChefe()) {
			// Dano de chefe: todos os pontos de vida
			dano = pontosDeVida;
		} else {
			// Dano normal: 1
			dano = 1;
		}

		if (dano > 0) {
			// Aplica dano apropriado
			pontosDeVida -= dano;

			// Se dano for positivo, perde todos os itens
			itens.clear();
		}
	}

	public boolean morreu() {
		return pontosDeVida <= 0;
	}

}
