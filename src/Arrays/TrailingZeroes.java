package Arrays;

/**
 * Created by 61310444 on 6/25/2016.
 * Given an integer n, return the number of trailing zeroes in n!.

 Note: Your solution should be in logarithmic time complexity.

 Example :

 n = 5
 n! = 120
 Number of trailing zeros = 1
 So, return 1
 */
public class TrailingZeroes {

    public static void main(String[] args) {
        TrailingZeroes sol= new TrailingZeroes();

    }


    public int trailzero(int a)
    {
       int count=5;
        int total=0;

      while(a/count>=1)
      {
          total=total+a/count;
          count=count*5;
      }
      return total;

    }
}
