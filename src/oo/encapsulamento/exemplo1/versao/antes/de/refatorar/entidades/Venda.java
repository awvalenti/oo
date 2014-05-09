package oo.encapsulamento.exemplo1.versao.antes.de.refatorar.entidades;

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
