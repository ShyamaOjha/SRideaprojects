public class Calculator {
    int a,b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add(){
        System.out.print(a+b);
    }
    void add(int x){
        System.out.print(a-b);
    }
    void add(float y){
        System.out.print(a*b);
    }
    void add(int x,int z ){
        System.out.print(a/b);
    }
}
