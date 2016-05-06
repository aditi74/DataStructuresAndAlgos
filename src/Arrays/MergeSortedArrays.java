package Arrays;

/**
 * Created by 61310444 on 5/6/2016.
 */
/***merge-two-sorted-arrays-without-extra-space**/
public class MergeSortedArrays {
    public static final int INVALID_NUM= 11111;
    public static void main(String[] args) {
       int[] arrayA = {-3, 5, INVALID_NUM, 7, INVALID_NUM, 10, INVALID_NUM, 11, INVALID_NUM};
       int[] arrayB = {-1, 2, 6, 12};
        MergeSortedArrays(arrayA,arrayB);
        for (int i=0;i<arrayA.length;i++)
        {
            System.out.println(arrayA[i]);
        }

    }

    public static void MergeSortedArrays(int[] arrA,int[] arrB)
    {
        int index=arrA.length-1;
        for (int i=arrA.length-1;i>=0;i--)  //Moving all Invalid_Num to the left of the zeroes
        {
            if (arrA[i]!=INVALID_NUM)
            {
               arrA[index]=arrA[i];
               arrA[i]=INVALID_NUM;
               index--;
            }
        }

        index++;
      int i=index,j=0,k=0;// Comparing Array A from index postion and Array B and then putting them into Array A from 0th till index-1 position

        while ((i<arrA.length) && (j<arrB.length))
        {
            if (arrA[i]<arrB[j])
            {
                arrA[k]=arrA[i];
                i++;
                k++;
            }
            else {
                arrA[k]=arrB[j];
                j++;
                k++;
            }
        }

        while (i<arrA.length)
        {
            arrA[k]=arrA[i]++;
            i++;
            k++;
        }

        while (j<arrB.length)
        {
            arrA[k]=arrB[j];
            j++;
            k++;
        }



    }
}
