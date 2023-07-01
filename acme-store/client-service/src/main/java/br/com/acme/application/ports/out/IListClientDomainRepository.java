package br.com.acme.application.ports.out;

import java.util.List;

import br.com.acme.application.domain.entity.ClientDomain;

public interface IListClientDomainRepository {
    List<ClientDomain> execute();
}
