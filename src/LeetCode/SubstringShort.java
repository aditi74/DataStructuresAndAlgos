package LeetCode;

import java.io.*;
import  java.util.*;

// Read only region start
public class SubstringShort
{
    public static void main(String[] args) {
               SubstringShort substringShort= new SubstringShort();
            String str=substringShort.find("My Name is Fran","rim");
        System.out.println(str);
    }

    public static String find(String input1, String input2) {
        if (input2.length() > input1.length())
            return null;
        int[] inpB = new int[256];
        int[] inpA = new int[256];
        // Time: O(input2.lenght)
        for(int i=0;i<input2.length();i++) {
            inpB[(int)(input2.charAt(i))]++;
            inpA[(int)(input1.charAt(i))]++;
        }
        int i = 0, j = input2.length(), min = Integer.MAX_VALUE;
        String res = null;
        // Time: O(input1.lenght)
        while (j < input1.length()) {
            if (containsPatternChar(inpA, inpB)) {
                if ((j - i) < min) {
                    min = j - i;
                    res = input1.substring(i, j);
                    // This is the smallest possible substring.
                    if(min==input2.length())
                        break;
                    // Reduce the window size.
                    inpA[(int)(input1.charAt(i))]--;
                    i++;
                }
            } else {
                inpA[(int)(input1.charAt(j))]++;
                // Increase the window size.
                j++;
            }
        }
        System.out.println(res);
        return res;
    }
    private static boolean containsPatternChar(int[] inpA, int[] inpB) {
        for(int i=0;i<256;i++) {
            if(inpB[i]>inpA[i])
                return false;
        }
        return true;
    }

}