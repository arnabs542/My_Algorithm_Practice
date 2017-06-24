import java.util.NoSuchElementException;

/**
 * Created by xiangyuli on 4/5/17.
 */
public class MinHeap {
    private int[] array;
    private int size;
    //constructor
    public MinHeap(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("input array cannot be null or empty");
        }
        this.array = array;
        size = array.length;
        //need heapify to form heap using array
        heapify();
    }

    //heapify function
    public void heapify() {
        for (int i=size/2 -1; i >=0; i--) {
            //need percolateDown to put the element into the right position of heap
            percolateDown(i);
        }
    }

    //size()
    public int size() {
        return size;
    }

    //isEmpty()
    public boolean isEmpty() {
        return size == 0;
    }

    //isFull()
    public boolean isFull() {
        return size == array.length;
    }

    //peek()
    public int peek() {
        if (size == 0) {
            return -1;
        }
        return array[0];
    }

    //poll()
    public int poll() {
        if (size == 0) {
            throw new NoSuchElementException("heap is empty");
        }
        int result = array[0];
        // only make the array[0] equals to the last element in the current loop,
        // the original array has not change, also the last element is still there, so cannot use array[array.length - 1];
        array[0] = array[size - 1]; // cannot use array[array.length - 1]; because the array.length is not change, size is changing
        size--;
        // aleady put the rightest element to index0, then move down to the right position
        percolateDown(0);
        return result;
    }

    //offer
    public void offer(int element) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            //copy the element in array to newarray
            for(int i=0;i<array.length;i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = element;
        size++;
        //percolateUp to help the element move up to the right position in the heap
        percolateUp(size-1);
    }

    //update(), return the origial value before update
    public int update(int index, int element) {
        //check if index is legal
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("invalid index range");
        }
        int result = array[index];
        array[index] = element;
        //put the element into the right position in the heap
        if (result > element) {
            percolateUp(index);
        } else {
            percolateDown(index);
        }
        return result;
    }

    ////helper functions////////////
    public void percolateUp(int index) {
        while (index>0) {
            int parentIndex = (index - 1) / 2;
            if (array[parentIndex] > array[index]) {
                swap(array,parentIndex,index);
            } else{
                break;
            }
            index = parentIndex;
        }
    }


    public void percolateDown(int index) {
        while (index <= (size - 2) / 2) {
            int leftChildIndex = index * 2 + 1;
            int rightChildIndex = index * 2 + 2;
            //swapCandidate is the smaller node of the chile nodes
            int swapCandidate = leftChildIndex;
            if (rightChildIndex <= size - 1 && array[leftChildIndex] >= array[rightChildIndex]) {
                swapCandidate = rightChildIndex;
            }
            //compare parent node with its child node, swap if necessary
            if (array[index] > array[swapCandidate]) {
                swap(array, index, swapCandidate);
            } else{ break; }
            index = swapCandidate;
        }
    }


    private void swap(int[] array,int index1,int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
