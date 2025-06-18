package dsa.tree.binaryTree;

import java.util.Scanner;

class Node
{
    Node left;
    int data;
    Node right;

    public Node(int data)
    {
        this.data=data;
        this.left= null;
        this.right=null;
    }
}



public class BinaryTreeImplmentation {
    public static void main(String[] args) {
        Node root=create();

    }

    public static Node create()
    {
        Scanner sc= new Scanner(System.in);
        Node root=null;
        System.out.println("Enter data :");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        root=new Node(data);
        System.out.println("Enter left child of :"+root.data);
        root.left=create();
        System.out.println("Enter right child of :"+root.data);
        root.right=create();
        return root;
    }

}




