package Arrays;

/**
 * Created by 61310444 on 7/17/2016.
 * Find non repeating element in an array
 */
public class NonRepeating {
    public static void main(String[] args) {
       int[] arr= {3, 4 ,1 ,3 ,1 ,7 ,2 ,2, 4};
       int num= nonRepeatingElement(arr);

        System.out.println("Num is +" +num);


    }


    public static int nonRepeatingElement(int[] arr)
    {
        int num=0;
        for(int i=0;i<arr.length;i++)
        {
            num=num^arr[i];
        }
        return num;
    }
}

