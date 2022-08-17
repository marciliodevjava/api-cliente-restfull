package io.github.marciliodevjava.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.marciliodevjava.domain.entity.ItemPedido;

public interface ItemPedidos extends JpaRepository<ItemPedido, Integer> {

}
