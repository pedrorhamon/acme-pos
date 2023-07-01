package br.com.acme.adapters.output.service;

import org.springframework.stereotype.Service;

import br.com.acme.adapters.output.repository.CardRepository;
import br.com.acme.application.domain.mapper.ports.out.IDeleteCardDomainByIdRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DeleteCardByIdRepositoryService implements IDeleteCardDomainByIdRepository {
    private final CardRepository cardRepository;
    @Override
    public void execute(Long id) {
        this.cardRepository.deleteById(id);
    }
}
