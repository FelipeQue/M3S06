package br.senai.lab365.exercicio04.usecases;

import br.senai.lab365.exercicio04.entitties.Remedio;
import br.senai.lab365.exercicio04.exceptions.ParametroInvalidoException;
import br.senai.lab365.exercicio04.repositories.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalvarRemedioUseCaseImpl implements SalvarRemedioUseCase {

    @Autowired
    private RemedioRepository remedioRepository;

    @Override
    public Remedio salvar(String nome, Integer dosagemMg) {
        validaNome(nome);
        validaDosagem(dosagemMg);
        Remedio remedio = new Remedio();
        remedio.setNome(nome);
        remedio.setDosagemMg(dosagemMg);
        remedioRepository.save(remedio);
        return remedio;
    }

    private void validaNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new ParametroInvalidoException("nome", "Nome do remédio não pode estar vazio.");
        }
    }

    private void validaDosagem(Integer dosagemEmMg) {
        if (dosagemEmMg == null || dosagemEmMg <= 0) {
            throw new ParametroInvalidoException("dosagemEmMg", "Dosagem do remédio deve ser um valor maior que zero.");
        }
    }


}
