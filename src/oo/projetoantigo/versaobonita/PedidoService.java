package oo.projetoantigo.versaobonita;

import oo.projetoantigo.dummies.CancelamentoDao;
import oo.projetoantigo.dummies.CancelamentoInvalidoException;
import oo.projetoantigo.dummies.CancelamentoPedido;
import oo.projetoantigo.dummies.EmailService;
import oo.projetoantigo.dummies.Pedido;

public class PedidoService {
	private CancelamentoDao cancelamentoDao;
	private EmailService emailService;

	public void cancelarPedido(Pedido pedido) {
		if (!pedido.podeSerCancelado()) {
			throw new CancelamentoInvalidoException();
		}

		cancelamentoDao.salvar(new CancelamentoPedido(pedido));

		emailService.enviarEmailCancelamento(pedido.getCliente().getEmail());
		emailService.enviarEmailCancelamento(pedido.getFornecedor().getEmail());
	}

}
