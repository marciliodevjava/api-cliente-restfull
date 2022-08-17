package io.github.marciliodevjava.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.marciliodevjava.domain.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	Optional<Usuario> findByLogin(String login);
}
