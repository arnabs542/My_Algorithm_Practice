import java.util.PriorityQueue;


public class Test {
    public static void main(String[] args) {
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        minHeap.offer(4);
//        minHeap.offer(5);
//        minHeap.offer(1);
//        minHeap.offer(3);
//        minHeap.offer(2);
//        while (!minHeap.isEmpty()) {
//            System.out.println(minHeap.poll());
//        }

//        class Cell{
//            public int row;
//            public int column;
//            public int value;
//            public Cell(int row, int column, int value) {
//                this.row = row;
//                this.column = column;
//                this.value = value;
//            }
//        }
//
//
//        PriorityQueue<Cell> minHeap = new PriorityQueue<Cell>();
//        Cell c1 = new Cell(0,0,0);
//        Cell c2 = new Cell(0,1,2);
//        minHeap.offer(c1);
//        minHeap.offer(c2);



        //test MinHeap
        int[] array = new int[]{2,4,1,2,6,8,0,2,7,5,3};
        MinHeap minheap = new MinHeap(array);
        int j = 11;
        for (int i=0;i<11;i++) {
            System.out.println(minheap.poll());
        }





    }
}

