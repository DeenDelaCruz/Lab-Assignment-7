public class SheetFile implements Document {
    private String title;
    private int rows;
    private int cols;

    public SheetFile(String title, int rows, int cols) {
        this.title = title;
        this.rows = rows;
        this.cols = cols;
    }

    @Override
    public void display() {
        System.out.println("Opening Spreadsheet Document: " + title + " (" + rows + " rows, " + cols + " columns)");
    }

    @Override
    public String info() {
        return "Type: Spreadsheet, Name: " + title + ", Rows: " + rows + ", Columns: " + cols;
    }

    @Override
    public Document copy() {
        return new SheetFile(title, rows, cols);
    }
}
