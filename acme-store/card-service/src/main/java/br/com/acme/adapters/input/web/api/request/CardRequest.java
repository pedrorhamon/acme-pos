package br.com.acme.adapters.input.web.api.request;

import br.com.acme.application.domain.vo.FlagCard;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pedroRhamon
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CardRequest {

	private Long id;
	@NotNull(message = "name is not empty")
	private String name;
	@Enumerated(EnumType.STRING)
	private FlagCard flag;
}
