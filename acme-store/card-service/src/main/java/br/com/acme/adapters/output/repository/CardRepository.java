package br.com.acme.adapters.output.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.acme.adapters.output.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
