package LeetCode;

import java.util.HashMap;

/**
 * Created by 61310444 on 8/1/2016.
 */
public class RunLengthEncoding {

    public static void main(String[] args) {
       RunLengthEncoding runLengthEncoding = new RunLengthEncoding();
        String result= runLengthEncoding.encodingUsingIteration("aaaabbbcccab");
        System.out.println(result);
    }


    public String encodingUsingIteration(String str)
    {
        char comp= str.charAt(0);
        int num=1;
        StringBuilder builder= new StringBuilder();
        builder.append(comp);
        for (int i=1;i<str.length();i++)
        {
            if (comp==str.charAt(i))
            {
                num++;
            }

            else
            {
               builder.append(num);
               num=1;
               comp= str.charAt(i);
               builder.append(comp);
            }
        }
        builder.append(num);
        return builder.toString();


    }


    /// this will fail if alphabets are repeated after a break
   public String encode(String str)
    {
        HashMap<Character,Integer> map= new HashMap<>();
        StringBuilder temp= new StringBuilder();
        for (int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                int num=map.get(str.charAt(i))+1;
                map.put(str.charAt(i),num);
            }
            else
            {
                map.put(str.charAt(i),1);
                temp.append(str.charAt(i));
            }

        }

        StringBuilder retString = new StringBuilder();
        for (int k=0;k<temp.length();k++)
        {
            retString.append(temp.charAt(k));
            retString.append( map.get(temp.charAt(k)));
        }

        return retString.toString();
    }






    /*public String encode2(String str)
    {
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i))


        }

    }*/

}

