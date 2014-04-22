package oo.encapsulamento.exemplo1.incorreto.interfacegrafica.desktop;

import java.math.BigDecimal;

import javax.swing.JPanel;
import javax.swing.JTextField;

import oo.encapsulamento.exemplo1.incorreto.entidades.ItemVenda;
import oo.encapsulamento.exemplo1.incorreto.entidades.Venda;

@SuppressWarnings("serial")
public class TelaSwing extends JPanel {

	private JTextField campoValorTotalVenda = new JTextField();

	public void atualizarValorTotalVenda(Venda venda) {
		// Trecho 1
		BigDecimal valorTotalVenda = BigDecimal.ZERO;
		for (ItemVenda item : venda.getItens()) {
			valorTotalVenda = valorTotalVenda.add(item.getProduto().getValor().multiply(item.getQuantidade()));
		}

		// Trecho 2
		campoValorTotalVenda.setText(valorTotalVenda.toString());
	}

}
