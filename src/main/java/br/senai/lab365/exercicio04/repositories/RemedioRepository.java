package br.senai.lab365.exercicio04.repositories;

import br.senai.lab365.exercicio04.entitties.Remedio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RemedioRepository {

    public void save(Remedio remedio){
        log.info("Salvando remédio: " + remedio.getNome());
    }

    public boolean existePorId(Integer idRemedio) {
        return false;
    }

    public boolean existePorNome(String nomeRemedio) {
        return false;
    }

    public Remedio getRemedioPorId(Integer idRemedio) {
        return null;
    }

    public Remedio getRemedioPorNome(String nomeRemedio) {
        return null;
    }



}
