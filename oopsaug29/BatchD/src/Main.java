import java.util.Scanner;
class A{
    short a,b;
    public static short mul(short a,short b){
        short c= (short) (a*b);

        return c;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        short a= sc.nextShort();
        short b= sc.nextShort();
        A.mul(a,b);
    }
}