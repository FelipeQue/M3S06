package br.senai.lab365.exercicio03.strategies;

import br.senai.lab365.exercicio03.models.FormaPagamento;
import br.senai.lab365.exercicio03.models.InformacoesPagamento;
import br.senai.lab365.exercicio03.models.PessoaPaciente;

public interface PagamentoStrategy {
    FormaPagamento tipoDePagamento();

    void processaPagamento(PessoaPaciente paciente, InformacoesPagamento informacoesPagamento, Float valor);

}
