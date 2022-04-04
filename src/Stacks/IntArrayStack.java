package Stacks;

import java.util.EmptyStackException;

public class IntArrayStack {

    public static void main(String [] args){

        Stack stack = new Stack(5);
        stack.push(23);
        stack.push(12);
        stack.push(70);
        stack.push(55);

        //stack.pop();
        stack.print();

    }
}



class Stack {

    int [] myStack;
    int top ;

    public Stack(int length){
        myStack =  new int[length];
    }

    public void push(int newItem){
        if(top == myStack.length){
            int [] newArray = new int[myStack.length*2];
            System.arraycopy(myStack,0,newArray,0,myStack.length);
            myStack = newArray;
        }
        myStack[top++] = newItem;
    }

    public int pop(){
        if(top == 0){
            throw new EmptyStackException();
        }
        int poppedItem = myStack[top-1];
        --top;
        return poppedItem;
    }

    public int peek(){
        return myStack[top-1];
    }

    public void print(){
        for(int i=top-1 ; i>=0;i--){
            System.out.println(myStack[i]);
            System.out.println(i);
        }
    }
}
