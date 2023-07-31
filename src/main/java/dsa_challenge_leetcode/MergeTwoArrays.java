package dsa_challenge_leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArrays {



    public static void mergeArray(int[] X, int[] Y){

        int m = X.length;
        int n = Y.length;
        int temp;
        int first;

        for(int i=0; i<n; i++){

            if(X[i]>Y[0]){
                 temp = X[i];
                X[i] = Y[0];
                Y[0] = temp;
                first = Y[0];

                int k;

                for (k = 1; k < n && Y[k] < first; k++) {

                    Y[k - 1] = Y[k];
                }
                Y[k - 1] = first;
            }

        }
    }



    public static void main(String[] args){

       int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
       int[]  Y = { 1, 8, 9, 10, 15 };
        mergeArray(X,Y);

        System.out.println("======X==="+Arrays.toString(X));
        System.out.println(Arrays.toString(Y));
    }
    /*Merge two arrays by satisfying given constraints
    Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells, merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.
    Input:

    X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
    Y[] = { 1, 8, 9, 10, 15 }*/
}
