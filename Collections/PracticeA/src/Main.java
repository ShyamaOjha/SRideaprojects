import java.util.Scanner;
class A{ int a;int b;
    public A(int a, int b) { this.a = a; this.b = b; }
    class B{  void add(){ System.out.println("sum"+(a+b));}
        void sub(){ System.out.println("suB"+(a-b));}}
    class C{  void add(){ System.out.println("sum "+(a+b)); }
        void sub(){ System.out.println("sub "+(a-b)); }
    }
    class D{  void add(){ System.out.println("add"+(a+b));}
        void sub(){ System.out.println("sub"+(a-b));}}
    class E{
        void add(){ System.out.println("add"+(a+b)); }
        void sub(){System.out.println("sub"+(a-b)); } }
    void sub() { System.out.println(a-b); }
    void mul()  { System.out.println(a*b); }
     void divi()  { System.out.println(a/b); } }
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the question you want to see - ");
        int x123= sc.nextInt();
        System.out.print("enter first value - "); int num1 = sc.nextInt();
        System.out.print("enter second value - "); int num2 = sc.nextInt();
        switch (x123) {
            case 1:  A a1 = new A(num1, num2);
                a1.sub(); a1.mul(); a1.divi();
                System.out.println("--------------------------");
                A.B b1 = a1.new B(); b1.add(); b1.sub();
                System.out.println("--------------------------");
                A.C c1 = a1.new C(); c1.add(); c1.sub();
                System.out.println("--------------------------");
                A.D d1 = a1.new D(); d1.add();d1.sub();
                System.out.println("--------------------------");
                A.E e1 = a1.new E(); e1.add();e1.sub();
                System.out.println("---------------------------");
                break;
            case 2:
                A1.sub();A1.mul();A1.divi();
                System.out.println("------------------------- ");
                new A1.B1().add();new A1.B1().sub();
                System.out.println("------------------------- ");
                new A1.C1().add();new A1.C1().sub();
                System.out.println("------------------------- ");
                new A1.D1().add();new A1.D1().sub();
                System.out.println("------------------------- ");
                new A1.E1().add();new A1.E1().sub();
                System.out.println("------------------------- ");
                break;
            case 3:
                A2 a23=new A2(num1,num2);
                A2.sub();A2.mul();A2.divi();
                System.out.println("--------");
                new A2.B2().add();new A2.B2().sub();
                System.out.println("------------");
                A2.C2 c21=a23.new C2();
                c21.add();c21.sub();
                new A2.D2().add();new A2.D2().sub();
                System.out.println("--------------");
                System.out.println("------------");
                A2.E2 e21=a23.new E2();
                e21.add();e21.sub();
        }

    }
}