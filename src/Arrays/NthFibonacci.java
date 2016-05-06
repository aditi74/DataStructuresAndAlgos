package Arrays;

/**
 * Created by 61310444 on 5/5/2016.
 */
public class NthFibonacci {

    public static void main(String[] args) {

     int n =   nthFibonacci(6);
        System.out.println(n);
    }

    //O(n) space  O(k)
    public static int nthFibonacci(int n)
    {
        int[] arr= new int[n+1];
        arr[0]=0;arr[1]=1;

        for (int i=2;i<=n;i++)
        {
           arr[i]=arr[i-1]+arr[i-2];
        }

        return arr[n];
    }

    public static int fibonacciUsingRecursion(int n)
    {
        if (n<0)
            throw new IllegalArgumentException("n cannot be negative");
        if (n==0||n==1)
            return n;
        return fibonacciUsingRecursion(n-1)+fibonacciUsingRecursion(n-2);


    }


}
