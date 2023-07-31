package dsa_challenge_leetcode;

import java.util.LinkedHashSet;

public class ArrayRemoveDuplicateElement {


    //Remove duplicate from list using set.
    public static void removeDuplicates(int[] arr)
    {
        LinkedHashSet<Integer> set
                = new LinkedHashSet<Integer>();

        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);
        System.out.print(set);
    }

    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
        removeDuplicates(arr);
    }
}
