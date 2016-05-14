package Arrays;

/**
 *Given an array and a positive integer k, rotate the array k times.
 Example:
 Array:  1 2 3 4 5
 k: 1
 Output: 2 3 4 5 1
 k: 2
 Output: 3 4 5 1 2
 k: 3
 Output: 4 5 1 2 3
 */
public class RotateArrayKTimes {
    public static void main(String[] args) {
       int[] arr= {1 ,2, 3, 4, 5};
       // bruteForceRotateArray(arr,3);
        rotateArrayEfficient(arr,3);
        for (int i=0;i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }
    }

    public static void rotateArrayOnce(int[] arr)
    {
        int temp;

            temp=arr[0];
            for(int j=0;j<arr.length-1;j++)
            {

              arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
    }

    public static void bruteForceRotateArray(int[] arr,int k)
    {
        if (k<0)
        {
            System.out.println("This is not possible");
            return ;}
        if (k>arr.length)
            k=k%(arr.length);

        for (int i=0;i<k;i++)
        {
            rotateArrayOnce(arr);
        }

    }

    public static void rotateArrayEfficient(int[] arr,int k)
    {
      reverseArrayUtil(arr,0,k-1);
      reverseArrayUtil(arr,k,arr.length-1);
      reverseArrayUtil(arr,0,arr.length-1);


    }


    public static void reverseArrayUtil(int[] arr,int start,int end)
    {
      while (start<end)
      {
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
          end--;
      }


    }


}

