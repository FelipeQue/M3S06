package br.senai.lab365.exercicio04.usecases;

import br.senai.lab365.exercicio04.entitties.Remedio;

public interface SalvarRemedioUseCase {
    Remedio salvar(String nome, Integer dosagemEmMg);
}