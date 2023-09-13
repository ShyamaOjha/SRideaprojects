import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char x34=sc.next().charAt(0);
        if(x34=='i')
            System.out.print("enter which question you want to see - ");
        {   int x1222= sc.nextInt();
            LinkedList<Integer> l1=new LinkedList<>();
            l1.add(78);l1.add(34); l1.add(12); l1.add(98);
            System.out.print("original linked list - "+l1);
           switch (x1222)
           {
               case 1:
                   System.out.println();
               System.out.print("answer "+l1);
               break;
               case 2:
                   l1.set(0,72);
                   l1.set(2,67);
                   l1.set(3,76);
                   System.out.println();
                   System.out.println("final array - "+l1);
                   break;
               case 3:
                   LinkedList <Integer> a3=new LinkedList<>();
                   a3.add(45);   a3.add(89);   a3.add(23);   a3.add(56);
                   l1.addAll(a3);
                   System.out.println();
                   System.out.print("final array - "+l1);
                   break;
               case 4:
                   LinkedList <Integer> a41=new LinkedList<>();
                   a41.add(45);   a41.add(89);   a41.add(23);   a41.add(56); a41.add(19); a41.add(17);a41.add(86);
                   a41.remove(l1);
                   System.out.println();
                   System.out.print("even - ");
                   for (int i:a41) {

                       if(i%2==0)
                       {
                           System.out.print(i+" ");
                       }}
                   System.out.println();
                   System.out.print("odd - ");
                   for (int i:a41) {

                       if(i%2!=0)
                       {
                           System.out.print(i+" ");
                       }
                   }
                   break;
               case 5:
                   LinkedList <Integer> l5=new LinkedList<>();
                   int n = sc.nextInt();
                   for (int i = 0; i < n; i++) {
                       int element = sc.nextInt();
                       l5.add(element);
                   }
                   System.out.println(l5+" ");
                   System.out.println();
                   System.out.print("even = ");
                   for (int i:l5) {
                       if(i%2==0)
                       {
                           System.out.print(i+" ");
                       }}
                   System.out.println();
                   System.out.print("odd = ");
                   for (int i:l5) {
                       if(i%2!=0)
                       {
                           System.out.print(i+" ");
                       }}
               break;
            case 6:
                ArrayList <Integer> l6=new ArrayList<>();
                System.out.print("enter the number you wanr to enter in arraylsit - ");
                int n2 = sc.nextInt();
                System.out.print("enter the number - ");
                for (int i = 0; i < n2; i++) {
                    int element = sc.nextInt();
                    l6.add(element);
                }
                System.out.println(l6+" ");
                System.out.println();
                System.out.print("even = ");
                for (int i:l6) {
                    if(i%2==0)
                    {
                        System.out.print(i+" ");
                    }}
                System.out.println();
                System.out.print("odd = ");
                for (int i:l6) {
                    if(i%2!=0)
                    {
                        System.out.print(i+" ");
                    }}
           break;
           }
        }
    }
}