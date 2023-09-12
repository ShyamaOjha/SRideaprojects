import com.sun.jdi.CharValue;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter question you want to see - ");
        int x546546= sc.nextInt();
       /* ArrayList a1=new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);*/
        switch (x546546)
        {
            case 1:
            ArrayList<Byte> b1 =new ArrayList<>();
            b1.add((byte)12);
            b1.add((byte)10);
            b1.add((byte)123);
            b1.add((byte)12);
            b1.add((byte)-5);
            System.out.print(b1+" ");
                break;
            case 2:
            ArrayList<Short> s1=new ArrayList<>();
            s1.add((short) 2);
            s1.add((short) 40);
            s1.add((short) 20);
            s1.add((short) 10);
            s1.add((short) 5);
            System.out.print(s1+" ");
            break;
            case 3:
            ArrayList<Boolean> bo1=new ArrayList<>();
            bo1.add((boolean)true);
            bo1.add((boolean)true);
            bo1.add((boolean)true);
            bo1.add((boolean)true);
            bo1.add((boolean)false);
            System.out.println(bo1+" ");
                break;
            case 4:
            ArrayList<Integer> i1=new ArrayList<>();
            i1.add(10);i1.add(20); i1.add(40); i1.add(50); i1.add(60);
                System.out.print(i1+" ");
                break;
            case 5:
            ArrayList <Float> F1=new ArrayList<>();
            F1.add(10.2f); F1.add(2.2f); F1.add(4.2f); F1.add(70.2f);
            System.out.print(F1+" ");
                break;
            case 6:
            ArrayList <Long> L1=new ArrayList<>();
            L1.add((long)12); L1.add((long)22); L1.add((long)32); L1.add((long)42);
                System.out.print(L1+" ");
                break;
            case 7:
            ArrayList <Double> D1=new ArrayList<>();
            D1.add((double)123);D1.add((double)223);D1.add((double)323);D1.add((double)423);
            System.out.println(D1+" ");
            break;
            case 8:
            ArrayList < Character> cv1=new ArrayList<>();
            cv1.add('a');  cv1.add('b');  cv1.add('c'); cv1.add('d');
                System.out.print(cv1+" ");
            break;
            case 9:
                ArrayList <Object> write1 =new ArrayList<>();
                write1.add("hello");
                write1.add(10);
                System.out.print(write1+" ");
                break;
            case 10:
            ArrayList <Integer> evencheck=new ArrayList<>();
            evencheck.add(10);  evencheck.add(13);   evencheck.add(70);   evencheck.add(90);   evencheck.add(59);
                for (int i:evencheck) {
                    if(i%2==0)
                    {
                        System.out.print(i+" ");
                    }
                }
                break;
            case 11:
                ArrayList <Integer> oddcheck=new ArrayList<>();
                oddcheck.add(10);  oddcheck.add(13);   oddcheck.add(70);   oddcheck.add(90);   oddcheck.add(59);
                for (int i:oddcheck) {
                    if(i%2!=0)
                    {
                        System.out.print(i+" ");
                    }
                }
            break;
            case 12:
            ArrayList <Object> write =new ArrayList<>();
            write.add('h');
            write.add(10);
            write.add("ojha");
            write.add(true);
            System.out.print(write+" ");
                break;

            case 13:

                ArrayList <Integer> a13=new ArrayList<>();
                a13.add(1); a13.add(2); a13.add(3); a13.add(4); a13.add(5); a13.add(6); a13.add(7);
                System.out.print("original array - "+a13);
                System.out.println();
                System.out.print("which question you wanna see - ");
                int x34= sc.nextInt();
                switch (x34) {
                    case 1:
                    a13.set(2,66);
                        System.out.print("changed array - "+a13);
                        break;
                    case 2:
                        Collections.swap(a13,2,3);
                        for (int i:a13) {
                            System.out.print(i+" ");
                        }
                        break;
                    case 3:
                    a13.remove(0);
                        System.out.print(a13+" ");
                    break;
                    case 4:
                    a13.remove(6);
                        System.out.print(a13+" ");
                    break;
                    case 5:
                    a13.add(3,88);
                        System.out.print(a13+" ");
                    break;
                    case 6:
                        for (int i:a13) {
                            if(i%2==0){
                                System.out.print(i+" ");
                            }
                        }
                    break;

                    case 7:
                        for (int i:a13) {
                            if(i%2!=0){
                                System.out.print(i+" ");
                            }
                        }
                        break;
                    case 8:
                    Collections.sort(a13);
                        for (int i: a13 ) {
                            System.out.print(i);
                        }
                    break;
                    default:
                    System.out.println("enter 1 to 8");
                    break;
                }
                break;
        }

    }
}