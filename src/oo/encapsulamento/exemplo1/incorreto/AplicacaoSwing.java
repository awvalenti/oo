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
		// Trecho 1
		BigDecimal valorTotalVenda = BigDecimal.ZERO;
		for (ItemVenda item : venda.getItens()) {
			valorTotalVenda = valorTotalVenda.add(item.calcularValor());
		}
		
		// Trecho 2
		campoValorTotalVenda.setText(valorTotalVenda.toString());
	}

}
