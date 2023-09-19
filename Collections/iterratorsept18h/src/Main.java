import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x123= sc.nextInt();
        switch (x123)
        {
            case 1:
        LinkedList<String> s1 = new LinkedList<>();
        s1.add("ravi");
        s1.add("vijay");
        s1.add("ramesh");
        s1.add("gopal");
        System.out.print("s3 - " +s1);
        System.out.println();

        for (int i = 0; i <s1.size() ; i++) {
            System.out.print(s1.get(i)+" ");
        }
        System.out.println();
        for (String i: s1 ) {
            System.out.print(i+" ");
        }
        System.out.println();
        Iterator <String> is1=s1.iterator();

        while(is1.hasNext())
        {
            System.out.print(is1.next()+" ");
        }
        System.out.println();
        break;
            case 2:
        LinkedList <Integer> l123=new LinkedList<>();
        l123.add(1);l123.add(2);l123.add(3);l123.add(4);l123.add(5);
        System.out.println(l123);
        System.out.println();

        for (int i1 = 0; i1 <l123.size() ; i1++) {
            System.out.print(l123.get(i1)+" ");
        }
        System.out.println();
        for (int i1: l123 ) {
            System.out.print(i1+" ");
        }
        System.out.println();

        Iterator <Integer> ii1=l123.iterator();

        while(ii1.hasNext())
        {
        System.out.print(ii1.next()+" ");
        }
        System.out.println();
        break;

        case 3:

            ArrayList<String> s3 = new ArrayList<>();
            s3.add("ravi");
            s3.add("vijay");
            s3.add("ramesh");
            s3.add("gopal");
            System.out.print("s3 - " +s3);
            System.out.println();

            for (int i = 0; i <s3.size() ; i++) {
                System.out.print(s3.get(i)+" ");
            }
            System.out.println();
            for (String i: s3 ) {
                System.out.print(i+" ");
            }
            System.out.println();
            Iterator <String> is2=s3.iterator();

            while(is2.hasNext())
            {
                System.out.print(is2.next()+" ");
            }
            System.out.println();
            break;

            case 4:
                ArrayList <Integer> i123=new ArrayList<>();
                i123.add(10);i123.add(21);i123.add(32);i123.add(14);i123.add(51);
                System.out.println(i123);
                System.out.println();

                for (int i1 = 0; i1 <i123.size() ; i1++) {
                    System.out.print(i123.get(i1)+" ");
                }
                System.out.println();
                for (int i1: i123 ) {
                    System.out.print(i1+" ");
                }
                System.out.println();

                Iterator <Integer> is11=i123.iterator();

                while(is11.hasNext())
                {
                    System.out.print(is11.next()+" ");
                }
                System.out.println();
                break;
            case 5:
               Vector<String> v1 = new Vector<>();
                v1.add("ravi");
                v1.add("vijay");
                v1.add("ramesh");
                v1.add("gopal");
                System.out.print("v1 - " +v1);
                System.out.println();

                for (int i = 0; i <v1.size() ; i++) {
                    System.out.print(v1.get(i)+" ");
                }
                System.out.println();
                for (String i: v1 ) {
                    System.out.print(i+" ");
                }
                System.out.println();
                Iterator <String> v11=v1.iterator();

                while(v11.hasNext())
                {
                    System.out.print(v11.next()+" ");
                }
                System.out.println();
                break;
            case 6:
              Vector <Integer> v123=new Vector<>();
                v123.add(10);v123.add(21);v123.add(32);v123.add(14);v123.add(51);
                System.out.println(v123);
                System.out.println();

                for (int i1 = 0; i1 <v123.size() ; i1++) {
                    System.out.print(v123.get(i1)+" ");
                }
                System.out.println();
                for (int i1: v123 ) {
                    System.out.print(i1+" ");
                }
                System.out.println();

                Iterator <Integer> v111=v123.iterator();

                while(v111.hasNext())
                {
                    System.out.print(v111.next()+" ");
                }
                System.out.println();
                break;
            case 7:
                Stack<Integer> stk= new Stack<>();
                stk.push(78);
                stk.push(113);
                stk.push(90);
                stk.push(120);
                System.out.println(stk);
                for (int i1 = 0; i1 <stk.size() ; i1++) {
                    System.out.print(stk.get(i1)+" ");
                }
                System.out.println();
                for (int i1: stk ) {
                    System.out.print(i1+" ");
                }
                System.out.println();
                Iterator <Integer> st11=stk.iterator();

                while(st11.hasNext())
                {
                    System.out.print(st11.next()+" ");
                }
                System.out.println();

                break;
            case 8:
                Stack<String> stk1= new Stack<>();
                stk1.push("Apple");
                stk1.push("Grapes");
                stk1.push("Mango");
                stk1.push("Orange");
                System.out.println(stk1);
                for (int i1 = 0; i1 <stk1.size() ; i1++) {
                    System.out.print(stk1.get(i1)+" ");
                }
                System.out.println();
                for (String i1: stk1 ) {
                    System.out.print(i1+" ");
                }
                System.out.println();
                Iterator <String> st12=stk1.iterator();

                while(st12.hasNext())
                {
                    System.out.print(st12.next()+" ");
                }
                System.out.println();
                break;
            case 9:
                ArrayList<Integer> n1 = new ArrayList<>();

                for (int i = 1; i <= 10; i++) {
                    n1.add(i);
                }
                System.out.println(n1);
                for (int i = n1.size() - 1; i >= 0; i--) {
                    if (n1.get(i) % 2 == 0) {
                        n1.remove(i);
                    }
                }
                System.out.println(n1);
                Iterator <Integer> adre1=n1.iterator();

                while(adre1.hasNext())
                {
                    System.out.print(adre1.next()+" ");
                }
                System.out.println();
            break;
            case 10:
                Stack<String> al=new Stack<>();
                al.add("hi");
                al.add("bye");
                al.add("tata");
                al.add("boo");
                al.add("lol");

                Iterator i=al.iterator();
                while (i.hasNext())
                {
                    System.out.println(i.next());
                }

                break;


        }
    }
}