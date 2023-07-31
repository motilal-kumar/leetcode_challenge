package dsa_challenge_leetcode;

import java.util.stream.IntStream;

public class FindSmallestWindowSorting {


    public static int[] findSmallestWindowToSort(int[] a) {
        int NUMS = a.length;

        int LEFT_INDEX = IntStream.range(0, NUMS - 1)
                .filter(i -> a[i] > a[i + 1])
                .findFirst()
                .orElse(NUMS - 1);

        if (LEFT_INDEX == NUMS - 1) {
            return new int[]{0, 0};
        }

        int RIGHT_INDEX = IntStream.rangeClosed(1, NUMS - 1)
                .filter(i -> a[NUMS - i] < a[NUMS - i - 1])
                .findFirst()
                .orElse(0);

        int SUB_ARRAY_MIN = IntStream.rangeClosed(LEFT_INDEX, RIGHT_INDEX)
                .map(i -> a[i])
                .min()
                .orElse(a[LEFT_INDEX]);

        int SUB_ARRAY_MAX = IntStream.rangeClosed(LEFT_INDEX, RIGHT_INDEX)
                .map(i -> a[i])
                .max()
                .orElse(a[RIGHT_INDEX]);

        for (int i = LEFT_INDEX; i >= 0; i--) {
            if (a[i] > SUB_ARRAY_MIN) {
                LEFT_INDEX = i;
            } else {
                break;
            }
        }

        for (int i = RIGHT_INDEX; i < NUMS; i++) {
            if (a[i] < SUB_ARRAY_MAX) {
                RIGHT_INDEX = i;
            } else {
                break;
            }
        }

        return new int[]{LEFT_INDEX, RIGHT_INDEX};
    }

    public static void main(String[] args) {
        //int[] a = { 1, 2, 3, 7, 5, 6, 4, 8 };
        int[] a = { 1, 3, 2, 7, 5, 6, 4, 8 };


        int[] result = findSmallestWindowToSort(a);
        System.out.println("Sort the array from index 3 to 6 " + result[0] + " to " + result[1]);

    }


  /*  Find the smallest window in an array sorting which will make the entire array sorted
    Given an integer array, find the smallest window sorting which will make the entire array sorted in increasing order.
    For example:
    Input:  { 1, 2, 3, 7, 5, 6, 4, 8 }
    Output: Sort the array from index 3 to 6

    Input:  { 1, 3, 2, 7, 5, 6, 4, 8 }
    Output: Sort the array from index 1 to 6*/



}
