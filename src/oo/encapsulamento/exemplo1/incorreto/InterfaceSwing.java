package oo.encapsulamento.exemplo1.incorreto;

import java.math.BigDecimal;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InterfaceSwing extends JPanel {

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
