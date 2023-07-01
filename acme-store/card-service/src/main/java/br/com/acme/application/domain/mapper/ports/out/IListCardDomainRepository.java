package br.com.acme.application.domain.mapper.ports.out;

import java.util.List;

import br.com.acme.application.domain.entity.CardDomain;

public interface IListCardDomainRepository {
    List<CardDomain> execute();
}
