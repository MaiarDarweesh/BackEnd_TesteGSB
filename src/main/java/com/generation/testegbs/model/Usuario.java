package com.generation.testegbs.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
	@Table(name="tb_usuarios")
	public class Usuario {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		private String nome;
		
		@Schema (example = "nome@email.com")
		@NotNull
		@Email(message = "O usuário deve ser um email valido ex:nome@email.com")
		private String usuario;

		public Usuario(Long id, String nome, String usuario, String senha, String foto) {
			this.id = id;
			this.nome = nome;
			this.usuario = usuario;
		}
		
		//construtor vazio
		public Usuario() {}


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
}
