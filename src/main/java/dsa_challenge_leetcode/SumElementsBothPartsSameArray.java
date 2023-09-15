package dsa_challenge_leetcode;

public class SumElementsBothPartsSameArray {


    public static void main(String[] args)
    {
        int[] arr = {1, 5, 11, 5};
        int n = 4;
         boolean  isPartition = getSumElementsBothPartsSameArray(arr, n);

    /*  int[]  arr1 = {1, 3, 5};
        int n1 = 3;
        boolean  isPartition = getSumElementsBothPartsSameArray(arr1, n1);*/

        if (isPartition)
            System.out.println("Yes");
        else
            System.out.println("No");
    }



    public static boolean getSumElementsBothPartsSameArray(int a[], int n)
    {
        int res = 0;
        int i, j;
        for (i = 0; i < n; i++)
            res += a[i];

        if (res % 2 != 0)
            return false;

        boolean[] p = new boolean[res / 2 + 1];

        for (i = 0; i <= res / 2; i++) {
            p[i] = false;
        }

        for (i = 0; i < n; i++) {

            for (j = res / 2; j >= a[i]; j--) {

              //  if (p[j - a[i]] == true || j == a[i])

                if (p[j - a[i]] || j == a[i])
                    p[j] = true;

            }
        }
        return p[res / 2];
    }
}




   /* Given an array arr[] of size N, check if it can be partitioned into two parts such that the sum of elements in both parts is the same.

        Example 1:

        Input: N = 4
        arr = {1, 5, 11, 5}
        Output: YES
        Explanation:
        The two parts are {1, 5, 5} and {11}.
*/