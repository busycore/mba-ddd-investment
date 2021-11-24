package br.com.lab.impacta.investment.service.facade.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DebitAccountRequest {
    private Double valueOfDebit;
    public  DebitAccountRequest(Double valueOfDebit) {

        this.valueOfDebit = valueOfDebit;
    }
}
