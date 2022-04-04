package Queues;

public class Main {
    public static void main(String[] args){

        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(19);
        arrayQueue.enqueue(99);
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(8);

        arrayQueue.print();
        System.out.println("Removed value" +arrayQueue.dequeue());
        System.out.println("Front value" + arrayQueue.peek());

        arrayQueue.enqueue(4);
        arrayQueue.print();

    }
}
