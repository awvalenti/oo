package oo.encapsulamento.exemplo1.incorreto;

import java.math.BigDecimal;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class AplicacaoSwing extends JFrame {
	private static final long serialVersionUID = 1L;

	private JTextField campoValorTotalVenda;

	private Venda venda;

	// ...
	
	public void atualizarValorTotalVenda() {
		BigDecimal valorTotalVenda = BigDecimal.ZERO;
		for (ItemVenda item : venda.getItens()) {
			valorTotalVenda = valorTotalVenda.add(item.getValor());
		}

		campoValorTotalVenda.setText(valorTotalVenda.toString());
	}

}
