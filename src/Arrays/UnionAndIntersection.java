package Arrays;

/**
 * Created by 61310444 on 5/8/2016.
 *
 Union and Intersection of two sorted arrays

 Given two sorted arrays, find their union and intersection.

 For example, if the input arrays are:
 arr1[] = {1, 3, 4, 5, 7}
 arr2[] = {2, 3, 5, 6}
 Then your program should print Union as {1, 2, 3, 4, 5, 6, 7} and Intersection as {3, 5}.
 *
 */
public class UnionAndIntersection {

    public static void main(String[] args) {
        int[] arrA={1,3,4,5,6,7};
        int[] arrB={2,3,5,6};

        union(arrA,arrB,6,4);

    }

    public static void union(int[] arrA,int[] arrB,int m,int n)
    {
        int i=0,j=0;

        while (i<m && j<n)
         {
           if (arrA[i]==arrB[j])
           {
               System.out.println(arrA[i]);
               i++;
               j++;
           }
          else if (arrA[i]<arrB[j])
           {
               System.out.println(arrA[i]);
               i++;
           }
           else {
               System.out.println(arrB[j]);
               j++;
           }


         }
    }

    public static void intersection(int[] arrA,int[] arrB,int m,int n)
    {
        int i=0,j=0;

        while (i<m && j<n)
        {
            if (arrA[i] ==arrB[j])
            {
                System.out.println(arrA[i]);
                i++;
                j++;
            }
            else if(arrA[i]<arrB[j])
            {
                i++;
            }
            else j++;
        }
    }
}
