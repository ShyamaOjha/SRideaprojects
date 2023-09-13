class A2 {
    public A2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    static int a=20;static int b=10;
    static class B2{
        void add(){
            System.out.println("sum"+(a+b));
        }
        void sub(){
            System.out.println("suB"+(a-b));
        }

    }
    class C2{
        void add(){
            System.out.println("sum "+(a+b));
        }
        void sub(){
            System.out.println("sub "+(a-b));
        }
    }
    static   class D2{
        void add(){
            System.out.println("add"+(a+b));
        }
        void sub(){
            System.out.println("sub"+(a-b));
        }

    }
   class E2{
        void add(){
            System.out.println("add"+(a+b));
        }
        void sub(){
            System.out.println("sub"+(a-b));
        }

    }
    static void sub()
    {
        System.out.println(a-b);
    }
    static void mul()
    {
        System.out.println(a*b);
    }
    static void divi()
    {
        System.out.println(a/b);
    }
}

