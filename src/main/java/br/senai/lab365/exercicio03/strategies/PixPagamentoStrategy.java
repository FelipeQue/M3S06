package br.senai.lab365.exercicio03.strategies;

import br.senai.lab365.exercicio03.models.FormaPagamento;
import br.senai.lab365.exercicio03.models.InformacoesPagamento;
import br.senai.lab365.exercicio03.models.PessoaPaciente;
import br.senai.lab365.exercicio03.services.BacenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PixPagamentoStrategy implements PagamentoStrategy {

    @Autowired
    private BacenService bacenService;

    @Override
    public FormaPagamento tipoDePagamento() {
        return FormaPagamento.PIX;
    }

    @Override
    public void processaPagamento(PessoaPaciente paciente, InformacoesPagamento informacoesPagamento, Float valor) {
        log.info("Processando pagamento PIX com o valor: {}", valor);
        if(informacoesPagamento.getIdTransacaoPix() != null) {
            bacenService.processaPix(informacoesPagamento.getIdTransacaoPix(), valor);
        }
        else {
            bacenService.geraChavePixParaPagamento(paciente.getChavePix(), valor);
        }
    }
}
