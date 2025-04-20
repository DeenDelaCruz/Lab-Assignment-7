public interface Document extends Cloneable {
    Document copy();
    void display();
    String info();
}