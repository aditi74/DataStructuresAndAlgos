package Arrays;

import java.util.HashMap;

/**
 * Created by 61310444 on 5/29/2016.
 */
public class FactorialUsingMemoization {
    public HashMap<Integer,Long> map=new HashMap<>();

    public static void main(String[] args) {
        FactorialUsingMemoization fact=new FactorialUsingMemoization();
        System.out.println( fact.getFactorial(13));

    }


    public Long getFactorial(int n)
    {
        Long value=map.get(n);
        if (value==null)
        {
           value=  getRecursiveFactorial(n);
            map.put(n,value);

        }
        return value;

    }

    public Long getRecursiveFactorial(int n)
    {
       if(n==0||n==1)
           return 1L;
        else
           return n* getRecursiveFactorial(n-1);



    }
}
