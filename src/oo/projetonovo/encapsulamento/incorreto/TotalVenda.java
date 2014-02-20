package oo.projetonovo.encapsulamento.incorreto;

import java.math.BigDecimal;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import oo.projetoantigo.dummies.ItemVenda;

public class TotalVenda extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel rotuloQuantidadeItens = new JLabel("Quantidade de itens");
	private JTextField campoQuantidadeItens;
	private JLabel rotuloValorTotalVenda;
	private JTextField campoValorTotalVenda;

	private Venda venda;

	public TotalVenda() {
		add(rotuloQuantidadeItens);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}

	public void atualizar() {
		BigDecimal totalVenda = BigDecimal.ZERO;
		for (ItemVenda item : venda.getItens()) {
			totalVenda = totalVenda.add(item.getValor());
		}

		System.out.println("Quantidade de itens: " + venda.getQuantidadeItens());
		System.out.println(totalVenda);
	}

	public static void main(String[] args) {
		new TotalVenda();
	}
}
