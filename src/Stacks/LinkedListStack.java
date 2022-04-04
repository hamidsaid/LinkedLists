package Stacks;

import java.util.LinkedList;
import java.util.ListIterator;

//Employee LinkedList Stack

public class LinkedListStack {

    //The linkedList class is actually a double linkedList
    LinkedList<Employee> stack;

    LinkedListStack (){
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public void printStack(){
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
