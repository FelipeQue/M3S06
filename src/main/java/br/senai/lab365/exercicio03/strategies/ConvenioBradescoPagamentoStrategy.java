package br.senai.lab365.exercicio03.strategies;

import br.senai.lab365.exercicio03.models.FormaPagamento;
import br.senai.lab365.exercicio03.models.InformacoesPagamento;
import br.senai.lab365.exercicio03.models.PessoaPaciente;
import br.senai.lab365.exercicio03.exceptions.RegraDeNegocioException;
import br.senai.lab365.exercicio03.services.BradescoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConvenioBradescoPagamentoStrategy implements PagamentoStrategy {

    @Autowired
    private BradescoService bradescoService;

    @Override
    public FormaPagamento tipoDePagamento() {
        return FormaPagamento.CONVENIO_BRADESCO;
    }

    @Override
    public void processaPagamento(PessoaPaciente paciente, InformacoesPagamento informacoesPagamento, Float valor) {
        if(paciente.getCpf() == null) {
            throw new RegraDeNegocioException("Informações obrigatórias não preenchidas. Preencha o CPF.");
        }
        bradescoService.processaPagamento(paciente.getCpf(), informacoesPagamento.getCpfPessoaMedica(), valor);
    }
}
