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
    public static class LinkedList1
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

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        LinkedList1 a1=new LinkedList1();
        a1.add(45);
        a1.add(89);
        a1.add(34);
        a1.add(67);
        a1.add(83);
        a1.add(12);
        a1.add(77);
        a1.add(23);
        System.out.print("enter which question you want to see -");
       int x2312= sc.nextInt();
       switch (x2312)
       {
           case 1:
           a1.display();
               break;
           case 2:
            a1.display1();
               break;
           case 3:
               a1.display();
               System.out.println();
             int sizeoflink=a1.size();
               System.out.print("size -"+sizeoflink);
               break;
           case 4:
               a1.display();
               System.out.println();
               int sizeoflink1=a1.size();
               System.out.print("size -"+sizeoflink1);
               break;
           case 5:
               a1.display();
               a1.insertathead(110);a1.insertathead(32);
               System.out.println();
               a1.display();
               break;
           case 6:
               a1.display();
               a1.insertAt(2,11);
               a1.insertAt(1,70);
               System.out.println();
               a1.display();
               break;
           case 7:
               a1.display();
               a1.insertAt(1,30);
               a1.insertAt(10,80);
               System.out.println();
               a1.display();
               break;
       }
    }
}