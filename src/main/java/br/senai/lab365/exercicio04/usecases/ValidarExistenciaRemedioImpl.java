package br.senai.lab365.exercicio04.usecases;

import br.senai.lab365.exercicio04.entitties.Remedio;
import br.senai.lab365.exercicio04.repositories.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidarExistenciaRemedioImpl implements ValidarExistenciaRemedio {

    private final RemedioRepository remedioRepository;
    private final SalvarRemedioUseCase salvarRemedioUseCase;

    @Autowired
    public ValidarExistenciaRemedioImpl(RemedioRepository remedioRepository, SalvarRemedioUseCase salvarRemedioUseCase) {
        this.remedioRepository = remedioRepository;
        this.salvarRemedioUseCase = salvarRemedioUseCase;
    }

    @Override
    public Remedio obterRemedio(Integer remedioId, String remedioNome, Integer remedioDosagemMg) {
        if(remedioRepository.existePorId(remedioId)) {
            return remedioRepository.getRemedioPorId(remedioId);
        }
        if(remedioRepository.existePorNome(remedioNome)) {
            return remedioRepository.getRemedioPorNome(remedioNome);
        }
        return salvarRemedioUseCase.salvar(remedioNome, remedioDosagemMg);
    }
}
