abstract class Shape1 {
  abstract void calcutearea();
}
class circle1 extends Shape1{
    int r1;

    public circle1(int r1) {
        this.r1 = r1;
    }

    @Override
    void calcutearea() {
        System.out.print("area of circle "+(3.14*r1*r1));
    }
}
class rectangle1 extends Shape1{
    int l1,b1;

    public rectangle1(int l1, int b1) {
        this.l1 = l1;
        this.b1 = b1;
    }

    @Override
    void calcutearea() {
        System.out.print("Area of rectangle = "+(l1*b1));
    }
}
