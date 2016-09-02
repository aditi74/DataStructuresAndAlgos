package LeetCode;

/**
 * Created by 61310444 on 8/2/2016.
 */
import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{
    public static void main(String[] args) {
        UserMainCode userMainCode= new UserMainCode();
        String str=userMainCode.GetSubString("My Name is Fran","rim");
        System.out.println( str);
    }

    public String GetSubString(String input1,String input2){
        // Read only region end
        // Write code here...
        if (input1.length()<input2.length())
            throw new UnsupportedOperationException("GetSubString(String input1,String input2)");

        String result=null;
        int[] inp1= new int[256];
        int[] inp2= new int[256];

        for (int i=0;i<input2.length();i++)
        {
            inp2[(int)input2.charAt(i)]++;
            inp1[(int)input1.charAt(i)]++;

        }
        int i=0,j=input2.length(),min=Integer.MAX_VALUE;

        while(j<input1.length())
        {
            if (containsGivenChar(inp1,inp2))
            {
                if ((j-i)<min)
                {
                    min=j-i;
                    result=input1.substring(i,j);
                    if (min== input2.length())
                        break;
                    inp1[(int)input1.charAt(i)]--;
                    i++;
                }
            }
            else{
                inp1[(int)input1.charAt(j)]++;
                j++;
            }
        }
        return result;

    }

    private boolean containsGivenChar(int[] inpA,int[] inpB)
    {
        for (int i=0;i<256;i++)
        {
            if (inpA[i]>inpB[i])
                return false;
        }
        return true;
    }

}