package dsa_challenge_leetcode;

import java.util.Arrays;

public class SupplyOfCoinsChangeOfGivenDenominations {


    static long totalNumberOfCountWays(int s[], int n, int target)
    {

        long[] table = new long[target + 1];

        Arrays.fill(table, 0);

        table[0] = 1;

        for (int i = 0; i < n; i++)
            for (int j = s[i]; j <= target; j++)
                table[j] += table[j - s[i]];

        return table[target];
    }


    public static void main(String args[])
    {

      /*  int s[] = { 1, 3, 5, 7 };
        int n = s.length;
        int target = 8;*/

        int s[] =  { 1, 2, 3 };
        int n = s.length;
        int target = 4;
        System.out.println(totalNumberOfCountWays(s, n, target));
    }
}
