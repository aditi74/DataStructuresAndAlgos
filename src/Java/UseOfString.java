package Java;

import sun.plugin2.gluegen.runtime.StructAccessor;

import java.util.HashMap;

/**
 * Created by 61310444 on 6/29/2016.
 */
public class UseOfString {
    public static void main(String[] args)
    {
        String str="abc";
        String str1= "abc";   //Str and str1 are present in String pool , not created if str is already present in string pool
        String strHeap= new String("abc");// it is always created in heap memory

        System.out.println(str==str1);
        System.out.println(str==strHeap);
        str= "xyz";
        System.out.println(str==str1);
        String str3= str +str1;// str3
      //  HashMap<String,Integer>
        HashMap<String,Integer> integerHashMap = new HashMap<String,Integer>();




    }
}
