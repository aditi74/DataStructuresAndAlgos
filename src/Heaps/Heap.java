package Heaps;

/**
 * Created by 61310444 on 5/19/2016.
 */
public abstract class Heap {
    private int[] data;
    private int heapSize;

   /* public Heap(int size)
    {
        data=new int[size];
        heapSize=0;
    }*/

    public boolean isEmpty()
    {
         return (heapSize==0);
    }

    public int getLeftChild(int nodeIndex)
    {
        return ((2*nodeIndex)+1);
    }

    public int getRightChild(int nodeIndex)
    {
        return ((2*nodeIndex)+2);
    }

    public int getParent(int nodeIndex)
    {
        return (nodeIndex-1)/2;
    }

    public  abstract void printHeap();



}
