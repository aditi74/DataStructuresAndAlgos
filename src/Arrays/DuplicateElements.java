package Arrays;

import java.util.HashMap;

/**
 * Created by 61310444 on 5/10/2016.
 */
public class DuplicateElements {
    public static void main(String[] args) {
      int[] arr= {3,2,1,2,2,3};
       // usingHashing(arr);
        findDuplicates(arr);


    }

    public static void bruteForce(int[] arr)  //o(n2)
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {System.out.println("Duplicate found"+arr[i]);
                    return;}
            }
        }


    }

    public static void usingSorting(int[] arr)  //O(nlogn) using quick sort
    {
        QuickSort quickSort=new QuickSort();
        quickSort.QuickSort(arr,0,arr.length-1);

        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]==arr[i+1])
            {
                System.out.println("duplicate found");
                return;
            }
        }
    }


    public static void usingHashing(int[] arr)  //O(n) Time Complexity 0(n)
    {
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i=0 ;i<arr.length;i++)
        {
          if (map.containsKey(arr[i]))
              System.out.println("duplicate element"+arr[i]);
            else
              map.put(arr[i],1);

        }
    }

    public static void findDuplicates(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            if (arr[Math.abs(arr[i])]<0)
            {
                System.out.println(Math.abs(arr[i]));
            }
            else
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        }


    }
}
