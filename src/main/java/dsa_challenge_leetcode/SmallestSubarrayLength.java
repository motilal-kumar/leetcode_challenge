package dsa_challenge_leetcode;


public class SmallestSubarrayLength {
    public static int getSmallestSubarrayLength(int[] nums, int k)
    {
        int sum = 0;

        int length = Integer.MAX_VALUE;
        int l = 0;

        for (int r = 0; r < nums.length; r++)
        {
            sum += nums[r];

            while (sum > k && l <= r)
            {
                length = Integer.min(length, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }

        if (length == Integer.MAX_VALUE) {
            return 0;
        }

        return length;
    }

    public static void main(String[] args){

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 20;

        int length = getSmallestSubarrayLength(input, k);

        if (length != Integer.MAX_VALUE) {
            System.out.print("The smallest Sub array length is " + length);
        }
        else {
            System.out.print("Sub array doesn't exists");
        }

    }
}

/*

    Given an array of positive integers, find the smallest subarray’s length whose sum of elements is greater than a given number K.
        For Example:
        Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 20
        Output: The smallest subarray length is 3
        Explanation: The smallest subarray with sum > 20 is {6, 7, 8}*/
