package com.broomehill.reporting;

public class AppleStore {

    private final int profit;
    private final int revenue;

    public AppleStore(int profit, int revenue) {
        this.profit = profit;
        this.revenue = revenue;
    }

    public String annualReturn() {
        return "This year we made a profit of $" + profit + " which is really good and an annual revenue of $" + revenue;
    }
}
