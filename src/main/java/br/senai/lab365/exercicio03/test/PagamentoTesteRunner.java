package br.senai.lab365.exercicio03.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class PagamentoTesteRunner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PagamentoTeste pagamentoTeste = context.getBean(PagamentoTeste.class);
        log.info("Teste de pagamento finalizado.");
    }
}