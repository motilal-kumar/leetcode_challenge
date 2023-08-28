package dsa_challenge_leetcode;

import java.util.Arrays;

public class MinimumDifferenceOfShortestTower {


    public static int getMinimumDifferenceOfShortestTower(int[] a, int nums, int k)
    {

        Arrays.sort(a);
        int result = a[nums - 1] - a[0];

        int min, max;
        min = a[0];
        max = a[nums - 1];

        for (int i = 1; i < nums; i++) {

            if (a[i] - k < 0)
                continue;

            min = Math.min(a[0] + k, a[i] - k);

            max = Math.max(a[i - 1] + k, a[nums - 1] - k);
            result = Math.min(result, max - min);
        }
        return result;
    }


    public static void main(String[] args)
    {
        int[] a = {1, 5, 8, 10};
        int k = 2;
        int ans = getMinimumDifferenceOfShortestTower(a, a.length, k);
        System.out.println(ans);
    }

}
