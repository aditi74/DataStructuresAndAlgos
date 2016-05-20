package Heaps;

/**
 * Created by 61310444 on 5/19/2016.
 */
public class MinHeap  extends Heap{
    private int[] data;
    private int heapSize;
    public MinHeap(int size)
    {
      data=new int[size];
      heapSize=0;
    }


    public void insert(int value)
    {
        if (heapSize==data.length)
            throw  new RuntimeException("Heap is full");
        else
        {
            heapSize++;
            data[heapSize-1]=value;
            percolateUp(heapSize-1);
        }
    }

    public void percolateUp(int nodeIndex)
    {
        if (nodeIndex==0) return;
        int temp;
        int parent= getParent(nodeIndex);
        if (data[parent]>data[nodeIndex]){
            //swap the variables
             temp=data[parent];
             data[parent]=data[nodeIndex];
             data[nodeIndex]=temp;
             percolateUp(parent);

        }

    }

    public int getMinimum()
    {
        if(isEmpty())throw new RuntimeException("heap is empty");
        else
            return data[0];
    }
    @Override
    public void printHeap()
    {
        for (int i=0;i<heapSize;i++)
        {
            System.out.println(data[i]);
        }
    }

    @Override
    public boolean isEmpty()
    {
      return (this.heapSize==0)  ;
    }
    public void deleteMin() //O(logn)
    {
        if (isEmpty())throw new RuntimeException("Heap is empty");

       else {
            data[0] = data[heapSize - 1];
            heapSize--;
            if (heapSize>0)
              percolateDown(0);
        }


    }

    public void percolateDown(int nodeIndex)
    {
        int leftChildIndex=getLeftChild(nodeIndex);
        int rightChildIndex= getRightChild(nodeIndex);

        int minIndex;
        if (leftChildIndex>=heapSize && rightChildIndex >=heapSize)return;
        else if (leftChildIndex >=heapSize && rightChildIndex<heapSize)
        {
            minIndex=rightChildIndex;
        }

        else if (leftChildIndex<heapSize && rightChildIndex>=heapSize)
        {
            minIndex=leftChildIndex;
        }

        else {
            if( data[leftChildIndex]<data[rightChildIndex])
                minIndex=leftChildIndex;
            else
                minIndex=rightChildIndex;
        }

        if (data[nodeIndex]>data[minIndex])
        {
            //swap the variables
            int tmp=data[nodeIndex];
            data[nodeIndex]=data[minIndex];
            data[minIndex]=tmp;
            percolateDown(minIndex);
        }
    }
 /*
    Start from the middle element of the array, let’s say i
    Heapify with given index.
    Decrease index by one. Repeat step 2 till we reach first element.
    Operation O(n)*/

    public void buildHeap(int[] arr)
    {
        for (int i =0;i<arr.length;i++)
        {
            data[i]=arr[i];
        }
        int mid=arr.length/2;
        heapSize=arr.length;
        for(int i=mid;i>=0;i--)
        {
            percolateDown(i);
        }
    }

}
