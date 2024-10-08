package br.senai.lab365.exercicio03.models;

public class InformacoesPagamento {

    private String cpfPessoaMedica;
    private String idTransacaoPix;

    public String getCpfPessoaMedica() {
        return cpfPessoaMedica;
    }

    public String getIdTransacaoPix() {
        return idTransacaoPix;
    }

    public void setCpfPessoaMedica(String cpfPessoaMedica) {
        this.cpfPessoaMedica = cpfPessoaMedica;
    }

    public void setIdTransacaoPix(String idTransacaoPix) {
        this.idTransacaoPix = idTransacaoPix;
    }
}
