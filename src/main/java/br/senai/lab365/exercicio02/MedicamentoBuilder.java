package br.senai.lab365.exercicio02;

public class MedicamentoBuilder {

    private String nome;
    private Integer dosagem;
    private String unidadeDosagem;
    private String nomeLaboratorio;
    private String bula;

    private MedicamentoBuilder() {
    }

    public static MedicamentoBuilder create() {
        return new MedicamentoBuilder();
    }

    public MedicamentoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public MedicamentoBuilder setDosagem(Integer dosagem) {
        this.dosagem = dosagem;
        return this;
    }

    public MedicamentoBuilder setUnidadeDosagem(String unidadeDosagem) {
        this.unidadeDosagem = unidadeDosagem;
        return this;
    }

    public MedicamentoBuilder setNomeLaboratorio(String nomeLaboratorio) {
        this.nomeLaboratorio = nomeLaboratorio;
        return this;
    }

    public MedicamentoBuilder setBula(String bula) {
        this.bula = bula;
        return this;
    }

    public Medicamento build() {
        Medicamento medicamento = new Medicamento();
        medicamento.setNome(nome);
        medicamento.setDosagem(dosagem);
        medicamento.setUnidadeDosagem(unidadeDosagem);
        medicamento.setNomeLaboratorio(nomeLaboratorio);
        medicamento.setBula(bula);
        return medicamento;
    }



}
