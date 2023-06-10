import java.util.Stack;

import java.util.Iterator;

public class StackExample{
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        //Pushing elememts into the stack using push function
        s1.push(1);
        s1.push(2);
        s1.push(5);
        System.out.println(s1);
        //Popping the elements from the stack using pop method
        s1.pop();
        System.out.println(s1);
        //Printing the topmost element of the stack using the peek method
        System.out.println(s1.peek());

        //checking if the stack is empty using the empty method.
        //this method returns boolean value.

        boolean result = s1.empty();
        System.out.println(result);
        s1.pop();
        s1.pop();
        result=s1.empty();
        System.out.println(result);

        //searching an element in the stack using the search method.
        s1.push(5);
        s1.push(9);
        s1.push(12);
        int index = s1.search(12);
        System.out.println(index);  //prints the index of the searched element in the stack

        //Using a Iterator class instance to iterate over the stack elements.
        //Using another object to store the elements and to print them.
        Iterator it = s1.iterator();
        while(it.hasNext()){
            Object s2= it.next();
            System.out.println(s2);
        }

        
    }
}