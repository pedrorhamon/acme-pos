package br.com.acme.application.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.acme.application.domain.entity.ClientDomain;
import br.com.acme.application.ports.in.IListClientDomainUseCase;
import br.com.acme.application.ports.out.IListClientDomainRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ListClientDomainUseCase implements IListClientDomainUseCase {

    private final IListClientDomainRepository iListClientDomainRepository;

    @Override
    public List<ClientDomain> execute() {
        return ClientDomain.builder().build().list(iListClientDomainRepository);
    }
}
