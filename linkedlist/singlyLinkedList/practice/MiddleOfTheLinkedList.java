package dsa.linkedlist.singlyLinkedList.practice;

/*
Find Middle of the Linked List
Last Updated : 04 Sep, 2024
Given a singly linked list, the task is to find the middle of the linked list. If the number of nodes are even, then there would be two middle nodes, so return the second middle node.

Example:

Input: linked list: 1->2->3->4->5
Output: 3
Explanation: There are 5 nodes in the linked list and there is one middle node whose value is 3.


Input: linked list = 10 -> 20 -> 30 -> 40 -> 50 -> 60
Output: 40
Explanation: There are 6 nodes in the linked list, so we have two middle nodes: 30 and 40, but we will return the second middle node which is 40.

 */

class Node1 {
    int data;
    Node1 next;;  //Represent the next node
    //    Constructor to give the initial values
    Node1(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class MiddleOfTheLinkedList {

    Node1 head;
    int size;

    public MiddleOfTheLinkedList()
    {
        this.size=0;
    }


    public static void main(String[] args) {
        MiddleOfTheLinkedList l1=new MiddleOfTheLinkedList();

        l1.addNode(50);
        l1.addNode(51);
        l1.addNode(9);
        l1.addNode(90);
        l1.addNode(100);
        l1.addNode(111);
        l1.printList();

        System.out.println("Length :"+l1.size);
        l1.getMid(l1.head, l1.size);


    }


    public void addNode(int data)
    {
        Node1 newNode=new Node1(data);
        if (head==null)//Checks whether the LinkedList is empty or not
        {
            head=newNode;
            size++;
            return;
        }

        Node1 currentNode=head;
        while (currentNode.next !=null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        size++;
    }


    //Print
    public void printList()
    {
        if(head==null)
        {
            System.out.println("LInkedList is empty");
            return;
        }

        Node1 currentNode=head;
        while (currentNode !=null)
        {
            System.out.print(currentNode.data+"-->");
            currentNode=currentNode.next;
        }
        System.out.println("null");

    }


    public void getMid(Node1 head,int size)
    {
        int mid=size/2;

        while(mid>0)
        {
            head=head.next;
            mid--;
        }

        System.out.println("Mid :"+head.data);
    }


}


