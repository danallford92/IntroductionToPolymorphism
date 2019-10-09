package com.broomehill;

public class ReportWriter {

    TextFormatter formatter;

    public void writeReport() {
        System.out.println(formatter.format("Sold some stuff today!! yay"));
    }
}
