package oo.encapsulamento.exemplo2.etapa2.incorreto;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

	private int pontosDeVida;
	private boolean invencivel;
	private List<Item> itens = new ArrayList<>();

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public boolean isInvencivel() {
		return invencivel;
	}

	public void setInvencivel(boolean invencivel) {
		this.invencivel = invencivel;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}
