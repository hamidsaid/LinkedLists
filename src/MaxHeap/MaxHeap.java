package MaxHeap;

public class MaxHeap {
    Comparable[] array;
    int count;

    public MaxHeap(int size){
        array = new Comparable[size];
        count = 0;
    }

    public void enqueue(Comparable key){
        if (isFull()) throw new ArrayIndexOutOfBoundsException("Heap is full");
        //available position for inserting
        int hole = ++count;

        //heapify i.e percolate up
        while(hole >1 && array[hole/2].compareTo(key)<0){
            array[hole/2] = key;
            hole = hole/2;
        }
        array[hole] = key;
    }

    public Comparable dequeueMax(){
        if (isEmpty()) System.out.println("Heap is Empty");
        Comparable maxKey = array[1];
        //replace the root with the last key in the array
        array[1] = array[count];
        //delete last key
        count--;
        //percolate down(heapify the heap)
        percolateDown(1);

        return maxKey;
    }

    private void percolateDown(int hole) {
        int minChildIndex;
        //store the value that replaced the deleted value
        Comparable temp = array[hole];
        while (hole*2 <= count){
            //left child
            minChildIndex = 2*hole;
            //lets check if minChildIndex is really the index
            //of the smallest child
            if (minChildIndex+1 <= count && array[minChildIndex+1].compareTo(array[minChildIndex])>0){
                //we interested in the max child since we will swap temp with it
                minChildIndex++;
            }
            //check if the largest child is greater than the parent so that we can swap them
            if (array[minChildIndex].compareTo(temp)>0){
                array[hole] = array[minChildIndex];
                hole = minChildIndex;
            }else{ break;}
            array[hole] = temp;
        }

    }

    public void printHeap(){
        for (int i =1;i<=count;i++){
            System.out.print(array[i]+",");
        }
        System.out.println();
    }

    public boolean isFull(){
        return count == array.length;
    }
    public boolean isEmpty(){
        return count == 0;
    }
}
