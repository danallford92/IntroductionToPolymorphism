package com.broomehill.reporting;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore(1000000, 300000000);
        PlaystationStore playstationStore = new PlaystationStore(10, 230, 20);

//        String[] appleReturnArray = appleStore.annualReturn().split(" ");
//        String appleRevenueString = appleReturnArray[appleReturnArray.length - 1];
//
//        int appleRevenue = Integer.parseInt(appleRevenueString.substring(1));
//
//        System.out.println(playstationStore.detailedAccounts());
//
//        int playstationRevenue = playstationStore.detailedAccounts().get("revenue");
//
//        int total = playstationRevenue + appleRevenue;
//        String report = "";
//        report += "playstation revenue - $" + playstationRevenue + "\n";
//        report += "apple revenue - $" + appleRevenue + "\n";
//        report += "----------\n";
//        report += "total revenue - $" + total;
//
//        System.out.println(report);



        RevenueSource playstationStoreAdapter = new PlaystationStoreAdapter(playstationStore);
        RevenueSource appleStoreAdapter = new AppleStoreAdapter(appleStore);


        String report = "";

        report += playstationStoreAdapter.getName() + " - " + playstationStoreAdapter.getRevenue() + "\n";
        report += appleStoreAdapter.getName()       + " - " + appleStoreAdapter.getRevenue()       + "\n";


        int total = playstationStoreAdapter.getRevenue() + appleStoreAdapter.getRevenue();

        report += "------------------------\n";
        report += "total - " + total;

        System.out.println(report);

//        ReportGenerator reportGenerator = new ReportGenerator();
//
//        String report = reportGenerator.generateReport(List.of(playstationStoreAdapter, appleStoreAdapter));

    }
}
