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

import br.com.acme.adapters.input.web.api.request.ClientRequest;
import br.com.acme.adapters.input.web.api.response.ClientResponse;

@RequestMapping("/api/v1/clients")
public interface ClientApi {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<ClientResponse> create(@RequestBody ClientRequest clientRequest);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<List<ClientResponse>> list();

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<ClientResponse> get(@PathVariable("id") Long id);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<?> delete(@PathVariable("id") Long id);


}
