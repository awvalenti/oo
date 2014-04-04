package oo.encapsulamento.exemplo1.correto;

import java.math.BigDecimal;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InterfaceSwing extends JPanel {
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
