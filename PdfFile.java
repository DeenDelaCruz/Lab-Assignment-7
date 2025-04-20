public class PdfFile implements Document {
    private String name;
    private String writer;
    private int totalPages;

    public PdfFile(String name, String writer, int totalPages) {
        this.name = name;
        this.writer = writer;
        this.totalPages = totalPages;
    }

    public String getWriter() {
        return writer;
    }

    @Override
    public void display() {
        System.out.println("Opening PDF Document: " + name + " by " + writer + " (" + totalPages + " pages)");
    }

    @Override
    public String info() {
        return "Type: PDF, File: " + name + ", Author: " + writer + ", Pages: " + totalPages;
    }

    @Override
    public Document copy() {
        return new PdfFile(name, writer, totalPages);
    }
}