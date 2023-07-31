package dsa_challenge_leetcode;

import java.util.Arrays;

public class FindMaximumProfitEarnedByBuyingSellingShares {

    static int getMaximumProfit(int p[], int n, int k) {

        int PROFIT[] = new int[k + 1];
        int PREV_DIFF[] = new int[k + 1];

        Arrays.fill(PREV_DIFF, Integer.MIN_VALUE);

        for (int j = 0; j < n; j++) {
            for (int i = 1; i <= k; i++) {

                PREV_DIFF[i] = Math.max(PREV_DIFF[i], PROFIT[i - 1] - p[j]);
                PROFIT[i] = Math.max(PROFIT[i], p[j] + PREV_DIFF[i]);

            }
        }

        return PROFIT[k];
    }


    public static void main(String[] args) {

        int k = 8;
        int price[] = {1, 5, 2, 3, 7, 6, 4, 5};

        /*int k = 6;
        int price[] =  {10, 8, 6, 5, 4, 2};*/


        int n = price.length;

        System.out.println("Maximum profit is: " + getMaximumProfit(price, n, k));

    }


   /* Find maximum profit earned by buying and selling shares any number of times
    Given a list containing future prediction of share prices, find the maximum profit earned by buying and selling shares any number of times with the constraint, a new transaction can only start after the previous transaction is complete, i.e., we can only hold at most one share at a time.
    For example:
    Stock Prices: {1, 5, 2, 3, 7, 6, 4, 5}

    Total profit earned is 10

    Buy on day 1 and sell on day 2
    Buy on day 3 and sell on day 5
    Buy on day 7 and sell on day 8


    Stock Prices: {10, 8, 6, 5, 4, 2}

    Total profit earned is 0*/



}
