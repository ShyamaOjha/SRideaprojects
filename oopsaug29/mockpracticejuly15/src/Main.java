interface A{
    final int a = 10;
    default void add(){
        System.out.println("This is add");
    }
    static void sub(){
        System.out.println("this is sub");
    }
    void div();


}
abstract class B implements A{
    final int b=20;
    @Override
    public void div() {
        System.out.println("this is div");
    }
    void arpit(){
        this.div();
        System.out.println("this is arpit");
    }
    abstract void show();
    abstract void display();
    

}
class C extends B {
    @Override
    void show() {
        super.arpit();
        System.out.println("This is show");
    }

    @Override
    void display() {
        this.show();
        System.out.println("this is dispaly");
    }
}

public class Main {
    public static void main(String[] args) {
    new C().display();
    }

        }

