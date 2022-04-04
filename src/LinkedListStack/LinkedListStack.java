package LinkedListStack;

import com.company.Node;

import java.util.EmptyStackException;

public class LinkedListStack {

    private Node top;

    public LinkedListStack(){
        top =null;
    }

    public boolean isEmpty(){
        return top == null;
    }
    public void push(int value){
        top =new Node(value,top);
    }

    public int peek(){
        if (isEmpty()) throw new EmptyStackException();
        return top.getValue();
    }
    public int pop(){
        if (isEmpty()) throw new EmptyStackException();
        int poppedValue = top.getValue();
        top = top.getNext();
        return poppedValue;
    }

}
