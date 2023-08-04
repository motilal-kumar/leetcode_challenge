package com.leetcode.datastructure_coding;

public class BinarySearch {


    public static void main(String args[])
    {

        int a[]= {3, 3, 1, 2, 3, 3};

        int number = a.length;
        int k = 3;
        int index = binarySearch(a, 0, number - 1, k);
        if (index != -1)
            System.out.println("Index: " + index);
        else
            System.out.println("Key Doesn't exists!");
    }


   public static int binarySearch(int a[], int length, int height, int k)
    {
        if (length > height)
            return -1;

        int middle = (length + height) / 2;
        if (a[middle] == k)     // k=key
            return middle;


        if (a[length] <= a[middle]) {

            if (k >= a[length] && k <= a[middle])
                return binarySearch(a, length, middle - 1, k);

            return binarySearch(a, middle + 1, height, k);
        }


        if (k >= a[middle] && k <= a[height])
            return binarySearch(a, middle + 1, height, k);

        return binarySearch(a, length, middle - 1, k);
    }















   /* Given an array of integers nums which is sorted in ascending order, and
    an integer target , write a function to search target in nums . If target
    exists, then return its index. Otherwise, return -1 .
    You must write an algorithm with 0(log n) runtime complexity.*/

}
