package com.broomehill.reporting;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();
        PlaystationStore playstationStore = new PlaystationStore();

        RevenueSource playstationStoreAdapter = new PlaystationStoreAdapter(playstationStore);
        RevenueSource appleStoreAdapter = new AppleStoreAdapter(appleStore);


        ReportGenerator reportGenerator = new ReportGenerator();

        reportGenerator.generateReport(List.of(playstationStoreAdapter, appleStoreAdapter));
    }
}
