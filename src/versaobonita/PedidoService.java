package versaobonita;

import dummies.CancelamentoDao;
import dummies.CancelamentoInvalidoException;
import dummies.CancelamentoPedido;
import dummies.EmailService;
import dummies.Pedido;

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
