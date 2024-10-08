package br.senai.lab365.exercicio03.models;

public class PessoaPaciente {

    private String numeroConvenio;
    private String cpf;
    private String numeroPis;
    private String chavePix;

    public String getNumeroConvenio() {
        return numeroConvenio;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNumeroPis() {
        return numeroPis;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumeroPis(String numeroPis) {
        this.numeroPis = numeroPis;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}
