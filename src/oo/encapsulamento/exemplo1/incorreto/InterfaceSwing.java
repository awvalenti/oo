package oo.encapsulamento.exemplo1.incorreto;

import java.math.BigDecimal;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfaceSwing extends JPanel {
	private static final long serialVersionUID = 1L;

	private JTextField campoValorTotalVenda;

	private Venda venda;

	// ...
	
	public void atualizarValorTotalVenda() {
		// Trecho 1
		BigDecimal valorTotalVenda = BigDecimal.ZERO;
		for (ItemVenda item : venda.getItens()) {
			valorTotalVenda = valorTotalVenda.add(item.getProduto().getValor().multiply(item.getQuantidade()));
		}
		
		// Trecho 2
		campoValorTotalVenda.setText(valorTotalVenda.toString());
	}

}
