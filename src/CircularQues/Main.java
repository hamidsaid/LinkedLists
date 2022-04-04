package CircularQues;

public class Main {
    public static void main(String [] args){

        CircularQueue circularQueue = new CircularQueue(6);
        circularQueue.enqueue(34);
        circularQueue.enqueue(12);
        circularQueue.enqueue(11);
        circularQueue.enqueue(99);

//        System.out.println(circularQueue.peek());
//        circularQueue.dequeue();
//        System.out.println(circularQueue.peek());

        circularQueue.displayQueue();
       // circularQueue.printQueue();
    }
}
