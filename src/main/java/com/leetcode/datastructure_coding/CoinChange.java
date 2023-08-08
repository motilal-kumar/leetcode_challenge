package com.leetcode.datastructure_coding;

import java.util.Arrays;

public class CoinChange {

    public static void main(String args[])
    {
        int a[] = { 1, 2, 3};
        int nums = a.length;
        int s = 4;
        System.out.println(getCoinChangeCount(a, nums, s));
    }

    static long getCoinChangeCount(int a[], int n, int s)
    {
        long[] t = new long[s + 1];
        Arrays.fill(t, 0);

        t[0] = 1;
        for (int i = 0; i < n; i++)
            for (int j = a[i]; j <= s; j++)
                t[j] += t[j - a[i]];

        return t[s];
    }


}
