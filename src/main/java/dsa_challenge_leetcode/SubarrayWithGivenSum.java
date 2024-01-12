package dsa_challenge_leetcode;

import java.util.HashMap;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {
       // int[] array = {1, 4, 20, 3, 10, 5};
        int[] array=  {1, 4, 20, 3, 10, 5};
        int targetSum = 33;
      // int  array[] = {1, 4, 0, 0, 3, 10, 5};     //int targetSum =7;


        findSubarrayWithGivenSum(array, targetSum);
    }

    private static void findSubarrayWithGivenSum(int[] array, int targetSum) {
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];

            if (currentSum == targetSum) {
                System.out.println("Subarray found from index 0 to " + i);
                return;
            }

            if (sumIndexMap.containsKey(currentSum - targetSum)) {
                int startIndex = sumIndexMap.get(currentSum - targetSum) + 1;
                System.out.println("Subarray found from index " + startIndex + " to " + i);
                return;
            }

            sumIndexMap.put(currentSum, i);
        }
        System.out.println("No subarray found with the given sum");
    }


}
