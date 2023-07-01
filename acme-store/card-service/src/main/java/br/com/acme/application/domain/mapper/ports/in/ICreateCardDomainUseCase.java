package br.com.acme.application.domain.mapper.ports.in;

import br.com.acme.application.domain.entity.CardDomain;

/**
 * @author pedroRhamon
 */
public interface ICreateCardDomainUseCase {
	CardDomain execute(CardDomain cardDomain);
}
