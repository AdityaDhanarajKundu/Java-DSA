package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LList{
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        //adding elements to the linkedlist
        ll.add(6);
        ll.add(4);
        ll.add(9);
        ll.add(16);
        System.out.println(ll);
        //Adding the element at a particular index.
        ll.add(1, 8);
        System.out.println(ll);
        //Removing elements from the linked lists
        ll.remove();
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
        ll.add(15);
        ll.add(13);
        ll.add(24);

        ll.remove(2); //should remove the element 15

        //creating an iterator to iterate over the Linked List elements.
        Iterator<Integer> it = ll.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        
        //getting the size of the Linked List using the size() method
        System.out.println(ll.size());

        //Checking if a particular element is present inside the Linked List using the contains() method
        //contains() method returns a boolean value

        //checking if the Linked List contains the element "10" and "13"
        System.out.println(ll.contains(10));
        System.out.println(ll.contains(13));

        //Copying the elements from the stack to a Linked lIst
        Stack<String> s1 = new Stack<>();
        s1.push("Good");
        s1.push("Morning!");
        System.out.println(s1);

        LinkedList<String> l2= new LinkedList<>();
        l2.addAll(s1); //adds all the elements from the stack s1 to the linked list l2.
        System.out.println(l2);
    }
}