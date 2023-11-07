import java.util.Scanner;

public class Main {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    static void reverse(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        reverse(temp.next);

        System.out.print(temp.data+" ");
    }
    public static class LinkedList
    {
        Node head=null;
        Node tail=null;

        void add(int val)
        {
            Node temp=new Node(val);
            if(head==null)
            {
                head=temp;
            }
            else
            {
                tail.next=temp;
            }
            tail=temp;
        }
        void insertathead(int val){
        Node temp=new Node(val);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else {
            temp.next=head;
            head=temp;
        }
    }
        void insertAt(int index, int val) {
            Node t = new Node(val);
            Node temp = head;
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        int size(){
            int count=0;
            Node temp=head;
            while (temp!=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }
        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void display1()
        {
            while (head!=null)
            {
                System.out.print(head.data+" ");
                head=head.next;
            }
        }}
    static class Linkedlist1{
        Node head=null;
        Node tail=null;

        void add(int val)
        {
            Node temp=new Node(val);
            if(head==null)
            {
                head=temp;
            }
            else
            {
                tail.next=temp;
            }
            tail=temp;
        }
        void display(){
            Scanner sc1=new Scanner(System.in);
        System.out.print("select for or while");
        String check= sc1.next();
        int count=0;
                if(check.equalsIgnoreCase("for"))
        {
            for (int i=1;i<=7;i++)
            {
                if(head!=null)
                {
                    count++;
                    System.out.print(head.data+" ");
                    head=head.next;
                }
            }}
                else {
                    while(head!=null)
                    {
                        count++;
                        System.out.print(head.data+" ");
                        head=head.next;
                    }
                }
            System.out.println();
            System.out.print("length - "+count);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x213= sc.nextInt();
        switch (x213)
        {
          /*  case 1:
            Node a1=new Node(12);
            Node a2=new Node(78);
            Node a3=new Node(54);
            Node a4=new Node(23);
            Node a5=new Node(87);
            a1.next=a2;
            a2.next=a3;
            a3.next=a4;
            a4.next=a5;
            Node temp=a1;
            for (int i = 0; i <5 ; i++) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
                System.out.println();
            Node temp1=a1;
            while(temp1!=null)
            {
                    System.out.print(temp1.data+" ");
                    temp1=temp1.next;
            }
                break;
            case 2:
                Node b1=new Node(34);
                Node b2=new Node(12);
                Node b3=new Node(98);
                Node b4=new Node(43);
                Node b5=new Node(23);
                b1.next=b2;
                b2.next=b3;
                b3.next=b4;
                b4.next=b5;
                Node temp3=b1;
                for (int i = 0; i <5 ; i++) {
                    System.out.print(temp3.data+" ");
                    temp3=temp3.next;
                }
                System.out.println();
                Node temp4=b1;
                while(temp4!=null)
                {
                    System.out.print(temp4.data+" ");
                    temp4=temp4.next;
                }
                break;
            case 3:
                int no1= sc.nextInt();
                int no2= sc.nextInt();
                int no3= sc.nextInt();
                int no4= sc.nextInt();
                int no5= sc.nextInt();
                int no6= sc.nextInt();
                Node c1=new Node(no1);
                Node c2=new Node(no2);
                Node c3=new Node(no3);
                Node c4=new Node(no4);
                Node c5=new Node(no5);
                Node c6=new Node(no6);
                c1.next=c2;
                c2.next=c3;
                c3.next=c4;
                c4.next=c5;
                c5.next=c6;
                Node temp5=c1;
                for (int i = 1; i <=6 ; i++) {
                    System.out.print(temp5.data+" ");
                    temp5=temp5.next;
                }
                break;
            case 4:
                Node d1=new Node(12);
                Node d2=new Node(27);
                Node d3=new Node(54);
                Node d4=new Node(63);
                Node d5=new Node(88);
                Node d6=new Node(65);
                d1.next=d2;
                d2.next=d3;
                d3.next=d4;
                d4.next=d5;
                d5.next=d6;
                Node temp6=d1;
                for (int i = 1; i <=6 ; i++) {
                    if(temp6.data%2==0){
                    System.out.print(temp6.data+" ");}
                    temp6 = temp6.next;
                }
                System.out.println();
                Node temp7=d1;
                while (temp7!=null)
                {
                    if( temp7.data%2==0)
                    {
                        System.out.print(temp7.data+" ");
                    }
                    temp7=temp7.next;
                }
                break;
            case 5:
                Node e1=new Node(12);
                Node e2=new Node(27);
                Node e3=new Node(54);
                Node e4=new Node(63);
                Node e5=new Node(88);
                Node e6=new Node(65);
                e1.next=e2;e2.next=e3;e3.next=e4;e4.next=e5;
                e5.next=e6;
                reverse(e1);
                break;
            case 6:
                LinkedList f1=new LinkedList();
               f1.add(12);f1.add(78);f1.add(54);f1.add(23);
               f1.add(87);f1.add(15);
               f1.display();
                break;
            case 7:
               Linkedlist1 g7=new Linkedlist1();
                g7.add(34); g7.add(7); g7.add(65); g7.add(32); g7.add(12);
               g7.add(65);g7.add(86);
               g7.display();
                break;*/
        case 8:
            LinkedList i8=new LinkedList();
            i8.add(20); i8.add(40); i8.add(60);
            i8.add(80); i8.add(100);
            System.out.print("original list - ");
            i8.display();
            System.out.println();
            i8.insertathead(10);
            System.out.print("after insertion at head part - ");
            i8.display();
            System.out.println();
            i8.insertAt(2,78);
            i8.display();
            System.out.println();
            i8.insertAt(5,89);
            i8.display();
                break;
            case 9:
                LinkedList j9=new LinkedList();
                j9.add(20); j9.add(40); j9.add(60);
                j9.add(80); j9.add(100);
                j9.display1();
                System.out.println();
               int sizeoflinked= j9.size();
                System.out.println(sizeoflinked);
                break;
        }

    }
}