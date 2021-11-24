package br.com.lab.impacta.investment.application.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class InvestmentResponse {
    private Long id;
    private Double value;
    private Date date;

    public InvestmentResponse(Long id, Double value, Date date) {
        this.id = id;
        this.value = value;
        this.date = date;
    }
}
