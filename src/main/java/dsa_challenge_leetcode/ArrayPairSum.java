package dsa_challenge_leetcode;

import java.util.HashSet;
import java.util.stream.IntStream;

public class ArrayPairSum {

    public static void main(String[] args)
    {
        int[] a = {1, 4, 45, 6, 10, 8};
        int n = 16;
        getArrayPairSum(a, n);




        ////java8.

        int[] arr = {1, 4, 45, 6, 10, 8};
        int X = 16;

        boolean data = getArrayPairSumJava8(arr, X);

        if (data) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void getArrayPairSum(int a[], int sum)
    {
        HashSet<Integer> map = new HashSet<Integer>();
        for (int i = 0; i < a.length; ++i) {
            int result = sum - a[i];

            if (map.contains(result)) {
                System.out.println("Yes");
                return;
            }
            map.add(a[i]);
        }
        System.out.println("No");
    }



    /////Java8 Stream api.

    public static boolean getArrayPairSumJava8(int[] a, int X) {
        HashSet<Integer> set = new HashSet<>();

        return IntStream.of(a)
                .anyMatch(n -> {
                    int result = X - n;
                    if (set.contains(result)) {
                        return true;
                    }
                    set.add(n);
                    return false;
                });
    }

}




   /* Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

        Example 1:

        Input:
        N = 6, X = 16
        Arr[] = {1, 4, 45, 6, 10, 8}
        Output: Yes
        Explanation: Arr[3] + Arr[4] = 6 + 10 = 16*/