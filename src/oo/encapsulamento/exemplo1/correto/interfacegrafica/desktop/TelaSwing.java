package oo.encapsulamento.exemplo1.correto.interfacegrafica.desktop;

import java.math.BigDecimal;

import javax.swing.JPanel;
import javax.swing.JTextField;

import oo.encapsulamento.exemplo1.correto.entidades.Venda;

@SuppressWarnings("serial")
public class TelaSwing extends JPanel {

	private JTextField campoValorTotalVenda = new JTextField();

	public void atualizarValorTotalVenda(Venda venda) {
		// Trecho 1
		BigDecimal valorTotalVenda = venda.calcularValorTotal();

		// Trecho 2
		campoValorTotalVenda.setText(valorTotalVenda.toString());
	}

}