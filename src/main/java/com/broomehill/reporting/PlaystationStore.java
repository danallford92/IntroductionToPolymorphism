package com.broomehill.reporting;

import java.util.Map;

public class PlaystationStore {

    Integer unitCost;
    Integer unitsSold;
    Integer unitPrice;

    public PlaystationStore(Integer unitCost, Integer unitsSold, Integer unitPrice) {
        this.unitCost = unitCost;
        this.unitsSold = unitsSold;
        this.unitPrice = unitPrice;
    }

    public Map<String, Integer> detailedAccounts() {
        return Map.of(
                "revenue", unitsSold * unitPrice,
                "profit", unitsSold * (unitPrice - unitCost),
                "targetSales", 4000,
                "profitPerUnit", unitPrice - unitCost);
    }
}
