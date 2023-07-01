package br.com.acme.adapters.output.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.acme.adapters.output.repository.CardRepository;
import br.com.acme.application.domain.entity.CardDomain;
import br.com.acme.application.domain.mapper.ports.out.IListCardDomainRepository;
import br.com.acme.application.mapper.ConverterDTO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ListCardDomainRepositoryService implements IListCardDomainRepository {

    private final CardRepository cardRepository;
    private final ConverterDTO converterDTO;
    @Override
    public List<CardDomain> execute() {
        return (List<CardDomain>) converterDTO
                .convertLIstObjects(this.cardRepository.findAll(), CardDomain.class);
    }
}
