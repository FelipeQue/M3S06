package br.senai.lab365.exercicio03.strategies;

import br.senai.lab365.exercicio03.models.FormaPagamento;
import br.senai.lab365.exercicio03.models.InformacoesPagamento;
import br.senai.lab365.exercicio03.models.PessoaPaciente;
import br.senai.lab365.exercicio03.exceptions.RegraDeNegocioException;
import br.senai.lab365.exercicio03.services.SusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SusPagamentoStrategy implements PagamentoStrategy {

    @Autowired
    private SusService susService;

    @Override
    public FormaPagamento tipoDePagamento() {
        return FormaPagamento.SUS;
    }

    @Override
    public void processaPagamento(PessoaPaciente paciente, InformacoesPagamento informacoesPagamento, Float valor) {
        if(paciente.getCpf() == null || paciente.getNumeroPis() == null) {
            throw new RegraDeNegocioException("Informações obrigatórias não preenchidas. Preencha número do PIS e CPF.");
        }
        susService.solicitaProcessoPagamento(paciente.getCpf(), paciente.getNumeroPis(), valor);
    }
}
