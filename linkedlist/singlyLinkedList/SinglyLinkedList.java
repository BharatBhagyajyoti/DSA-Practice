package dsa.linkedlist.singlyLinkedList;

public class SinglyLinkedList {

    Node head;
    int size;
    public SinglyLinkedList()
    {
        this.size=0;
    }


    public static void main(String[] args) {
        SinglyLinkedList list= new SinglyLinkedList();
        list.addFirst(50);
        list.addFirst(99);
        list.addFirst(100);
        list.addLast(999);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.size);




    }

    //Add-first
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if (head==null)//Checks whether the LinkedList is empty or not
        {
            head=newNode;
            size++;
            return;
        }

        newNode.next=head;
        head=newNode;
        size++;
    }

    //Add-Last
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if (head==null)//Checks whether the LinkedList is empty or not
        {
            head=newNode;
            size++;
            return;
        }

        Node currentNode=head;
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

        Node currentNode=head;
        while (currentNode !=null)
        {
            System.out.print(currentNode.data+"-->");
            currentNode=currentNode.next;
        }
        System.out.println("null");

    }


    //DeleteFirst
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }
        head=head.next;
        size--;
    }


    //Delete Last
    public void deleteLast()
    {

        if (head==null)//No node is present
        {
            System.out.println("LinkedList is Empty");
            return;
        }

        if (head.next==null)//Only 1 node is present
        {
            head=null;
            size--;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next != null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
        size--;

    }


}
