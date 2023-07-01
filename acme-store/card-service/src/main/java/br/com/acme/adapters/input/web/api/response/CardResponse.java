package br.com.acme.adapters.input.web.api.response;

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
public class CardResponse {
    private Long id;
    private String name;
    private String email;
    private String document;
    private String phone;

}
