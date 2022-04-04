package MaxHeap;

public class Main {
    public static void main(String [] args){
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.enqueue(80);
        maxHeap.enqueue(75);
        maxHeap.enqueue(60);
        maxHeap.enqueue(68);
        maxHeap.enqueue(55);
        maxHeap.enqueue(40);
        maxHeap.enqueue(52);
        maxHeap.enqueue(67);

        maxHeap.printHeap();
        System.out.println(maxHeap.dequeueMax());
        maxHeap.printHeap();
    }
}
