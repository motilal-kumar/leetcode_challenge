package dsa_challenge_leetcode;

import java.util.*;

public class GetSubarrayHavingTheGivenSum {
    public static List<Integer>  getSubarrayHavingTheGivenSum(List<Integer> nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> SUB_ARRAY = new ArrayList<>();
        int CURRENT_SUM = 0;
        for (int i = 0; i < nums.size(); i++) {
            CURRENT_SUM += nums.get(i);
            if (map.containsKey(CURRENT_SUM - target)) {
                SUB_ARRAY = nums.subList(
                        map.get(CURRENT_SUM - target) + 1, i + 1);
                break;
            }
            map.put(CURRENT_SUM, i);
        }
        return SUB_ARRAY;
    }

    public static void main(String[] args){

        List<Integer> array
                = Arrays.asList(2, 6, 0, 9, 7, 3, 1, 4, 1, 10);
        int target = 15;
        List<Integer> SUB_ARRAY
                = getSubarrayHavingTheGivenSum(array, target);

        if (SUB_ARRAY.isEmpty()) {
            System.out.println(
                    "SubArray with the given sum  not found...");
        }
        else {
            System.out.print("SubArray: [ ");
            for (int i : SUB_ARRAY) {
                System.out.print(i + " ");
            }
            System.out.println("]");
        }

    }
}

    /*Find a subarray having the given sum in an integer array.
        For example:
        Input:  nums[] = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10}, target = 15
        Output: {6, 0, 9}

        Input:  nums[] = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10}, target = 15
        Output: {1, -4, 7, 6, 1, 4} or {4, 1, 10}

        Input:  nums[] = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10}, target = -3
        Output: {1, -4} or {-7, 1, -4, 7}*/