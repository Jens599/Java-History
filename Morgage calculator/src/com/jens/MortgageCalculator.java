package com.jens;

public class MortgageCalculator {

    private static final byte MONTHS_IN_A_YEAR = 12 ;
    private static final byte PERCENT = 100 ;

    private int principle;
    private float annualRate;
    private byte years;

    public double[] getRemainingBalances(){
        double[] balances = new double[getPeriodInMonths()];
        for (int remainingPeriodInMonths = 1; remainingPeriodInMonths <= (balances.length); remainingPeriodInMonths++  )
            balances[remainingPeriodInMonths - 1] = calcPaymentPlan(remainingPeriodInMonths);
        return balances;
    }

    public MortgageCalculator(int principle, float annualRate, byte years) {
        this.principle = principle;
        this.annualRate = annualRate;
        this.years = years;
    }

    public double calcPaymentPlan(int remainingPeriodInMonths) {
        float rate = getRate();
        int periodInMonths = getPeriodInMonths();
        return principle * ((Math.pow(1 + rate, periodInMonths) - Math.pow(1 + rate, remainingPeriodInMonths)) / (Math.pow(1 + rate, periodInMonths) - 1));
    }

    public double calcMortgage() {
        float rate = getRate();
        int periodInMonths = getPeriodInMonths();
        return principle * (rate * (Math.pow(1 + rate, periodInMonths)) / (Math.pow(1 + rate, periodInMonths) - 1));
    }

    private int getPeriodInMonths() {
        return years * MONTHS_IN_A_YEAR;
    }

    private float getRate() {
        return annualRate / MONTHS_IN_A_YEAR / PERCENT;
    }

}