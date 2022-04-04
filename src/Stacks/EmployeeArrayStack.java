package Stacks;

import java.util.EmptyStackException;

public class EmployeeArrayStack {

    private Employee [] stack;
    private int top;

    public EmployeeArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if (top == stack.length){
            Employee [] newArray = new Employee[top *2];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;
        }
        stack[top] = employee;
        top++;

    }
    public Employee pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }
    public Employee peek(){
        if (isEmpty()) throw new EmptyStackException();
        return stack[top-1];
    }
    public void print(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    public boolean isEmpty(){
        return top == 0;
    }


}

