package dsa_challenge_leetcode;

import java.util.Arrays;

public class RotateArray {


    public static void main(String[] args){
        System.out.println("Hello world      kknkjhjglhj");

        int[] nums = {1, 2, 3, 4, 5};

        int k = 3;

        int[] numsssjs  = rotate(nums, k);
       System.out.print("======rotate"+Arrays.toString(numsssjs));

    }

    //Rotate Array in Java.

     /*Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
    How many different ways do you know to solve this problem?*/

    public static int[] rotate(int[] nums, int k) {
        if(k > nums.length)
            k=k%nums.length;
        int[] result = new int[nums.length];
        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }
        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy( result, 0, nums, 0, nums.length );
        return result;
    }

}


/*
import java.util.HashMap;

class Main
{
    // A hashing based method to group all occurrences of individual elements
    static void orderedGroup(int arr[])
    {
        // Creates an empty hashmap
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        // Traverse the array elements, and store count for every element
        // in HashMap
        for (int i=0; i<arr.length; i++)
        {
            // Check if element is already in HashMap
            Integer prevCount = hM.get(arr[i]);
            if (prevCount == null)
                prevCount = 0;

            // Increment count of element element in HashMap
            hM.put(arr[i], prevCount + 1);
        }

        // Traverse array again
        for (int i=0; i<arr.length; i++)
        {
            // Check if this is first occurrence
            Integer count =  hM.get(arr[i]);
            if (count != null)
            {
                // If yes, then print the element 'count' times
                for (int j=0; j<count; j++)
                    System.out.print(arr[i] + " ");

                // And remove the element from HashMap.
                hM.remove(arr[i]);
            }
        }
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        int arr[] = {10, 5, 3, 10, 10, 4, 1, 3};
        orderedGroup(arr);
    }
}
*/
