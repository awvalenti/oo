package versaofeia;

import java.math.BigDecimal;
import java.util.List;

import dummies.Cliente;
import dummies.ClienteService;
import dummies.EmailService;
import dummies.ItemVenda;
import dummies.TemplatesEmails;
import dummies.VendaDao;

public class VendaService {

	private VendaDao vendaDao;
	private ClienteService clienteService;
	private EmailService emailService;

	public VendaService(VendaDao vendaDao, ClienteService clienteService, EmailService emailService) {
		this.vendaDao = vendaDao;
		this.clienteService = clienteService;
		this.emailService = emailService;
	}

	public void realizarVendaFeio(Cliente cliente, List<ItemVenda> itens) {
		Venda venda = new Venda();
		venda.setCliente(cliente);
		venda.setItens(itens);

		BigDecimal valorTotal = BigDecimal.ZERO;

		for (ItemVenda item : itens) {
			valorTotal = valorTotal.add(item.getValor());
		}
		venda.setValorTotal(valorTotal);

		vendaDao.salvar(venda);
		emailService.enviarEmail(TemplatesEmails.VENDA_REALIZADA, cliente);

		clienteService.adicionarPontosFidelidade(cliente, 100);
	}

	public void realizarVendaBonito(Cliente cliente, List<ItemVenda> itens) {
		vendaDao.salvar(new Venda(cliente, itens));
		emailService.enviarEmail(TemplatesEmails.VENDA_REALIZADA, cliente);
		clienteService.adicionarPontosFidelidade(cliente, 100);
	}

}
