package br.com.acme.adapters.input.web.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.acme.adapters.input.web.api.CardApi;
import br.com.acme.adapters.input.web.api.request.CardRequest;
import br.com.acme.adapters.input.web.api.response.CardResponse;
import br.com.acme.application.domain.entity.CardDomain;
import br.com.acme.application.domain.mapper.ports.in.ICreateCardDomainUseCase;
import br.com.acme.application.domain.mapper.ports.in.IDeleteCardDomainByIdUseCase;
import br.com.acme.application.domain.mapper.ports.in.IGetCardDomainGetByIdUseCase;
import br.com.acme.application.domain.mapper.ports.in.IListCardDomainUseCase;
import br.com.acme.application.mapper.ConverterDTO;
import lombok.AllArgsConstructor;

/**
 * @author pedroRhamon
 */
@RestController
@AllArgsConstructor
public class CardController implements CardApi {

	private final ICreateCardDomainUseCase iCreateCardDomainUseCase;
	private final IListCardDomainUseCase iListCardDomainUseCase;
	private final IGetCardDomainGetByIdUseCase iGetCardDomainGetByIdUseCase;
	private final IDeleteCardDomainByIdUseCase iDeleteCardDomainByIdUseCase;
	
    private final ConverterDTO converterDTO;

	@Override
	public ResponseEntity<CardResponse> create(CardRequest cardRequest) {
        var domain = (CardDomain) converterDTO.convertObject(cardRequest, CardDomain.class);
        var response = this.iCreateCardDomainUseCase.execute(domain);
        return ResponseEntity.ok((CardResponse) converterDTO.convertObject(response, CardResponse.class));
	}

	@Override
	public ResponseEntity<List<CardResponse>> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<CardResponse> get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
