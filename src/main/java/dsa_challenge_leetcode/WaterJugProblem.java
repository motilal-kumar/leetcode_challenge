package dsa_challenge_leetcode;

import java.util.Arrays;
import java.util.Random;

public class WaterJugProblem {


    public static void main(String[] args)
    {
        int[] red = {6, 3, 2, 8, 7};
        int[] blue = {8, 6, 7, 2, 3};

        getMatchingPairs(red, blue, 0, red.length - 1);

        System.out.println("Red jugs  : " + Arrays.toString(red));
        System.out.println("Blue jugs  : " + Arrays.toString(blue));
    }


        private static void getMatchingPairs(int[] red, int[] blue, int l, int h)
    {

        if (l >= h) {
            return;
        }

        int r = new Random().nextInt(h - l + 1) + l;
        int jug = red[r];


        int pivot = partition(red, l, h, jug);

        partition(blue, l, h, jug);
        getMatchingPairs(red, blue, l, pivot - 1);
        getMatchingPairs(red, blue, pivot + 1, h);
    }



    private static int partition(int[] A, int l, int h, int pivot)
    {
        int pivotInd = l;
        for (int j = l; j < h; j++)
        {
            if (A[j] < pivot)
            {
                swap(A, pivotInd, j);
                pivotInd++;
            }
            else if (A[j] == pivot)
            {
                swap(A, j, h);
                j--;
            }
        }
        swap(A, pivotInd, h);
        return pivotInd;
    }
    public static void swap(int[] X, int i, int j)
    {
        int temp = X[i];
        X[i] = X[j];
        X[j] = temp;
    }

}





   /* Suppose we are given n red and n blue water jugs, all of different shapes and sizes. All red jugs hold different amounts of water, as do the blue ones. Moreover, there is a blue jug for every red jug that holds the same amount of water and vice versa. The task is to efficiently group the jugs into pairs of red and blue jugs that hold the same amount of water.
        Example:
        Input:
        red = {6, 3, 2, 8, 7};
        blue = {8, 6, 7, 2, 3};

        Output:

        Red jugs: [2, 3, 6, 7, 8]
        Blue jugs: [2, 3, 6, 7, 8]
*/