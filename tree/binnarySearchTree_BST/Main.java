package dsa.tree.binnarySearchTree_BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree= new BinarySearchTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.inorderTraverse();
    }
}
