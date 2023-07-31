package dsa_challenge_leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumNumberOfGifts {

    public static int maxNumberOfGiftsArray(List<int[]> gifts) {
        //Sorting each gift according to the number of days
        Collections.sort(gifts, (a, b) -> Integer.compare(a[0], b[0]));


        int leftMoneyInLast = 0;
        int maximumNumberOfGifts = 0;

        for (int[] g : gifts) {
            int d = g[0];
            int p = g[1];

            // Not enough money to buy the gift
            if (leftMoneyInLast < p) {
                break;
            }

            leftMoneyInLast -= p;
            maximumNumberOfGifts++;
        }

        return maximumNumberOfGifts;
    }

    public static void main(String[] args) {
        List<int[]> gifts = new ArrayList<>();
        gifts.add(new int[]{1, 3});
        gifts.add(new int[]{2, 3});
        gifts.add(new int[]{3, 2});
        gifts.add(new int[]{4, 1});
        gifts.add(new int[]{5, 3});

        int result = maxNumberOfGiftsArray(gifts);
        System.out.println(result);
    }
}
