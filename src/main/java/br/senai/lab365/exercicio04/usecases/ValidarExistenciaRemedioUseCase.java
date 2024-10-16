package br.senai.lab365.exercicio04.usecases;

import br.senai.lab365.exercicio04.entitties.Remedio;

public interface ValidarExistenciaRemedioUseCase {
    Remedio obterRemedio(Integer remedioId, String remedioNome, Integer remedioDosagemMg);
}
