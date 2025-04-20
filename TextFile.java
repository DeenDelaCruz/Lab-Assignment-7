public class TextFile implements Document {
    private String location;
    private String charset;
    private int words;

    public TextFile(String location, String charset, int words) {
        this.location = location;
        this.charset = charset;
        this.words = words;
    }

    @Override
    public void display() {
        System.out.println("Opening Text Document: " + location + " with encoding: " + charset + " (" + words + " words)");
    }

    @Override
    public String info() {
        return "Type: Text, Path: " + location + ", Encoding: " + charset + ", Words: " + words;
    }

    @Override
    public Document copy() {
        return new TextFile(location, charset, words);
    }
}
