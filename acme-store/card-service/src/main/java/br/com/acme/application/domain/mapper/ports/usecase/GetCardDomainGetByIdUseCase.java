package br.com.acme.application.domain.mapper.ports.usecase;

import org.springframework.stereotype.Service;

import br.com.acme.application.domain.entity.CardDomain;
import br.com.acme.application.domain.mapper.ports.in.IGetCardDomainGetByIdUseCase;
import br.com.acme.application.domain.mapper.ports.out.IGetCardDomainGetByIdRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GetCardDomainGetByIdUseCase implements IGetCardDomainGetByIdUseCase {

    private final IGetCardDomainGetByIdRepository iGetCardDomainGetByIdRepository;
    @Override
    public CardDomain execute(Long id) {
        return CardDomain.builder()
                .id(id)
                .build().getById(iGetCardDomainGetByIdRepository);
    }
}
