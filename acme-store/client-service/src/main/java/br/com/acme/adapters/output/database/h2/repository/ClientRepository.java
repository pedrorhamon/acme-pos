package br.com.acme.adapters.output.database.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.acme.adapters.output.database.h2.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
