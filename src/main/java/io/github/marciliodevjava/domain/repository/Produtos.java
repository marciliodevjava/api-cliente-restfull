package io.github.marciliodevjava.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.marciliodevjava.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
