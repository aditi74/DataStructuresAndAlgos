package Arrays;

/**
 * Created by 61310444 on 5/6/2016.
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
