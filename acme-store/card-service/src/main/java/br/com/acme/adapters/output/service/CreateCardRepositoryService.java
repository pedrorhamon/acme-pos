package br.com.acme.adapters.output.service;

import org.springframework.stereotype.Service;

import br.com.acme.adapters.output.entity.Card;
import br.com.acme.adapters.output.repository.CardRepository;
import br.com.acme.application.domain.entity.CardDomain;
import br.com.acme.application.domain.mapper.ports.out.ICardRepository;
import br.com.acme.application.mapper.ConverterDTO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CreateCardRepositoryService implements ICardRepository {

    private final CardRepository cardRepository;
    private final ConverterDTO converterDTO;
    @Override
    public CardDomain execute(CardDomain cardDomain) {
        var entity = (Card) converterDTO.convertObject(cardDomain, Card.class);
        var domain = (CardDomain) converterDTO.convertObject(this.cardRepository.save(entity), CardDomain.class);

        return domain;
    }
}
