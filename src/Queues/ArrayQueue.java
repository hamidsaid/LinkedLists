package Queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

    int [] myQueue;
    int front;
    int back;

    //Create a constructor for initializing our arrays' size
    public ArrayQueue(int capacity){
        myQueue = new int[capacity];
    }

    public void enqueue(int item){
        //check if the queue is full
        if(back == myQueue.length){
            int [] newQueue = new int[2*myQueue.length];
            System.arraycopy(myQueue,0,newQueue,0,myQueue.length);
            myQueue = newQueue;
        }
        //if its not full
        myQueue[back] = item;
        back++;
    }

    public int dequeue(){
        //check if queue is empty
        if (back - front == 0){
            System.out.println("Queue is empty. Nothing to remove");
            throw new NoSuchElementException();
        }
        int removedItem = myQueue[front];
        front++;
        return removedItem;
    }

    public int peek(){
        //check if queue is empty hence nothin to peek
        if (back - front == 0){
            System.out.println("Queue is empty. Nothing to peek");
            throw new NoSuchElementException();
        }
        return myQueue[front];
    }

    public void print(){
        for (int i=front;i<back;i++) {
            //dont print null values
            if (myQueue[i] != 0) {
                System.out.println(myQueue[i]);
            }
        }
    }

}
