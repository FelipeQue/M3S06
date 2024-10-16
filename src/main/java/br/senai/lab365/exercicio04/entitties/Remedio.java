package br.senai.lab365.exercicio04.entitties;

public class Remedio {

    private Long id;
    private String nome;
    private Integer dosagemMg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDosagemMg() {
        return dosagemMg;
    }

    public void setDosagemMg(Integer dosagemMg) {
        this.dosagemMg = dosagemMg;
    }
}
