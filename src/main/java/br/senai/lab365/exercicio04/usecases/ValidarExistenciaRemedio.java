package br.senai.lab365.exercicio04.usecases;

import br.senai.lab365.exercicio04.entitties.Remedio;

public interface ValidarExistenciaRemedio {
    Remedio obterRemedio(Integer remedioId, String remedioNome, Integer remedioDosagemMg);
}
