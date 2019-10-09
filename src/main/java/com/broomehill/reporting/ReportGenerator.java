package com.broomehill.reporting;

import java.util.List;

public class ReportGenerator {


    public String generateReport(List<RevenueSource> revenueSources){
        int total = 0;
        String report = "";
        for(RevenueSource source: revenueSources) {
            report += source.getName() + " - " + source.getRevenue() + "\n";
            total += source.getRevenue();
        }
        report += "------------------------\n";
        report += "total - " + total;
        return report;
    }
}
