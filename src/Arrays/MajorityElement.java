package Arrays;

/**
 * Created by 61310444 on 5/6/2016.
 */

/***Using Boyer-Moore Vote Algorithm**/
public class MajorityElement {

    public static void main(String[] args) {
        int[] arrA={2, 6, 2, 2, 6, 2, 2, 8, 2, 1};
        int[] arrB={1, 7, 8, 2, 6, 8, 1, 3, 2, 8};
       // int major=majorityUsingBruteForce(arrB);
        int major =getMajorityElemnent(arrB);
        System.out.println(major);

    }


    public static int majorityUsingBruteForce(int[] arr)  //O(n2)time complexity using two for loops traverse first loop ,count the occurrence
    {
        int currCounter=0,majority_element=0,maxCounter=0;

        for (int i=0; i<arr.length;i++)
        {
             currCounter=1;
            for (int j=i+1; j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    currCounter++;
                }

            }

            if(maxCounter<currCounter)
            {
                maxCounter=currCounter;
                majority_element=arr[i];
            }

        }
        if (maxCounter>= (arr.length/2))
            return  majority_element;
        else
            return 0;

    }

  //Boyer-Moore Vote Algorithm O(n) and Space Complexity O(1)
    public static int getMajorityElemnent(int[] arr) {
        int count = 0, candidate = 0;
        //find the max element
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
                count++;
            } else {
                if (arr[i] == candidate)
                    count++;
                else
                    count--;
            }

        }

        if (count == 0)
            return 0;

        //Check if candidate is majority element

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate)
                counter++;
        }
        if (counter >= (arr.length / 2))
            return candidate;
        else
            return 0;
    }

}
