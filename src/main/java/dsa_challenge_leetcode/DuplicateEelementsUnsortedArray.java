package dsa_challenge_leetcode;

import java.util.HashMap;

public class DuplicateEelementsUnsortedArray {


    public static void main (String[] args)
    {
       // int input[] = { 1, 2, 3, 1, 2, 1 };
        int input[] =  { 5, 4, 5, 5, 3, 1, 2, 2, 4 };
        duplicateEelementsUnsortedArray(input);
    }


   public  static void duplicateEelementsUnsortedArray(int a[]) {


        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i=0; i<a.length; i++)
        {
            Integer PREVIOUS_COUNT = hashMap.get(a[i]);
            if (PREVIOUS_COUNT == null)
                PREVIOUS_COUNT = 0;

            hashMap.put(a[i], PREVIOUS_COUNT + 1);
        }


        for (int i=0; i<a.length; i++)
        {

            Integer NUMBER_COUNT =  hashMap.get(a[i]);
            if (NUMBER_COUNT != null)
            {
                for (int j=0; j<NUMBER_COUNT; j++)
                    System.out.print(a[i] + " ");
                hashMap.remove(a[i]);
            }
        }
    }



/*
    Given an unsorted integer array containing many duplicate elements, rearrange it such that the same element appears together and the relative order of the first occurrence of each element remains unchanged.
    For example:
    Input:  { 1, 2, 3, 1, 2, 1 }
    Output: { 1, 1, 1, 2, 2, 3 }


    Input:  { 5, 4, 5, 5, 3, 1, 2, 2, 4 }
    Output: { 5, 5, 5, 4, 4, 3, 1, 2, 2 }
*/


}
