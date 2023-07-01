package br.com.acme.application.domain.mapper.ports.in;

import br.com.acme.application.domain.entity.CardDomain;

public interface IGetCardDomainGetByIdUseCase {
    CardDomain execute(Long id);
}
