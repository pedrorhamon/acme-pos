package br.com.acme.adapters.input.web.api.exception.errors;

public class CardNotFundException extends RuntimeException{

    private static final long serialVersionUID = 4885956762507433634L;

	public CardNotFundException(Long id) {
        super(String.format("Card with %d not found", id));
    }
}
