package Arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by 61310444 on 6/15/2016.
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 Return the sum of the three integers.
 You may assume that each input would have exactly one solution.

 Example:
 given array S = {-1 2 1 -4},
 and target = 1.

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
 */
public class ThreeSumClosest {
    public int threeSumClosest(ArrayList<Integer> a, int b) {
        Collections.sort(a);
        int curr_sum=0;
        int nearest_sum=11111111;
        int target=0;
        for (int i=0;i< a.size()-2;i++)
        {
            int j=i+1;
            int k= a.size()-1;

            while (j<k)
            {
                curr_sum= a.get(i)+a.get(j)+a.get(k);
                if (b==curr_sum)
                {
                    return curr_sum;
                }

                if (Math.abs(b-curr_sum)<nearest_sum )
                {

                    nearest_sum=Math.abs(b-curr_sum);
                    target=curr_sum;
                }

                if (curr_sum<=b)
                {
                    j++;
                }
                else
                    k--;
            }
        }
        return target;

    }
}
