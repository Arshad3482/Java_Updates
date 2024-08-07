package com.example.adapter;

// Adapter
// This class adapts the PDFReport to the HTMLReport interface.
public class PDFToHTMLAdapter implements HTMLReport {
    private PDFReport pdfReport;  // The PDF report instance to be adapted

    // Constructor to initialize the adapter with a PDFReport instance
    public PDFToHTMLAdapter(PDFReport pdfReport) {
        this.pdfReport = pdfReport;
    }

    // Convert PDF report content to HTML format
    @Override
    public String generateHTMLReport() {
        // Wrap the PDF content in HTML tags
        return "<html><body>" + pdfReport.generatePDFReport() + "</body></html>";
    }
}
