interface A{
    static void display(){

    }
    void xyz();
}
interface B{
    void add();
}
interface C{
    void mul();
}
class E implements A{
    @Override
    public void xyz() {
        System.out.println("helo anand");
    }
}



public class Main {
public static void main(String[]args){
     E e1=new E();
     e1.xyz();
        }
        }