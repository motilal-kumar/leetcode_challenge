package dsa_challenge_leetcode;

public class CombinationsOfPositiveIntegers {


    public static void main (String[] args)
    {
        int number = 3;
        getAllCombinations(number);
    }

    static void getAllCombinations(int number)
    {
        int a[] = new int [number];
        getCombinationsOfPositiveIntegers(a, 0, number, number);
    }

    public  static void getCombinationsOfPositiveIntegers(int a[], int ind,
                                     int number, int lessNumber)
    {
        if (lessNumber < 0)
            return;

        if (lessNumber == 0)
        {
            for (int i = 0; i < ind; i++)
                System.out.print (a[i] + " ");
            System.out.println();
            return;
        }

        int p = (ind == 0) ?
                1 : a[ind - 1];

        for (int k = p; k <= number ; k++)
        {
            a[ind] = k;

            getCombinationsOfPositiveIntegers(a, ind + 1, number,
                    lessNumber - k);
        }
    }











    /*Write code to print all combinations of positive integers in increasing order that sum to a given positive number.
    For Example:
    Input:  N = 3

            1 1 1
            1 2
            3*/


}
