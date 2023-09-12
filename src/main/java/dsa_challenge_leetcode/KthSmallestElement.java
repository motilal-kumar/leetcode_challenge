package dsa_challenge_leetcode;

import java.util.Map;
import java.util.TreeMap;

public class KthSmallestElement {

    static int getKthSmallestElement(TreeMap<Integer, Integer> map, int K)
    {
        int occurance = 0;
        for (Map.Entry mapEntry : map.entrySet()) {

            occurance += (int)mapEntry.getValue();

            if (occurance >= K) {
                return (int)mapEntry.getKey();
            }
        }

        return -1;

    }

    public static void main(String[] args){

        int N = 6;
        int[] a = {7,10,4,3,20,15};
        int K = 3;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {

            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        int result = getKthSmallestElement(map, K);
        System.out.println(
                "The " + K + "3rd smallest element in the given  :: {} :" + result);
    }

    }









  /*  Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

        Note :-  l and r denotes the starting and ending index of the array.

        Example 1:

        Input:
        N = 6
        arr[] = 7 10 4 3 20 15
        K = 3
        Output : 7
        Explanation :
        3rd smallest element in the given
        array is 7.


*/