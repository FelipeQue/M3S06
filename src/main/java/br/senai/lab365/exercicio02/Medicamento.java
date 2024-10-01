package br.senai.lab365.exercicio02;

public class Medicamento {

    private String nome;
    private Integer dosagem;
    private String unidadeDosagem;
    private String nomeLaboratorio;
    private String bula;

    public Medicamento() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDosagem() {
        return dosagem;
    }

    public void setDosagem(Integer dosagem) {
        this.dosagem = dosagem;
    }

    public String getUnidadeDosagem() {
        return unidadeDosagem;
    }

    public void setUnidadeDosagem(String unidadeDosagem) {
        this.unidadeDosagem = unidadeDosagem;
    }

    public String getNomeLaboratorio() {
        return nomeLaboratorio;
    }

    public void setNomeLaboratorio(String nomeLaboratorio) {
        this.nomeLaboratorio = nomeLaboratorio;
    }

    public String getBula() {
        return bula;
    }

    public void setBula(String bula) {
        this.bula = bula;
    }
}
