package br.senai.lab365.exercicio03.test;

import br.senai.lab365.exercicio03.models.FormaPagamento;
import br.senai.lab365.exercicio03.models.InformacoesPagamento;
import br.senai.lab365.exercicio03.models.PessoaPaciente;
import br.senai.lab365.exercicio03.services.PagamentoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PagamentoTeste {

    @Autowired
    public PagamentoTeste(PagamentoService pagamentoService){
        log.info("Pagamento teste chamado.");
        PessoaPaciente pessoaPacienteTeste = new PessoaPaciente();
        InformacoesPagamento informacoesPagamentoTeste = new InformacoesPagamento();
        pagamentoService.processaPagamento(pessoaPacienteTeste, FormaPagamento.PIX, informacoesPagamentoTeste, 100.0f);
    }

}
