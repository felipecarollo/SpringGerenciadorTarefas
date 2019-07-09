package br.com.treinaweb.twgerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twgerenciadortarefas.modelos.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {

}
