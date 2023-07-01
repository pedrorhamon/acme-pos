package br.com.acme.adapters.input.web.api.exception.errors;

public class ClientNotFundException extends RuntimeException{

    private static final long serialVersionUID = 4885956762507433634L;

	public ClientNotFundException(Long id) {
        super(String.format("Client with %d not found", id));
    }
}
