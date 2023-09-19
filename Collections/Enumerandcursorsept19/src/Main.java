import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x213= sc.nextInt();
        switch (x213){
            case 1:
        ArrayList st5=new ArrayList();
        st5.add(15);
        st5.add(21);
        st5.add(41);
        st5.add(43);
        st5.add(54);
        Iterator it=st5.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        break;
            case 2:
                LinkedList a6=new LinkedList();
                a6.add(15);
                a6.add(21);
                a6.add(41);
                a6.add(43);
                a6.add(54);
                Iterator it1=a6.iterator();
                while(it1.hasNext())
                {
                    System.out.println(it1.next());
                }
                break;
            case 3:
                Vector a1=new Vector();
                a1.add(15);
                a1.add(21);
                a1.add(41);
                a1.add(43);
                a1.add(54);
                Iterator it2=a1.iterator();
                while(it2.hasNext())
                {
                    System.out.println(it2.next());
                }
                break;
            case 4:
                ArrayList a3=new ArrayList();
                a3.add(15);
                a3.add(21);
                a3.add(10);
                a3.add(14);
                a3.add(19);
                Iterator<Integer> it3=a3.iterator();
                while(it3.hasNext())
                {
                    int i=it3.next();
                    if(i%2==1)
                    {
                        it3.remove();
                    }
                }
                while(it3.hasNext())
                {
                    int i=it3.next();
                    if(i%2==0)
                    {
                        it3.remove();
                    }
                }
                System.out.println("even number");
                System.out.println(a3);
                System.out.println();
                ArrayList a4=new ArrayList();
                a3.add(15);
                a3.add(21);
                a3.add(10);
                a3.add(14);
                a3.add(19);
                Iterator<Integer> it4=a3.iterator();
                while(it4.hasNext())
                {
                    int i=it4.next();
                    if(i%2==0)
                    {
                        it4.remove();
                    }
                }
                System.out.println(it4);
                break;
            case 5:
                LinkedList <Integer> l123=new LinkedList<>();
                l123.add(1);l123.add(2);l123.add(3);l123.add(4);l123.add(5);
                System.out.println(l123);
                System.out.println();
                System.out.println("even number - ");
                for (int i: l123) {
                    if(i%2==0)
                    {
                        System.out.print(i+" ");
                    }
                }
                System.out.println();
                System.out.print("odd no - ");
                for (int i: l123) {
                    if(i%2!=0)
                    {
                        System.out.print(i+" ");
                    }}
                break;
            case 6:
                ArrayList <Integer> i123=new ArrayList<>();
                i123.add(10);i123.add(21);i123.add(32);i123.add(14);i123.add(51);
                System.out.println(i123);
                System.out.println();
                System.out.println("even number - ");
                for (int i: i123) {
                    if(i%2==0)
                    {
                        System.out.print(i+" ");
                    }
                }
                System.out.println();
                System.out.print("odd no - ");
                for (int i: i123) {
                if(i%2!=0)
                {
                    System.out.print(i+" ");
                }
            }

                break;
            case 7:
               LinkedList a05=new LinkedList<>();
                a05.add(15);
                a05.add(21);
                a05.add(10);
                a05.add(14);
                a05.add(19);
                ListIterator<Integer> it11=a05.listIterator();
                System.out.println("forward - ");
                while(it11.hasNext())
                {
                    System.out.println(it11.next());
                }
                System.out.println("backward - ");
                while(it11.hasPrevious())
                {
                    System.out.println(it11.previous());
                }
                break;
            case 8:
            ArrayList a7=new ArrayList();
            a7.add(12);
            a7.add(14);
            a7.add(19);
            a7.add(23);
            a7.add(20);
            ListIterator<Integer> li1=a7.listIterator();
                System.out.println();
            while(li1.hasNext())
            {
                System.out.print(li1.next()+" ");
            }
                System.out.println();
                while(li1.hasPrevious())
                {
                    System.out.print(li1.previous()+" ");
                }
            break;
            case 9:
                Vector<Integer> ax=new Vector();
                ax.add(20);
                ax.add(13);
                ax.add(14);
                ax.add(13);
                ax.add(14);

                Enumeration<Integer> en=ax.elements();
                while(en.hasMoreElements())
                {
                    System.out.print(en.nextElement()+" ");
                }

                System.out.println("even number");
                for(Integer i:ax)
                {
                    if(i%2==0)
                    {
                        System.out.println(i);
                    }
                }
                break;
            case 10:
                Stack<Integer> st7=new Stack();
                st7.push(20);
                st7.push(21);
                st7.push(54);
                st7.push(65);
                st7.push(79);

                Enumeration<Integer> en1=st7.elements();
                while(en1.hasMoreElements())
                {
                    System.out.println(en1.nextElement());
                }

                System.out.println("even number");
                for(Integer i:st7)
                {
                    if(i%2==0)
                    {
                        System.out.println(i);
                    }
                }
                break;

        }

    }
}