package br.com.acme.application.ports.in;

import java.util.List;

import br.com.acme.application.domain.entity.ClientDomain;

public interface IListClientDomainUseCase {

    List<ClientDomain> execute();
}
