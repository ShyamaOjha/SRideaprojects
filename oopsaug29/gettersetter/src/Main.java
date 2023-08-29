class A{
    int a;
    void setA(int a)
    {
      this.a=a;
    }
}
class B extends A {
    int b;
    void setB(int b) {
        this.b=b;
    }
    void add(int a,int b) {
        System.out.println(a+b);
    }
}

public class Main {
    public static void main(String[] args) {
       B b1=new B();
       b1.add(2,3);
        }
    }

