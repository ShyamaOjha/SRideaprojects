import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc= new Scanner(System.in);
        int x23423= sc.nextInt();
        switch (x23423)
        {
            case 1:
            A a1=new A();B b1=new B();C c1=new C();
            a1.start();b1.start();c1.start();
                break;
            case 2:
            A1 a11=new A1();Thread t11=new Thread(a11);t11.start();
            B1 b11=new B1();Thread t12=new Thread(b11);t12.start();
            C1 c11=new C1();Thread t13=new Thread(c11);t13.start();
                break;
            case 3:
                A1 a12=new A1();Thread t21=new Thread(a12);t21.start();t21.join();
                B1 b12=new B1();Thread t32=new Thread(b12);t32.start();t32.join();
                C1 c12=new C1();Thread t43=new Thread(c12);t43.start();t43.join();
                break;
            case 4:
                A a01=new A();B b01=new B();C c01=new C();
                a01.start();
                try {
                    a01.join();
                }catch (Exception ex){
                    System.out.println(ex);
                }
                b01.start();
                try {
                b01.join();
                }catch (Exception ex){
                    System.out.println(ex);
                }
                c01.start();
                try {
                c01.join();
                }catch (Exception ex){
                    System.out.println(ex);
                }
                break;
            case 5:
                A2 a21=new A2();
                B2 b21=new B2();
                a21.start();
                Thread b122=new Thread(b21);
                b122.start();
                break;

        }
    }
}