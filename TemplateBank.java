public class TemplateBank {
    private PdfFile pdf;
    private TextFile text;
    private SheetFile sheet;

    public TemplateBank() {
        System.out.println("Creating a PDF Document prototype.");
        pdf = new PdfFile("annual_report_2024.pdf", "Acme Corp", 150);

        System.out.println("Creating a Text Document prototype.");
        text = new TextFile("meeting_notes.txt", "UTF-8", 250);

        System.out.println("Creating a Spreadsheet Document prototype.");
        sheet = new SheetFile("sales_data_q1.xlsx", 1000, 20);
    }

    public Document freshPdf(String name, int pages) {
        PdfFile base = (PdfFile) pdf.copy();
        return new PdfFile(name, base.getWriter(), pages);
    }

    public Document usePdf() {
        return pdf.copy();
    }

    public Document useText() {
        return text.copy();
    }

    public Document useSheet() {
        return sheet.copy();
    }
}