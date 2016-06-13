package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 61310444 on 6/11/2016.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("ABCD");

        LongestCommonPrefix longestCommon=new LongestCommonPrefix();
       String a= longestCommon.longestCommonPrefix(arrayList);
        System.out.println(a);
    }


    public String longestCommonPrefix(ArrayList<String> a) {
        String prefix="";
        if (a.size()>=2)
        {
            String first=a.get(0);
            String second= a.get(1);

            String finalPrefix="";
            int i=0;

            while(i<first.length())
            {
                if (first.charAt(i)==second.charAt(i))
                {
                    prefix+=first.charAt(i);
                    i++;
                }

                else
                    break;
            }
            System.out.println("Prefix at first point "+ prefix);
            for (int j=2;j< a.size();j++)
            {
                String newStr= a.get(j);
                System.out.println("newStr "+ newStr.length() + "prefix "+ prefix.length());
                int maxlen= prefix.length()>newStr.length()? newStr.length(): prefix.length();
                System.out.println("maxlen "+ maxlen);
                for(int k=0;k< maxlen;k++)
                {
                    if (newStr.charAt(k)==prefix.charAt(k))
                    {
                        finalPrefix+= newStr.charAt(k);
                        continue;
                    }
                    else
                    {

                        break;
                    }
                }
                prefix=finalPrefix;
                finalPrefix="";

            }

            return prefix;
        }
        else
            return a.get(0);
    }
}

