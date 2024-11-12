package dsa.linkedlist.using_Collections_Framework;

import java.util.LinkedList;

public class LL1 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(50);
        list.add(99);
        list.addFirst(0);
        list.addLast(9);
        System.out.println(list);
        System.out.println(list.size());

        list.remove();  // By default it deletes node from the first
        list.removeFirst();
        list.removeLast();
        for (int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");
    }
}
