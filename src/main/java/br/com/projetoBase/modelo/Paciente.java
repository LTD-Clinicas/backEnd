package br.com.projetoBase.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Paciente extends EntidadeAbstrata{
	@OneToOne
	Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}