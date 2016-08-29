package LeetCode;

/**
 * Created by 61310444 on 8/30/2016.
 */
public class FloorSquareRoot {

   public long  floorSqrt(long  x) {
// Your code goes here
       for (long i = 1; i < x / 2; i++) {
           if ((i * i) == x)
               return i;
           if ((i * i) > x)
               return i - 1;
       }
     return 0;
   }
}
