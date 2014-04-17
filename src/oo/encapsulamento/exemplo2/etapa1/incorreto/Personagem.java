package oo.encapsulamento.exemplo2.etapa1.incorreto;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

	private int pontosDeVida;
	private List<Item> itens = new ArrayList<Item>();

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}
