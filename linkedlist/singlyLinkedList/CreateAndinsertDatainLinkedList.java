package dsa.linkedlist.singlyLinkedList;

import java.util.Scanner;

public class CreateAndinsertDatainLinkedList
{
    Node head=null;
    public static void main(String[] args)
    {

        CreateAndinsertDatainLinkedList LL= new CreateAndinsertDatainLinkedList();
        LL.create();
//        LL.travers();

    }
    public void create()
    {
        int data,n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data :");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null)
                head = newNode;
            else {
                newNode.next = head;
                head = newNode;
            }
            System.out.println("Do u want to add more(If yes, press 1)");
            n= sc.nextInt();;
        }while(n==1);

    }
    public void addData()
    {

    }


}



