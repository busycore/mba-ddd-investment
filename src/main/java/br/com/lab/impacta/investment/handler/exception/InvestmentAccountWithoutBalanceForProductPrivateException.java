package br.com.lab.impacta.investment.handler.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class InvestmentAccountWithoutBalanceForProductPrivateException extends RuntimeException {
    private String description;

    public String getDescription(){
        return description;
    }

    public InvestmentAccountWithoutBalanceForProductPrivateException(String message, String description) {
        super(message);

        this.description = description;
    }
}
