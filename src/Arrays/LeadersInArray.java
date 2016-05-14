package Arrays;

/**
 * Created by 61310444 on 5/6/2016.
 * Given an array of integers, print the leaders in the array. A leader is an element which is larger than all the elements in the array to its right.
 For example:
 Input Array:
 { 98, 23, 54, 12, 20, 7, 27 }
 Output:
 Leaders- 27 54 98
 */
public class LeadersInArray {
    public static void main(String[] args) {
      int[] arr= { 98, 23, 54, 12, 20, 7, 27 };
      leaderInArray(arr);
    }
   /*Start from the rightmost side of the array*/

    public static void leaderInArray(int[] arr)
    {
        int maxleader=0;
        for (int i=arr.length-1;i>=0;i--)
        {
            if (arr[i]>maxleader)
            {
                System.out.println(arr[i]);
                maxleader=arr[i];
            }
        }
    }


}
