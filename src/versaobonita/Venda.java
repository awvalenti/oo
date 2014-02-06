package versaobonita;

import java.math.BigDecimal;
import java.util.List;

import dummies.Cliente;
import dummies.ItemVenda;

public class Venda {

	private BigDecimal valorTotal;
	private Cliente cliente;
	private List<ItemVenda> itens;

	public Venda() {
	}

	public Venda(Cliente cliente, List<ItemVenda> itens) {
		this.cliente = cliente;
		this.itens = itens;
		preencherValorTotal();
	}

	private void preencherValorTotal() {
		valorTotal = BigDecimal.ZERO;

		for (ItemVenda item : itens) {
			valorTotal = valorTotal.add(item.getValor());
		}
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
	}

}
