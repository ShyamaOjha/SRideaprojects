interface Shape {
    void calculateArea();
}
class cirlcle implements Shape{
    int r;

    public cirlcle(int r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        System.out.print("area of circle = "+(3.14*r*r));
    }
}
class rectangle implements Shape{

    int l,b;

    public rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public void calculateArea() {
        System.out.print("area of rectangle = "+(l*b));
    }
}
