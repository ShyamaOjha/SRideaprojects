import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> s1 = new LinkedList<>();
        s1.add("ravi");
        s1.add("vijay");
        s1.add("ramesh");
        s1.add("gopal");
        System.out.print("s1 - " + s1);
        System.out.println();

        LinkedList<String> s22 = new LinkedList<>();
        s22.add("avi");
        s22.add("vijay");
        s22.add("mukesh");
        s22.add("mohit");
        s22.add("swami");
        s1.addAll(s22);
        System.out.println();
        System.out.println("s22 - "+s22);
        s1.removeAll(s1);

        LinkedList<String> s33 = new LinkedList<>();
        s33.add("anshuman");
        s33.add("uday");
        s33.add("nischal");
        s33.add("suhsil");
        s33.add("deepak");
        System.out.println();
        System.out.println("s33 - "+s33);
        System.out.println();
        s33.addAll(s1);
        System.out.println(s33);
        System.out.println();
        s33.removeAll(s1);
        System.out.println(s33);
        System.out.println();


        LinkedList<String> s4 = new LinkedList<>();
        s4.add("anand");
        s4.add("viratd");
        s4.add("kohli");
        s4.add("sharma");
        System.out.println("s4 - "+s4);
        s4.addAll(s33);
        System.out.println();
        System.out.print("final linked list - " + s4);
        System.out.println();


        LinkedList<String> s5 = new LinkedList<>();
        s5.add("bumrah");
        s5.add("shami");
        s5.add("thakur");
        s5.add("jadeja");
        System.out.println("s5 - "+s5);
        System.out.println();
        s5.addAll(s22);
        System.out.println("final linked lsit - " + s5);

     /*   LinkedList<String> s6 = new LinkedList<>();
        s6.add("bumrah");
        s6.add("shami");
        s6.add("thakur");
        s6.add("jadeja");

        System.out.print("final linked lsit - " );

        System.out.print(s6 + " ");
        s6.removeFirst();
        s6.removeLast();

        ArrayList<String> s12 = new ArrayList<>();
        s12.add("hi");
        s12.add("heya");
        s12.add("hello");
        s12.add("hoore");
        s12.add("mohite");
        System.out.print(s12 + " ");
        s12.remove(0);
        s12.remove(4);*/



    }
}