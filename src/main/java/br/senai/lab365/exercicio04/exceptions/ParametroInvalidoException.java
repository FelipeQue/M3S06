package br.senai.lab365.exercicio04.exceptions;

public class ParametroInvalidoException extends RuntimeException {

    private final String campo;

    public ParametroInvalidoException(String campo, String mensagem) {
        super("Campo: " + campo + ". Mensagem: " + mensagem);
        this.campo = campo;
    }
}
