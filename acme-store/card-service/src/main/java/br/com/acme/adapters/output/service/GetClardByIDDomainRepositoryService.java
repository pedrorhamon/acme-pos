package br.com.acme.adapters.output.service;

import org.springframework.stereotype.Service;

import br.com.acme.adapters.input.web.api.exception.errors.CardNotFundException;
import br.com.acme.adapters.output.repository.CardRepository;
import br.com.acme.application.domain.entity.CardDomain;
import br.com.acme.application.domain.mapper.ports.out.IGetCardDomainGetByIdRepository;
import br.com.acme.application.mapper.ConverterDTO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GetClardByIDDomainRepositoryService implements IGetCardDomainGetByIdRepository {

    private final CardRepository cardRepository;
    private final ConverterDTO converterDTO;
    @Override
    public CardDomain execute(Long id) {
        var entity = this.cardRepository.findById(id);
        if (entity.isEmpty()) {
            throw new CardNotFundException(id);
        }
        return (CardDomain) converterDTO
                .convertObject(entity, CardDomain.class);
    }
}
