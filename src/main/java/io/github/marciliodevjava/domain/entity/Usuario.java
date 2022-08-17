package io.github.marciliodevjava.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	@NotEmpty(message = "{campo.login.obrigatorio}")
	private String login;
	@Column
	@NotEmpty(message = "{campo.senha.obrigatorio}")
	private String senha;
	private boolean admin;

	public Usuario(Integer id, @NotEmpty(message = "{campo.login.obrigatorio}") String login,
			@NotEmpty(message = "{campo.senha.obrigatorio}") String senha, boolean admin) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.admin = admin;
	}

}
