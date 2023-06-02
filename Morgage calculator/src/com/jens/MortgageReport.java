package com.jens;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void displayPaymentPlan() {
        System.out.println();
        System.out.println("Payment Plan:");
        System.out.println("-------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }

    public void displayMortgage() {
        System.out.println("Mortgage:");
        System.out.println("---------");
        System.out.println(currency.format(calculator.calcMortgage()));
    }
}
