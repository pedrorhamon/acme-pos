package br.com.acme.application.domain.mapper.ports.usecase;

import org.springframework.stereotype.Service;

import br.com.acme.application.domain.entity.CardDomain;
import br.com.acme.application.domain.mapper.ports.in.ICreateCardDomainUseCase;
import br.com.acme.application.domain.mapper.ports.out.ICardRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CreateCardDomainUseCase implements ICreateCardDomainUseCase {

    private final ICardRepository iCreateCardRepository;

    @Override
    public CardDomain execute(CardDomain cardDomain) {
        return cardDomain.save(iCreateCardRepository);
    }
}
