package MinHeap;

public class MinHeap {
    protected Comparable array[];
    private int count;

    public MinHeap(int i){
        array = new Comparable[i + 1];
        count = 0;
    }
    public MinHeap(Comparable[] anArray) {
        count = anArray.length;
        array = new Comparable[count + 1];
        for(int i = 0; i < count; i++) {
            array[i + 1] = anArray[i];
        }
        //buildHeapBottomUp();
    }

    public void enqueue(Comparable key){
        if(isFull()) System.out.println("Error: Heap full");

        int hole = ++count;

        // percolate up via a hole
        while(hole > 1 &&
                array[hole / 2].compareTo(key)>0){
            array[hole] = array[hole / 2];
            hole = hole / 2 ;
        }
        array[hole] = key;
    }

    public boolean isFull(){
        return count == array.length - 1;
    }
    public boolean isEmpty(){
        return count == 0;
    }

    public Comparable dequeueMin(){
        if(isEmpty()) System.out.println("Error: Heap is empty");
        Comparable minItem = array[1];
        array[1] = array[count];
        count--;
        percolateDown(1);
        return minItem;
    }

    private void percolateDown(int hole){
        int minChildIndex;
        Comparable temp = array[hole];
        while(hole * 2 <= count){
            minChildIndex = hole * 2;
            if(minChildIndex + 1 <= count && array[minChildIndex + 1].
                    compareTo(array[minChildIndex])<0)
                minChildIndex++;
            if(array[minChildIndex].compareTo(temp)<0){
                array[hole] = array[minChildIndex];
                hole = minChildIndex;
            } else
                break;
        }
        array[hole] = temp;
    }
    public void printHeap() {
        for (int i = 1; i <= count; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.println();
    }




}
