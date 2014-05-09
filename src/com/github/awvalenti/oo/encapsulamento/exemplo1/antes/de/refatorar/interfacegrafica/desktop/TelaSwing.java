package com.github.awvalenti.oo.encapsulamento.exemplo1.antes.de.refatorar.interfacegrafica.desktop;

import java.math.BigDecimal;

import javax.swing.JPanel;
import javax.swing.JTextField;

import com.github.awvalenti.oo.encapsulamento.exemplo1.antes.de.refatorar.entidades.ItemVenda;
import com.github.awvalenti.oo.encapsulamento.exemplo1.antes.de.refatorar.entidades.Venda;

@SuppressWarnings("serial")
public class TelaSwing extends JPanel {

	private JTextField campoValorTotalVenda = new JTextField();

	public TelaSwing() {
		add(campoValorTotalVenda);
	}

	public void atualizarValorTotalVenda(Venda venda) {
		// Trecho 1
		BigDecimal total = BigDecimal.ZERO;
		for (ItemVenda item : venda.getItens()) {
			total = total.add(item.getProduto().getValor().multiply(item.getQuantidade()));
		}

		// Trecho 2
		campoValorTotalVenda.setText(total.toString());
	}

}
