package MinHeap;

public class Main {
    public static void main (String [] args) {
        MinHeap minHeap = new MinHeap(10);
        minHeap.enqueue(80);
        minHeap.enqueue(75);
        minHeap.enqueue(60);
        minHeap.enqueue(68);
        minHeap.enqueue(55);
        minHeap.enqueue(40);
        minHeap.enqueue(52);
        minHeap.enqueue(67);

        System.out.println(minHeap.dequeueMin());

        minHeap.printHeap();

    }
}
