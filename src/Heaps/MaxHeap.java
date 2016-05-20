package Heaps;

/**
 * Created by 61310444 on 5/21/2016.
 */
public class MaxHeap extends Heap {
    private int[] data;
    private int heapSize;

    public MaxHeap(int size)
    {
        data=new int[size];
        heapSize=0;
    }


    @Override
    public boolean isEmpty() {
        return heapSize==0;
    }

    @Override
    public void printHeap() {
       for (int i=0;i<heapSize;i++)
           System.out.println(data[i]);
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

    public void percolateUp(int NodeIndex)
    {
        if (NodeIndex==0)return;

        else
        {
            int parentIndex= getParent(NodeIndex);
            if (data[parentIndex]<data[NodeIndex])
            {
                int temp=data[parentIndex];
                data[parentIndex]=data[NodeIndex];
                data[NodeIndex]=temp;
                percolateUp(parentIndex);
            }
        }
    }



    public int getMaximum()
    {
        if (heapSize<0)return -1;
        return data[0];
    }

    public void deleteMaximum()
    {
        if (heapSize<0)throw new RuntimeException("Heap is already empty");

        else
        { data[0]=data[heapSize-1];
            heapSize--;
        percolateDown(0);}
    }

    public void percolateDown(int NodeIndex)
    {
        if (NodeIndex==heapSize-1)return;

        int leftChildIndex=getLeftChild(NodeIndex);
        int rightChildIndex= getRightChild(NodeIndex);
        int maxIndex;
        if (leftChildIndex>=heapSize && rightChildIndex >= heapSize)
            return;
        else if(leftChildIndex>=heapSize && rightChildIndex <heapSize)
            maxIndex=rightChildIndex;
        else if (leftChildIndex<heapSize && rightChildIndex >= heapSize)
            maxIndex=leftChildIndex;
        else {
             maxIndex=data[leftChildIndex]>=data[rightChildIndex]?leftChildIndex:rightChildIndex;
        }

        if(data[NodeIndex]<data[maxIndex])
        {
            int tmp=data[NodeIndex];
            data[NodeIndex]=data[maxIndex];
            data[maxIndex]=tmp;
            percolateDown(maxIndex);
        }
    }


    public void buildHeap(int[] arr)
    {
        this.heapSize=arr.length;
        for (int i=0;i<heapSize;i++)
        {
            data[i]=arr[i];
        }
        int mid=arr.length/2;
        for (int i=mid;i>=0;i--)
        {
        percolateDown(i);}
    }


}
