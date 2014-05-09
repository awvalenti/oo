package oo.encapsulamento.exemplo1.versao.depois.de.refatorar.entidades;

import java.math.BigDecimal;
import java.util.List;

public class Venda {

	private List<ItemVenda> itens;

	public Venda(List<ItemVenda> itens) {
		this.itens = itens;
	}

	public BigDecimal calcularValorTotal() {
		BigDecimal valorTotal = BigDecimal.ZERO;
		for (ItemVenda item : itens) {
			valorTotal = valorTotal.add(item.calcularValor());
		}
		return valorTotal;
	}

}
