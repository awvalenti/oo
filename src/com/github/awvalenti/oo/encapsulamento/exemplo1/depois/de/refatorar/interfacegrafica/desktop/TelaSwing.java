package com.github.awvalenti.oo.encapsulamento.exemplo1.depois.de.refatorar.interfacegrafica.desktop;

import javax.swing.JPanel;
import javax.swing.JTextField;

import com.github.awvalenti.oo.encapsulamento.exemplo1.depois.de.refatorar.entidades.Venda;

@SuppressWarnings("serial")
public class TelaSwing extends JPanel {

	private JTextField campoValorTotalVenda = new JTextField();

	public TelaSwing() {
		add(campoValorTotalVenda);
	}

	public void atualizarValorTotalVenda(Venda venda) {
		// Trechos 1 e 2 mesclados
		campoValorTotalVenda.setText(venda.calcularValorTotal().toString());
	}

}
