package dsa_challenge_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetNegativeNumberFollowedByPositive {

    public static void main(String[] args)
    {
        int a[] = {9, -3, 5, -2, -8, -6, 1, 3};

        getNegativeNumberFollowedByPositive(a);

        for (int i : a) {
            System.out.print(i + " ");
        }

        //////////////////////////JAVA*/////////////////////////////////
       /* int a1[] = {9, -3, 5, -2, -8, -6, 1, 3};
        List<Integer> list = getNegativeNumberFollowedByPositive_JAVA8(a1);
        list.forEach(System.out::println);*/

    }

    public static void getNegativeNumberFollowedByPositive(int[] a)
    {
        int i = 0, j = 0;
        while (j < a.length) {
            if (a[j] >= 0) {
                j++;
            }
            else {
                for (int k = j; k > i; k--) {
                    int temp = a[k];
                    a[k] = a[k - 1];
                    a[k - 1] = temp;
                }
                i++;
                j++;
            }
        }
    }



    /*************************************JAVA8************************************************/

 /*   public static List<Integer> getNegativeNumberFollowedByPositive_JAVA8(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .collect(ArrayList::new, (l, n) -> {
                    if (n < 0) {
                        l.add(0, n);
                    } else {
                        l.add(n);
                    }
                }, ArrayList::addAll);
    }*/


}
