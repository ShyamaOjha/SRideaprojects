import java.util.Scanner;

//abstract class A{
//    void add(){
//        System.out.println("rteg");}
//}
//abstract class C{
//    abstract void dispaly();
//}
//    class B extends C{
//    void display1(){
//        System.out.println("this is a");
//    }
//        @Override
//        void dispaly() {
//        this.display1();
//            System.out.println("this is ads");
//        }
//    }
//
//
//public class Main {
//    public static void main(String[] args) {
//        new B().dispaly();
//        }
//    }
/*
 class E
{
    protected int x = 50; void display(int x){this.x=x;
}
    void m11() {
        System.out.println(x);
    }
}
class F extends E {
int y=32;

    @Override
    void m11() {
        super.m11();
    }

    void m1() {
        System.out.println(y);
    }
    void add(){
        System.out.println(x+y);
    }
}
public class Main{
    public static void main(String[] args)
    {
        F f1=new F();
        f1.m1();
        f1.add();
    }
}*/
/*abstract class X{
    abstract void display();
    final void sub(){
        System.out.println("this is sub");
    }
    static

}
class Y extends X{
    @Override
    void display() {

    }
}*/
class A{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
class B extends A{
    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        super.getA();
        this.b = b;
    }
    void add(){
        System.out.println(getA()+b);
    }
}
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextByte();
    B b1=new B();
    b1.setA(a);b1.setB(b);
    b1.add();

    }
}