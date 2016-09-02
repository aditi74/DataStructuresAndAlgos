package LeetCode;

import java.util.*;

/**
 * Created by 61310444 on 8/2/2016.
 */
public class DryingClothProblem {



        //Assume following return types while writing the code for this question.
        public static void main(String[] args) {
            int input1 = 10;
            int input2 = 5;
            int[][] input3 = {{0,4},{6,3},{1,5},{6,4},{7,2}};
            System.out.println("\nVisible cloths count # " + getVisibleCount(input1, input2, input3));
        }

    private static int getVisibleCount(int input1, int input2, int[][] input3) {
        if (input2 != input3.length) {
            throw new IllegalArgumentException(
                    "Clothes are less as compared to given input3 size");
        }

        int givenClothes = input2;
        int min = 0;
        int max = 1;
        for (int i = min; i < givenClothes; i++) {
            int start = input3[i][0];
            int length = input3[i][1];
            int end = start + length;
            if (end > max)
                max = end;
        }

        if (max != input1) {
            throw new IllegalArgumentException(
                    " Rope length is not same as given input3");
        }

        Integer[] visibleClothes = new Integer[max];

        for (int i = 0; i < max; i++) {
            visibleClothes[i] = 0;
        }

        int count = 0;

        for (int i = 0; i < input3.length; i++) {
            int start = input3[i][0];
            int length = input3[i][1];
            int end = start + length;
            count++;
            for (int j = start; j < end; j++) {
                visibleClothes[j] = count;
            }

        }

        HashSet<Integer> visibleCloth = new HashSet<>();

        for (int i = 0; i < visibleClothes.length; i++) {
            if (visibleClothes[i] > 0) {
                visibleCloth.add(visibleClothes[i]);
            }
        }

        return visibleCloth.size();
    }
    }
