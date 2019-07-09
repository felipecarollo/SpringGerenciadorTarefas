package br.com.treinaweb.twgerenciadortarefas.modelos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "tar_tarefas")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tar_id")
	private Long id;
	
	@Column(name = "tar_titulo", length = 50, nullable = false)
	private String titulo;
	
	@Column(name = "tar_descricao", length = 100, nullable = true)
	private String descricao;
	
	@Column(name = "tar_data_expiracao", nullable = false)
	private Date dataExpiracao;
	
	@Column(name = "tar_concluida", nullable = false)
	private Boolean concluida = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescircao() {
		return descircao;
	}

	public void setDescircao(String descircao) {
		this.descircao = descircao;
	}

	public Date getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	public Boolean getConcluida() {
		return concluida;
	}

	public void setConcluida(Boolean concluida) {
		this.concluida = concluida;
	}

}
