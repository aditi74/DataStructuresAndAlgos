package Heaps;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by 61310444 on 5/21/2016.
 * find maximum element in sliding window.
 *
 * O(n) Time Complexity
 */
public class SlidingWindowAlgo {
    public static void main(String[] args) {
       int[] input ={9,6,11,8,10,5,14,13,93,14};
        int k=4;
       int[] output=new int[10];
        usingDeque(input,k,output);

    }


    public static void usingDeque(int[] input,int k,int[] output )
    {
       Deque<Integer> deque= new ArrayDeque<>();

       /*Insert till k* int the queue*/

       for (int i=0;i<k;i++)
       {
           while (!deque.isEmpty() && input[i]>=input[deque.getLast()])
           {
               deque.pollLast();
           }

           deque.addLast(i);
       }

       for (int i=k;i<input.length;i++)
       {
          // output[i-k]=input[deque.getFirst()];   //Max element in the window k
           System.out.println(input[deque.getFirst()]);
           // remove the element which is outside the window
           while (!deque.isEmpty() && deque.getFirst()<=i-k)
               deque.removeFirst();
           while (!deque.isEmpty() && input[deque.getLast()] < input[i])
               deque.removeLast();

           deque.addLast(i);

       }
        //print the last max element in the window

        System.out.println(input[deque.getFirst()]);



    }

}

