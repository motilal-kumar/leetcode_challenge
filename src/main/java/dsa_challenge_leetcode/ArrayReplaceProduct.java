package dsa_challenge_leetcode;

import java.util.Arrays;

public class ArrayReplaceProduct {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
       // int arr[] =  { 5, 3, 4, 2, 6, 8 };

        int size = arr.length;
        int temp[] = new int[size];
        int result = 1;


        for (int i = 0; i < arr.length; i++) {
            int leftProduct = 1;
            int rightProduct = 1;
            int j = 0;
            if (j < i) {
                for (j = 0; j < i; j++) {
                    leftProduct *= arr[j];
                }
            }
            for (j = i + 1; j < arr.length; j++) {
                rightProduct *= arr[j];
            }
            result = leftProduct * rightProduct;
            temp[i] = result;
        }

        arr = temp;

        System.out.println("Output  :  "+ Arrays.toString(arr));

    }
}




// Replace every array element with the product of every other element
// Given an integer array, replace each element with the product of every other element without using the division operator.
