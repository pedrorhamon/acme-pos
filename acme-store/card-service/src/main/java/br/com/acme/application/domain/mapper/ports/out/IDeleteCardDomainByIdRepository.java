package br.com.acme.application.domain.mapper.ports.out;

public interface IDeleteCardDomainByIdRepository {

    void execute(Long id);
}
