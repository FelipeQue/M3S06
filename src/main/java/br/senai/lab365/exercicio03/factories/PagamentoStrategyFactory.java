package br.senai.lab365.exercicio03.factories;

import br.senai.lab365.exercicio03.models.FormaPagamento;
import br.senai.lab365.exercicio03.strategies.PagamentoStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PagamentoStrategyFactory {

    @Autowired
    private List<PagamentoStrategy> strategies;

    public PagamentoStrategy getStrategyParaPagamento(FormaPagamento formaPagamento){
        for (PagamentoStrategy strategy : strategies) {
            if (strategy.tipoDePagamento().equals(formaPagamento)) {
                return strategy;
            }
        }
        return null;
    }

}
