package br.com.acme.application.domain.mapper.ports.in;

import java.util.List;

import br.com.acme.application.domain.entity.CardDomain;

public interface IListCardDomainUseCase {

    List<CardDomain> execute();
}
