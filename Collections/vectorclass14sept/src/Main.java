import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector <Integer> v1=new Vector<>();
        // while insert into vector we should use add element for adding the value.
        v1.add(10);v1.add(20);v1.add(30);v1.add(40);v1.add(50);v1.add(60);v1.add(70);
        v1.addElement(21);  v1.addElement(31);  v1.addElement(41);  v1.addElement(51);
        System.out.println("enter the questoin you wanna see - ");
        int xwq4= sc.nextInt();
        switch (xwq4)
        {
        case 1:
            System.out.print(v1);
                break;
            case 2:
                for (int i:v1) {
                    System.out.print(v1);
                }
                break;
            case 3:
                Vector <Byte> b1=new Vector<Byte>();
                b1.add((byte)1);b1.add((byte)11);b1.add((byte)10);b1.add((byte)110);
                System.out.println(b1);
                break;
            case 4:
                Vector <Character> ch1=new Vector<Character>();
                ch1.add((char)'a');ch1.add((char)'b');ch1.add((char)'c');ch1.add((char)'d');
                System.out.println(ch1);
                break;
            case 5:
                Vector <Float> fl1=new Vector<Float>();
                fl1.add((float)10.2f);fl1.add((float)11.2);fl1.add((float)11.223);fl1.add((float)76.3);
                System.out.println(fl1);
            case 6:
             Vector<Boolean> bo1=new Vector<>();
                bo1.add((boolean)true); bo1.add((boolean)true); bo1.add((boolean)true); bo1.add((boolean)true);
                bo1.add((boolean)false); System.out.println(bo1+" "); break;
            case 7:  Vector <Long> L1=new Vector<>();
                L1.add((long)12); L1.add((long)22); L1.add((long)32); L1.add((long)42); System.out.print(L1+" "); break;
            case 8: Vector <Double> D1=new Vector<>();
                D1.add((double)123);D1.add((double)223);D1.add((double)323);D1.add((double)423);
                System.out.println(D1+" "); break;
            case 9: Vector<Integer> evencheck=new Vector<>();
                evencheck.add(10);  evencheck.add(13);   evencheck.add(70);   evencheck.add(90);   evencheck.add(59);
                for (int i:evencheck) { if(i%2==0)  { System.out.print(i+" "); } } break;
            case 10:  Vector <Integer> oddcheck=new Vector<>();
                oddcheck.add(10);  oddcheck.add(13);   oddcheck.add(70);   oddcheck.add(90);   oddcheck.add(59);
                for (int i:oddcheck)  { if(i%2!=0) { System.out.print(i+" ");} } break;
            case 11:

                char a=sc.next().charAt(0);
                if(a=='e')
                {    ArrayList <Integer> al1=new ArrayList<>();al1.add(10);al1.add(15);al1.add(19);al1.add(40);al1.add(31);
                    LinkedList <Integer> LL1=new LinkedList<>();LL1.add(10);LL1.add(15);LL1.add(19);LL1.add(40);LL1.add(31);
                    Vector <Integer> v12=new Vector<>();   v1.add(10);v1.add(15);v1.add(19);v1.add(40);v1.add(31);
                    System.out.print("array list even number - ");
                    for (int i:al1) {
                        if(i%2==0)
                        {
                            System.out.print(i);
                        }
                    }
                    System.out.println();
                    System.out.print("linked list even - ");
                    for (int i:LL1) {
                        if(i%2==0)
                        {
                            System.out.print(i);
                        }
                    }
                    System.out.println();
                    System.out.print("vector even - ");
                    for (int i:v1) {
                        if(i%2==0)
                        {
                            System.out.print(i);
                        }
                    }
                }
                if(a=='o'){
                    ArrayList <Integer> al1=new ArrayList<>();al1.add(10);al1.add(15);al1.add(19);al1.add(40);al1.add(31);
                    LinkedList <Integer> LL1=new LinkedList<>();LL1.add(10);LL1.add(15);LL1.add(19);LL1.add(40);LL1.add(31);
                    Vector <Integer> v12=new Vector<>();   v1.add(10);v1.add(15);v1.add(19);v1.add(40);v1.add(31);
                    System.out.print("array list even number - ");
                    for (int i:al1) {
                        if(i%2==0)
                        {
                            System.out.print(i);
                        }
                    }
                    System.out.println();
                    System.out.print("linked list even - ");
                    for (int i:LL1) {
                        if(i%2==0)
                        {
                            System.out.print(i);
                        }
                    }
                    System.out.println();
                    System.out.print("vector even - ");
                    for (int i:v1) {
                        if(i%2==0)
                        {
                            System.out.print(i);
                        }
                    }
                }
                }
        }

//        System.out.println("capicty of vector - "+v1.capacity());
//        System.out.println(""+v1.remove((Integer)95));

        // contain use with if statment
        // contains make -1 output when the value is not present in vector.
//        if(v1.contains(30))
//        {
//            System.out.print("yes it is present at "+v1.indexOf(30) );
//        }
    }
}