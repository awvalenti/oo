package oo.encapsulamento.exemplo2.etapa2.correto;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

	private int pontosDeVida;
	private List<Item> itens = new ArrayList<Item>();
	private boolean invencivel;

	public void adicionarItem(Item item) {
		itens.add(item);
	}

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
		}
	}

	public boolean morreu() {
		return pontosDeVida <= 0;
	}

	public void setInvencivel(boolean b) {
		// TODO Auto-generated method stub

	}

}
