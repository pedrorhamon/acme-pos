package br.com.acme.adapters.output.database.h2.service;

import org.springframework.stereotype.Service;

import br.com.acme.adapters.output.database.h2.repository.ClientRepository;
import br.com.acme.application.ports.out.IDeleteClientDomainByIdRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DeleteClientByIdRepositoryService implements IDeleteClientDomainByIdRepository {
    private final ClientRepository clientRepository;
    @Override
    public void execute(Long id) {
        this.clientRepository.deleteById(id);
    }
}
