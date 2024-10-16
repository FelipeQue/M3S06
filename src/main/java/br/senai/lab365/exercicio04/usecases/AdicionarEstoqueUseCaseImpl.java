package br.senai.lab365.exercicio04.usecases;

import br.senai.lab365.exercicio04.entitties.Estoque;
import br.senai.lab365.exercicio04.entitties.Remedio;
import br.senai.lab365.exercicio04.exceptions.ParametroInvalidoException;
import br.senai.lab365.exercicio04.repositories.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdicionarEstoqueUseCaseImpl implements AdicionarEstoqueUseCase {

    private final EstoqueRepository estoqueRepository;
    private final ValidarExistenciaRemedioUseCase validarExistenciaRemedioUseCase;

    @Autowired
    public AdicionarEstoqueUseCaseImpl(EstoqueRepository estoqueRepository,
                                       ValidarExistenciaRemedioUseCase validarExistenciaRemedioUseCase) {
        this.estoqueRepository = estoqueRepository;
        this.validarExistenciaRemedioUseCase = validarExistenciaRemedioUseCase;
    }

    @Override
    public void adicionar(Integer quantidade, Integer remedioId, String remedioNome, Integer remedioDosagemMg) {
        validarQuantidade(quantidade);
        Remedio remedio = validarExistenciaRemedioUseCase.obterRemedio(remedioId, remedioNome, remedioDosagemMg);
        Estoque estoque = encontrarEstoque(remedio);
        estoque.setQuantidade(estoque.getQuantidade() + quantidade);
        estoqueRepository.save(estoque);
    }

    private Estoque encontrarEstoque(Remedio remedio) {
        Estoque estoqueAtual = estoqueRepository.getEstoqueAtual(remedio.getId());
        if (estoqueAtual == null) {
            Estoque estoque = new Estoque();
            estoque.setIdRemedio(remedio.getId());
            estoque.setQuantidade(0);
            estoqueRepository.save(estoque);
            return estoque;
        }
        return estoqueAtual;
    }

    private void validarQuantidade(Integer quantidade) {
        if (quantidade < 0) {
            throw new ParametroInvalidoException("quantidade", "Quantidade adicionada no estoque não pode ser negativa. ");
        }
    }

}
