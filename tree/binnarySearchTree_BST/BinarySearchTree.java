package dsa.tree.binnarySearchTree_BST;

class Node{
    Node left;
    int data;
    Node right;
    public Node(int data)
    {
        this.data=data;
    }
}


public class BinarySearchTree {
    Node root;
    public void insert(int data)
    {
        root=insertRec(root,data);
    }

    public Node insertRec(Node root, int data)
    {
        if(root==null)
        {
            root=new Node(data);
        } else if (data<root.data) {
            root.left=insertRec(root.left,data);
        } else if (data>root.data) {
            root.right=insertRec(root.right,data);
        }
        return root;
    }


    public void inorderTraverse()
    {
        inorderRecursion(root);

    }

    public void inorderRecursion(Node root)
    {
        if(root != null)
        {
            inorderRecursion(root.left);
            System.out.print(root.data+" ");
            inorderRecursion(root.right);
        }
    }
}
