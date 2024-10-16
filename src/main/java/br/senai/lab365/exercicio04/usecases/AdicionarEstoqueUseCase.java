package br.senai.lab365.exercicio04.usecases;

public interface AdicionarEstoqueUseCase {
    void adicionar(Integer quantidade, Integer remedioId, String remedioNome, Integer remedioDosagemMg);
}