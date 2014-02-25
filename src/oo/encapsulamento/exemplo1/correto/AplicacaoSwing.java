package oo.encapsulamento.exemplo1.correto;

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
		BigDecimal valorTotalVenda = venda.calcularValorTotal();
		
		// Trecho 2
		campoValorTotalVenda.setText(valorTotalVenda.toString());
	}

}
