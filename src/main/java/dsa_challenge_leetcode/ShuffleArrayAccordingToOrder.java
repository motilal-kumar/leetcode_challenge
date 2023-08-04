package dsa_challenge_leetcode;


import java.util.Arrays;

public class ShuffleArrayAccordingToOrder {

    public static void findShuffleArrayAccordingToOrder(int[] nums, int[] pos){

        int[] tempArray = new int[nums.length];

        for (int j = 0; j < nums.length; j++) {
            tempArray[pos[j]] = nums[j];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = tempArray[i];
        }

    }

    public static void main(String[] args){

        int[]  nums = { 1, 2, 3, 4, 5 };
        int[] pos = { 3, 2, 4, 1, 0 };

        findShuffleArrayAccordingToOrder(nums, pos);

        System.out.println(Arrays.toString(nums));

    }




  /*  Given an array of distinct integers, shuffle it according to the given order of elements.
    For example:
    Input:
    nums[] = { 1, 2, 3, 4, 5 }
    pos[] = { 3, 2, 4, 1, 0 }

    Output:

    nums[] = { 5, 4, 2, 1, 3 }

    i.e., if pos[i] = j, then update nums[j] = nums[i] for every index i.
    In other words, update nums[pos[i]] = nums[i] for every index i.*/



}

