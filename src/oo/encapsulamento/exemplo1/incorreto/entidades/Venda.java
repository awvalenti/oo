package oo.encapsulamento.exemplo1.incorreto.entidades;

import java.util.List;

public class Venda {

	private List<ItemVenda> itens;

	public Venda(List<ItemVenda> itens) {
		this.itens = itens;
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

}
