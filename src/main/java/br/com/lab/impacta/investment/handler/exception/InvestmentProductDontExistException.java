package br.com.lab.impacta.investment.handler.exception;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InvestmentProductDontExistException extends RuntimeException {
    private String description;

    public String getDescription(){
        return description;
    }

    public InvestmentProductDontExistException(String message, String description) {
        super(message);
        this.description = description;
    }
}
