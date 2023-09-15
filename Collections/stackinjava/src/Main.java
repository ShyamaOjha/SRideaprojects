import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x21= sc.nextInt();
        switch (x21) {
            case 1:
                Stack<Integer> i1 = new Stack<>();
                System.out.println("is this stack is empty" + i1.empty());
                i1.push(10);
                i1.push(20);
                i1.push(15);
                i1.push(30);
                i1.push(19);
                i1.push(35);
                System.out.println(i1);
                System.out.println("peak element - " + i1);
                System.out.println("is this stack is empty" + i1.empty());
                System.out.println();
                System.out.print("even number arev - ");
                for (int i : i1) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }

                }
                System.out.println();
                System.out.print("even number arev - ");
                for (int i : i1) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }

                }
                break;
            case 2:
                System.out.println();
                Stack<Integer> i3 = new Stack<>();
                i3.push(12);
                i3.push(67);
                i3.push(89);
                i3.push(34);
                i3.push(19);
                i3.push(22);
                i3.push(66);
                i3.push(46);
                System.out.println("third stack - " + i3 + " ");
                break;

            case 3:
                Stack<String> ss = new Stack<>();
                System.out.print("is the stack is empty or not - " + ss.empty());
                System.out.println();
                ss.push("abhi");
                ss.push("ravi");
                ss.push("navi");
                ss.push("ankit");
                ss.push("kavi");
                ss.push("lavi");
                System.out.println(ss);
                System.out.println("peek element - " + ss.peek());
                ss.pop();
                System.out.println(ss);
                System.out.print("is the stack is empty or not - " + ss.empty());
                break;

            case 4:
                ArrayList<Integer> al1 = new ArrayList<>();
                al1.add(10);
                al1.add(20);
                al1.add(30);
                al1.add(40);
                al1.add(50);
                System.out.println("array list is -" + al1);
                System.out.println("fiest element of arraylist" + al1.get(0));
                System.out.println("last element of arraylist  - " + al1.get(al1.size() - 1));
                break;

            case 5:
                LinkedList<Integer> ll1 = new LinkedList<>();
                ll1.add(10);
                ll1.add(20);
                ll1.add(30);
                ll1.add(40);
                ll1.add(50);
                System.out.println("array list is -" + ll1);
                System.out.println("fiest element of arraylist" + ll1.get(0));
                System.out.println("last element of arraylist  - " + ll1.get(ll1.size() - 1));
                break;


            case 6:
                Vector<Object> ob1 = new Vector<>();
                ob1.add("hello");
                ob1.add("yoo");
                ob1.add(10);
                ob1.add(12.3f);
                ob1.add((char) 'c');
                System.out.println(ob1);
                System.out.println(ob1.firstElement());
                System.out.println(ob1.lastElement());
                ob1.remove(3);
                System.out.println(ob1);
                System.out.println(ob1.isEmpty());
                break;
        }
    }
}