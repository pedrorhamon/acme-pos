package br.com.acme.application.domain.entity;

import java.util.List;

import br.com.acme.application.ports.out.ICreateClientRepository;
import br.com.acme.application.ports.out.IDeleteClientDomainByIdRepository;
import br.com.acme.application.ports.out.IGetClientDomainGetByIdRepository;
import br.com.acme.application.ports.out.IListClientDomainRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDomain {
    private Long id;
    private String name;
    private String email;
    private String document;
    private String phone;

    public ClientDomain save(ICreateClientRepository iCreateClientRepository){
        return iCreateClientRepository.execute(this);
    }

    public List<ClientDomain> list(IListClientDomainRepository iListClientDomainRepository){
        return iListClientDomainRepository.execute();
    }

    public ClientDomain getById(IGetClientDomainGetByIdRepository iGetClientDomainGetByIdRepository) {
        return iGetClientDomainGetByIdRepository.execute(this.id);
    }

    public void deleteClientDomain(IDeleteClientDomainByIdRepository iDeleteClientDomainByIdRepository) {
        iDeleteClientDomainByIdRepository.execute(this.id);
    }

}
