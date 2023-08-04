package dsa_challenge_leetcode;

public class SumOfElementsEachPairDivisibleByGivenPositiveInteger {

    public static void main(String[] args){

        int arr[] = { 3, 1, 2, 6, 9, 4 };
        int k = 5;

//        int arr[] = { 2, 9, 4, 1, 3, 5 };
//        int k = 6;


//        int   arr[] = { 3, 1, 2, 6, 9, 4 };
//        int k = 6;


        if(checkPositiveIntegerPair(arr, k)) {

            System.out.println("Pairs can be formed.");

        } else {

            System.out.println("Pairs can not be formed.");

        }

    }
    public static boolean checkPositiveIntegerPair(int[] arr, int k)
    {
        int x;

        if (arr.length % 2 != 0)
            return false;

        int occurance[] = new int[k];

        for (int i : arr) {

           x = i % k;

            if (occurance[(k - x) % k] != 0)
                occurance[(k - x) % k]--;
            else
                occurance[x]++;
        }
        for (int i : occurance) {
            if (i != 0)
                return false;
        }
        return true;
    }

}





   /* Given an integer array, determine whether it can be divided into pairs such that the sum of elements in each pair is divisible by a given positive integer k.
        For Example
        Input:
        arr[] = { 3, 1, 2, 6, 9, 4 }
        k = 5

        Output: Pairs can be formed*/
