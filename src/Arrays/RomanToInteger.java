package Arrays;

import java.util.HashMap;

/**
 * Created by 61310444 on 6/18/2016.
 * Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.

 Read more details about roman numerals at Roman Numeric System

 Example :

 Input : "XIV"
 Return : 14
 Input : "XX"
 Output : 20
 */
public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger=new RomanToInteger();
        int sum=romanToInteger.romanToInt("XIV");
        System.out.println(sum);

    }
    public int romanToInt(String a) {
        HashMap<String,Integer> map= new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int sum=0;

        if (a.length()==1)
            return map.get(String.valueOf(a.charAt(0)));

        for (int i=0;i<a.length()-1;i++)
        {
            if (map.get(String.valueOf(a.charAt(i)))< map.get(String.valueOf(a.charAt(i+1))) &&
                    i+1<a.length())

            {
                sum= sum-map.get(String.valueOf(a.charAt(i)));
            }

            if (map.get(String.valueOf(a.charAt(i)))>= map.get(String.valueOf(a.charAt(i+1))) && i+1<a.length())
            {
                sum=sum+map.get(String.valueOf(a.charAt(i)));
            }
        }

        sum+=map.get(String.valueOf(a.charAt(a.length()-1)));
        return sum;


    }
}
