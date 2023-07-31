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
