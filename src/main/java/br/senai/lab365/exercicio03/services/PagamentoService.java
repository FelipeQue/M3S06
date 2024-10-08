package br.senai.lab365.exercicio03.services;

import br.senai.lab365.exercicio03.models.FormaPagamento;
import br.senai.lab365.exercicio03.strategies.PagamentoStrategy;
import br.senai.lab365.exercicio03.factories.PagamentoStrategyFactory;
import br.senai.lab365.exercicio03.models.InformacoesPagamento;
import br.senai.lab365.exercicio03.models.PessoaPaciente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PagamentoService {

    @Autowired
    private PagamentoStrategyFactory pagamentoStrategyFactory;

    public void processaPagamento(PessoaPaciente paciente,
                                  FormaPagamento formaPagamento,
                                  InformacoesPagamento informacoesPagamento,
                                  Float valor) {

        PagamentoStrategy pagamentoStrategy = pagamentoStrategyFactory.getStrategyParaPagamento(formaPagamento);
        log.info("Forma de pagamento: {}", formaPagamento.toString());
        pagamentoStrategy.processaPagamento(paciente, informacoesPagamento, valor);
        }


}
