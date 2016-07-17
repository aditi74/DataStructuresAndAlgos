package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 61310444 on 5/8/2016.
 * Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

 Examples:

 ar1[] = {1, 5, 10, 20, 40, 80}
 ar2[] = {6, 7, 20, 80, 100}
 ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
 Output: 20, 80

 ar1[] = {1, 5, 5}
 ar2[] = {3, 4, 5, 5, 10}
 ar3[] = {5, 5, 10, 20}
 Output: 5, 5

 */
public class CommonElementsInThreeSortedArrays {
    public static void main(String[] args) {

        /*int[] arrA = {1, 3, 4, 5, 7};
        int[] arrB = {2, 3, 5, 6};*/
       /* int[] arrA = {1, 3, 4, 5, 7};
        int[] arrB = {2, 3, 5, 6};*/

         int[] arrA = {1, 5, 10, 20, 40, 80};
        int[] arrB = {6, 7, 20, 80, 100};
        int[] arrC = {3, 4, 15, 20, 30, 70, 80, 120};
        ArrayList<Integer> arrayList = new ArrayList<>();
      //  arrayList = CommonElementsInTwoArr(arrA, arrB);

   commonElements(arrA,arrB,arrC);
       /* for (Integer a: arrayList ) {
            System.out.println(a);
        }*/
    }

    //Works well when lengthA<< lengthB ---> for Binary Search

    public static ArrayList CommonElementsInTwoArr(int[] arrA,int[] arrB)
    {
        int lengthA= arrA.length;
        int lengthB= arrB.length;
        ArrayList<Integer> arrayList= new ArrayList<>();

        if (lengthA<lengthB)
        {
            for (int i=0;i<lengthA;i++){
                //Arrays.binarySearch(arrB,arrA[i]);
               int mid=BinarySearch.binarySearch(arrB,arrA[i],0,lengthB-1);
               if (mid!=-1)
               {
                   arrayList.add(arrA[i]);
               }

            }
        }

        else{
            for (int i=0;i<lengthB;i++){
                //Arrays.binarySearch(arrB,arrA[i]);
                int mid=BinarySearch.binarySearch(arrA,arrB[i],0,lengthA-1);
                if (mid!=-1)
                {
                    arrayList.add(arrB[i]);
                }

            }

        }
      return arrayList;

    }


    public static void commonElements(int[] arrA,int[] arrB,int[] arrC)
    {
       int i=0,j=0,k=0;

        while (i<arrA.length && j<arrB.length && k<arrC.length)
        {
            if (arrA[i]==arrB[j] && arrB[j] ==arrC[k])
            {
                System.out.println(arrA[i]);
                i++;
                j++;
                k++;
            }
            else if (arrA[i]<arrB[j])
                i++;
            else if(arrB[j]<arrC[k])
                j++;

            else
               k++;

        }


    }
}
