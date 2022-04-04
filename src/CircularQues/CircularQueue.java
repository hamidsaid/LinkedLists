package CircularQues;

import java.util.NoSuchElementException;

public class CircularQueue {

    int front;
    int rear;
    int counter;
    int [] arr;

    public CircularQueue(int capacity) {
        front =0;
        //the queue is initially empty
        rear =-1;
        //keep track of enqueued items
        counter =0;
        arr = new int[capacity];
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is full");
        }else{
            //the next available position to insert
            rear = (rear+1) % arr.length;
            arr[rear] = data;
            counter++;
        }

    }
    public int dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
         int removedValue = arr[front];
        front = (front+1) % arr.length;
        counter--;
        return removedValue;
    }

    public int peek(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
            return arr[front];
    }
    public boolean isEmpty(){
        return counter ==0;
    }

    public boolean isFull(){
        //full when the next position(next rear) to add a value is equal to the front
        return counter == arr.length;
    }

    public void dequeueAll() { //same code as constructor
        arr		=	new int[arr.length];
        front			=	0;
        rear			=	-1;
        counter		=	0;
    }

    public void displayQueue() {
        System.out.print("front -->");
        for (int i = 0; i < counter; i++) {
            if (i == 0) System.out.print("\t");
            else		System.out.print("\t\t");
                    System.out.print(arr[(front + i) % arr.length]);
            if (i != counter - 1)
                System.out.println("");
            else
                System.out.print("\t<-- rear");
        }
    }

    public void printQueue(){
        for (int i =0;i<counter;i++){
            System.out.println(arr[(front+i)%arr.length]);
        }
    }

}
