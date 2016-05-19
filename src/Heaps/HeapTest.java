package Heaps;

/**
 * Created by 61310444 on 5/19/2016.
 */
public class HeapTest {
    public static void main(String[] args) {
        MinHeap heap=new MinHeap(10);
        heap.insert(5);
        heap.insert(6);
        heap.insert(9);
        heap.insert(2);
        heap.insert(1);
        heap.insert(3);
        heap.printHeap();

        heap.deleteMin();
        System.out.println("removing elements");
        heap.printHeap();

        heap.deleteMin();
        System.out.println("removing elements again");
        heap.printHeap();
    }
}
