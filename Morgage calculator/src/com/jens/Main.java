package com.jens;

public class Main {

    public static void main(String[] args) {
        int principle = (int) Console.getInput("Principle", 1000, 1000000);
        float annualRate = (float) Console.getInput("Annual Rate",1, 30);
        byte years = (byte) Console.getInput("Period in Years",1, 30);

        var calculator = new MortgageCalculator(principle, annualRate, years);
        var report = new MortgageReport(calculator);


        report.displayMortgage();
        report.displayPaymentPlan();
    }
}
