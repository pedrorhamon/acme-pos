package br.com.acme.adapters.output.database.h2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.acme.adapters.output.database.h2.repository.ClientRepository;
import br.com.acme.application.domain.entity.ClientDomain;
import br.com.acme.application.mapper.ConverterDTO;
import br.com.acme.application.ports.out.IListClientDomainRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ListClientDomainRepositoryService implements IListClientDomainRepository {

    private final ClientRepository clientRepository;
    private final ConverterDTO converterDTO;
    @Override
    public List<ClientDomain> execute() {
        return (List<ClientDomain>) converterDTO
                .convertLIstObjects(this.clientRepository.findAll(), ClientDomain.class);
    }
}
