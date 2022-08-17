package io.github.marciliodevjava.service;

import java.util.Optional;

import io.github.marciliodevjava.domain.entity.Pedido;
import io.github.marciliodevjava.domain.enums.StatusPedido;
import io.github.marciliodevjava.rest.dto.PedidoDTO;

public interface PedidoService {
	Pedido salvar(PedidoDTO dto);

	Optional<Pedido> obterPedidoCompleto(Integer id);

	void atualizaStatus(Integer id, StatusPedido statusPedido);
}
