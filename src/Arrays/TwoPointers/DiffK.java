package Arrays.TwoPointers;

import java.util.ArrayList;

/**
 * Created by 61310444 on 5/24/2016.
 * Given an array ‘A’ of sorted integers and another non negative integer k,
 * find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.
 * A : [1 3 5]
 k : 4
 */
public class DiffK {

 public static void main(String[] args) {



 }
 public int diffPossible(ArrayList<Integer> a, int b) {

  int i=0;
  int j=1;
  while(i<a.size() &&j<a.size())
  {
   if (a.get(j)-a.get(i)==b && i!=j)
    return 1;

   if (a.get(j)-a.get(i)<b)
   {
    j++;
   }
   else
    i++;
  }
  return 0;
 }
}
