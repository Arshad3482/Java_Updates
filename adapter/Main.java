package com.example.adapter;

// Client Code
// This is where the adapter is used to generate and print an HTML report.
public class Main {
    public static void main(String[] args) {
        // Create an instance of PDFReport
        PDFReport pdfReport = new PDFReport();

        // Create an adapter to convert PDF to HTML
        HTMLReport adapter = new PDFToHTMLAdapter(pdfReport);

        // Generate and print the HTML report
        System.out.println(adapter.generateHTMLReport());
    }
}
