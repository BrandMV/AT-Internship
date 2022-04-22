package com.at.internship.domain;

import java.math.BigDecimal;

public class InvestmentAccount extends BankingAccount{
    private BigDecimal interestRate;
    public static final String =

    public InvestmentAccount(BigDecimal initialBalance, BigDecimal interestRate){
        super(initialBalance);
        if(interestRate == null)
                throw new IllegalArgumentException("Interest rate is require");
        if(BigDecimal.ZERO.compareTo(interestRate) > 0 || new BigDecimal("1.00").compareTo(interestRate) < 0)
            throw new IllegalArgumentException("Interest rate should be in the range between 0.00 and 1.00");
        this.interestRate = interestRate;
    }

    public void addYield(){
        addBalance(getBalance().multiply(interestRate)); //*Getting yield
    }

    @Override
    public String getAccountStatement(){
        return String.format("" + "Checking Account\n" +
                "Balance: %s\n " +
                "Interest Rate: %s\n", getBalance(),interestRate);
    }

}
