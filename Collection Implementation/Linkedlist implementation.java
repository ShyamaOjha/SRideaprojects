import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static class Node0{
        int data;
        Node0 next;

    }
    public  static class Node{
    int data;
    Node next;
        Node(int data) {
            this.data = data;
        }

    }
    public  static class Node1{
        int data;
        Node1 next1;
        Node1(int data) {
            this.data = data;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x231sc= sc.nextInt();
        switch (x231sc)
        {
            case 1:
            Node0 n1=new Node0();
            System.out.println(n1);
                break;
            case 2:
        Node x1 = new Node(56);
        Node x2 = new Node(78);
        Node x3 = new Node(9);
        Node x4 = new Node(2);
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        System.out.println(x1.next);
        System.out.println(x2.next);
        System.out.println(x3.next);
        System.out.println(x4.next);
        break;
            case 3:
                Node x11 = new Node(56);
                Node x21 = new Node(78);
                Node x31 = new Node(9);
                Node x41 = new Node(2);
                Node1 y1=new Node1(12);
                Node1 y2=new Node1(56);
                Node1 y3=new Node1(78);
                Node1 y4=new Node1(34);
                Node1 y5=new Node1(78);
                Node1 y6=new Node1(23);
                Node1 y7=new Node1(12);
                System.out.print(x11.data+" ");
                System.out.print(x21.data+" ");
                System.out.print(x31.data+" ");
                System.out.print(x41.data+" ");
                System.out.println();
                System.out.print(y1.data+" ");
                System.out.print(y2.data+" ");
                System.out.print(y3.data+" ");
                System.out.print(y4.data+" ");
                System.out.print(y5.data+" ");
                System.out.print(y6.data+" ");
                break;
            case 4:
                Node x111 = new Node(56);
                Node x211 = new Node(78);
                Node x311 = new Node(9);
                Node x411 = new Node(2);
                Node1 y11=new Node1(12);
                Node1 y21=new Node1(56);
                Node1 y31=new Node1(78);
                Node1 y41=new Node1(34);
                Node1 y51=new Node1(78);
                System.out.print(x111.data+" ");
                System.out.print(x211.data+" ");
                System.out.print(x311.data+" ");
                System.out.print(x411.data);
                System.out.println();
                System.out.print(y11.data+" ");
                System.out.print(y21.data+" ");
                System.out.print(y31.data+" ");
                System.out.print(y41.data+" ");
                System.out.print(y51.data+" ");
                break;
            case 5:
                Node z11 = new Node(56);
                Node z21 = new Node(78);
                Node z31 = new Node(9);
                Node z41 = new Node(2);
                z11.next=z21;z21.next=z31;z31.next=z41;
                System.out.print(z11.data+" ");
                System.out.print(z11.next.data+" ");
                System.out.print(z11.next.next.data+" ");
                System.out.print(z11.next.next.next.data+" ");
                System.out.println();
                Node1 B1=new Node1(12);
                Node1 C1=new Node1(56);
                Node1 D1=new Node1(78);
                Node1 E1=new Node1(34);
                Node1 F1=new Node1(78);
                B1.next1=C1;C1.next1=D1;D1.next1=E1;E1.next1=F1;
                System.out.print(B1.data+" ");
                System.out.print(B1.next1.data+" ");
                System.out.print(B1.next1.next1.data+" ");
                System.out.print(B1.next1.next1.next1.data+" ");
                System.out.print(B1.next1.next1.next1.next1.data+" ");
                break;
    }
}}
