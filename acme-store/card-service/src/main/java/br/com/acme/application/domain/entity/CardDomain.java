package br.com.acme.application.domain.entity;

import java.util.List;

import br.com.acme.application.domain.mapper.ports.out.ICardRepository;
import br.com.acme.application.domain.mapper.ports.out.IDeleteCardDomainByIdRepository;
import br.com.acme.application.domain.mapper.ports.out.IGetCardDomainGetByIdRepository;
import br.com.acme.application.domain.mapper.ports.out.IListCardDomainRepository;
import br.com.acme.application.domain.vo.FlagCard;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pedroRhamon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardDomain {
	
	private Long id;
	private FlagCard flag;
	
	public CardDomain save(ICardRepository iCreateCardRepository){
        return iCreateCardRepository.execute(this);
    }

    public List<CardDomain> list(IListCardDomainRepository iListCardDomainRepository){
        return iListCardDomainRepository.execute();
    }

    public CardDomain getById(IGetCardDomainGetByIdRepository iGetCardDomainGetByIdRepository) {
        return iGetCardDomainGetByIdRepository.execute(this.id);
    }

    public void deleteClientDomain(IDeleteCardDomainByIdRepository iDeleteCardDomainByIdRepository) {
        iDeleteCardDomainByIdRepository.execute(this.id);
    }

}
