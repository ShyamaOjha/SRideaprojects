interface Printable {
    void print();
}
class document implements Printable{
    @Override
    public void print() {
        System.out.println("document");
    }
}
class IMAGE implements Printable{
    @Override
    public void print() {
        System.out.println("image");
    }
}
