 class A1 {
     public A1(int a, int b) {
         this.a = a;
         this.b = b;
     }

     static int a=20;static int b=10;
     static class B1{
         void add(){
             System.out.println("sum"+(a+b));
         }
         void sub(){
             System.out.println("suB"+(a-b));
         }

     }
   static   class C1{
         void add(){
             System.out.println("sum "+(a+b));
         }
         void sub(){
             System.out.println("sub "+(a-b));
         }
     }
   static   class D1{
         void add(){
             System.out.println("add"+(a+b));
         }
         void sub(){
             System.out.println("sub"+(a-b));
         }

     }
    static class E1{
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
