package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 61310444 on 7/6/2016.
 */
public class MatrixSearch {

    public static void main(String[] args) {
      //  ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row1= new ArrayList<>(Arrays.asList(2, 3, 4, 6));
        ArrayList<Integer> row2= new ArrayList<>(Arrays.asList(16, 19, 33, 36));
        ArrayList<Integer> row3= new ArrayList<>(Arrays.asList(37, 38, 38, 41));
        ArrayList<Integer> row4= new ArrayList<>(Arrays.asList(47, 47, 50, 51));
        ArrayList<Integer> row5= new ArrayList<>(Arrays.asList(55, 57, 58, 62));
        ArrayList<Integer> row6= new ArrayList<>(Arrays.asList(63, 65, 66, 66));
        ArrayList<Integer> row7= new ArrayList<>(Arrays.asList(68, 70, 75, 77));
        ArrayList<Integer> row8= new ArrayList<>(Arrays.asList(78, 84, 84, 86));
        ArrayList<Integer> row9= new ArrayList<>(Arrays.asList(86, 87, 88, 92));
        ArrayList<Integer> row10= new ArrayList<>(Arrays.asList(94, 95, 96, 97));
       // ArrayList<Integer> row7= new ArrayList<>(Arrays.asList(68, 70, 75, 77));
        ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
        a.add(row1);
        a.add(row2);
        a.add(row3);
        a.add(row4);
        a.add(row5);
        a.add(row6);
        a.add(row7);
        a.add(row8);
        a.add(row9);
        a.add(row10);


       int num= searchMatrix(a,81);
        System.out.println(num);

    }

    public  static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        for (ArrayList<Integer> list :a)
        {
            //debug;
            int len =list.size();
            if (b<= list.get(len-1))
            {
                System.out.println(list.get(len-1));
                System.out.println(list);
                int val=  Arrays.binarySearch(list.toArray(),b);
                System.out.println(val +"value");
                if (val >=0) return 1;
                else return 0;
            }
        }
        return 0;

    }
}
