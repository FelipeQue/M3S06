package br.senai.lab365.exercicio03.strategies;

import br.senai.lab365.exercicio03.models.FormaPagamento;
import br.senai.lab365.exercicio03.models.InformacoesPagamento;
import br.senai.lab365.exercicio03.models.PessoaPaciente;
import br.senai.lab365.exercicio03.exceptions.RegraDeNegocioException;
import br.senai.lab365.exercicio03.services.UnimedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConvenioUnimedPagamentoStrategy implements PagamentoStrategy {

    @Autowired
    private UnimedService unimedService;

    @Override
    public FormaPagamento tipoDePagamento() {
        return FormaPagamento.CONVENIO_UNIMED;
    }

    @Override
    public void processaPagamento(PessoaPaciente paciente, InformacoesPagamento informacoesPagamento, Float valor) {
        if(paciente.getNumeroConvenio() == null || paciente.getCpf() == null) {
            throw new RegraDeNegocioException("Informações obrigatórias não preenchidas. Preencha número de convênio e CPF.");
        }
        unimedService.processaPagamento(paciente.getCpf(), paciente.getNumeroConvenio(), informacoesPagamento.getCpfPessoaMedica());
    }
}
