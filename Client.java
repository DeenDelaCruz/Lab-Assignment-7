public class Client {
    public static void main(String[] args) {
        TemplateBank bank = new TemplateBank();

        Document a = bank.usePdf();
        a.display();
        System.out.println(a.info());
        System.out.println();

        Document b = bank.useText();
        b.display();
        System.out.println(b.info());
        System.out.println();

        Document c = bank.useSheet();
        c.display();
        System.out.println(c.info());
        System.out.println();

        Document summary = bank.freshPdf("summary_report.pdf", 30);
        summary.display();
    }
}