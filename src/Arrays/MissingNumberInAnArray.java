package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by 61310444 on 5/15/2016.
 */
public class MissingNumberInAnArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,6,7,8};
        //usingMap(arr,8);
        //usingSum(arr, 8);
        System.out.println(usingXOR(arr, 8));
    }


    public static void usingMap(int[] arr,int k)
    {
        Map<Integer,Integer>  map=new HashMap<>();
        for (int i=1;i<=k;i++)
        {
          map.put(i,0);
        }

        for (int i=0;i< arr.length;i++)
        {
            map.put(arr[i],1);
        }

        Iterator iterator=map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry pair= (Map.Entry) iterator.next();
            if (pair.getValue()==(Integer)0)
            {
                System.out.println(pair.getKey());
            }

        }
    }

    public static void usingSum(int[] arr,int k) {  //Chances of overflow
        int sum = (k * (k + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        System.out.println(sum);
    }

    public static int usingXOR(int[] arr,int k)  //XOR operations O(n)
    {
        int X=arr[0],Y=1;
        for (int i=1;i<arr.length;i++)
        {

            X=X^arr[i];
        }

        for (int i=2;i<=k;i++)
        {
            Y=Y^i;
        }
        return X^Y;




    }

}
