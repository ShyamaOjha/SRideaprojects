import java.util.Scanner;
class A extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+ " ");
        }
}}
class B implements Runnable{

    @Override
    public void run() {
        System.out.println("hello");
    }
}
public class Main extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x324234= sc.nextInt();
        switch (x324234)
        {
            case 1:
            Main t1=new Main();
            t1.start();
            break;
            case 2:
            B b1=new B();
            Thread t12=new Thread(b1);
            t12.start();
                break;
            case 3:
            Thread T1=new Thread("hello");
            T1.start();
                String name = T1.getName();
                System.out.println(name);
                break;
            case 4:
                Runnable r1 = new B();
                Thread th1 = new Thread(r1, "My new thread");
                th1.start();
                String str = th1.getName();
                System.out.println(str);
                break;
            case 5:
               A a1=new A();
               A a2=new A();
               a1.start();
                a2.start();
                break;
        }
    }
}