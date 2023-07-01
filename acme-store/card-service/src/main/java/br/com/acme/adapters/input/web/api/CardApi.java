package br.com.acme.adapters.input.web.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.acme.adapters.input.web.api.request.CardRequest;
import br.com.acme.adapters.input.web.api.response.CardResponse;

/**
 * @author pedroRhamon
 */
@RequestMapping("/api/v1/cards")
public interface CardApi {
	
	  @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    ResponseEntity<CardResponse> create(@RequestBody CardRequest cardRequest);

	    @GetMapping
	    @ResponseStatus(HttpStatus.OK)
	    ResponseEntity<List<CardResponse>> list();

	    @GetMapping("/{id}")
	    @ResponseStatus(HttpStatus.OK)
	    ResponseEntity<CardResponse> get(@PathVariable("id") Long id);

	    @DeleteMapping("/{id}")
	    @ResponseStatus(HttpStatus.OK)
	    ResponseEntity<?> delete(@PathVariable("id") Long id);

}
