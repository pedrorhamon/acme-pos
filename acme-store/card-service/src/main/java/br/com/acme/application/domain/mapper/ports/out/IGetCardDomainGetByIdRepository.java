package br.com.acme.application.domain.mapper.ports.out;

import br.com.acme.application.domain.entity.CardDomain;

public interface IGetCardDomainGetByIdRepository {

    CardDomain execute(Long id);
}
