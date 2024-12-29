package dsa.linkedlist.singlyLinkedList.practice;

import dsa.linkedlist.singlyLinkedList.Node;

import java.util.Scanner;

public class NthNodeElement {
    static Node head;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of node to bè inserted :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println("Node-"+i+" :");
            int nn= sc.nextInt();
            addNode(nn);
        }
        printList();


        System.out.println("Enter node number :");
        int nod=sc.nextInt();
        System.out.println("node-"+nod+" :"+findNthNode(nod));


    }


    //Finds the Nth element
    public static int findNthNode(int n)
    {
        Node currentNode=head;
        for (int i=0;i<n-1;i++)
        {
            currentNode=currentNode.next;
        }
        return currentNode.data;
    }


    //Add Nodes
    public static void addNode(int data)
    {
        Node n=new Node(data);
        if (head==null)
        {
            head=n;
            return;
        }
        Node currentNode=head;
        while(currentNode.next !=null)
        {

            currentNode=currentNode.next;
        }
        currentNode.next=n;

    }

//Print the linkedList
    public static void printList()
    {
        if(head==null) {
            System.out.println("Empty LinkedList !");
            return;
        }
        Node currentNode=head;

        while (currentNode !=null)
        {
            System.out.print(currentNode.data+"-->");
            currentNode=currentNode.next;
        }
        System.out.println("null");

    }

}
