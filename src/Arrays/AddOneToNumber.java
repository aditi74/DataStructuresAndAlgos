package Arrays;

import java.util.ArrayList;

/**
 * Created by 61310444 on 5/9/2016.
 * Given a non-negative number represented as an array of digits,

 add 1 to the number ( increment the number represented by the digits ).

 The digits are stored such that the most significant digit is at the head of the list.

 Example:

 If the vector has [1, 2, 3]

 the returned vector should be [1, 2, 4]

 as 123 + 1 = 124.
 */

public class AddOneToNumber {


    public static void main(String[] args) {

       int[] arr={9,9,9};
         int[] res=  plusOne(arr);

        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]);
        }
    }


    public static int[] plusOne(int[] digits) {
        // 299 , 999 ,1234

        int carry=1;
        int num=0;
        for (int i=digits.length-1;i>=0;i--)
        {
            num= digits[i]+carry;

            carry=0;


            if (num==10)
            {
                num=0;
                carry=1;
            }

            digits[i]=num;


        }

        if (carry==1)
        {
            int[] res= new int[digits.length+1];
            res[0]=carry;

            for(int i=1;i<res.length;i++)
            {
                res[i]=digits[i-1];
            }

            return res;
        }

        return digits;


    }
}
