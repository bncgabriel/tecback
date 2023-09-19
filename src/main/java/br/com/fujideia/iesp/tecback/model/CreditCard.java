package br.com.fujideia.iesp.tecback.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCard {
    private String Titular;
    private String CPF;
    private Integer numCard;
    private Integer Validade;
    private Integer cvv;

}
