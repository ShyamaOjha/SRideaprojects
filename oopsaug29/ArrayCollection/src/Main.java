import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Object a1[]=new Object[10];
       a1[2]=sc.nextInt();
        System.out.println(a1.length);
        System.out.println(a1[2]);
    }
}