package br.com.fiap.checkpoint1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empregados")
public class Empregado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long codigoEmpregado;
	
	@Column(name = "nome_completo")
	String nome;
	
	String endereco;

	public Long getCodigoEmpregado() {
		return codigoEmpregado;
	}

	public void setCodigoEmpregado(Long codigoEmpregado) {
		this.codigoEmpregado = codigoEmpregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
