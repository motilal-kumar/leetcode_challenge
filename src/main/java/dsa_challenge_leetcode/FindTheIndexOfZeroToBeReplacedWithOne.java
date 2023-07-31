package dsa_challenge_leetcode;

public class FindTheIndexOfZeroToBeReplacedWithOne {
    public static int findTheIndexOfZeroToBeReplacedWithOne(int[] a, int x){

        int maximumCount = 0;
        int index=0;
        int prevZeroIndex = -1;
        int prevPrevZeroIndex = -1;


        for (int current=0; current<x; ++current)
        {

            if (a[current] == 0)
            {
                if (current - prevPrevZeroIndex > maximumCount)
                {
                    maximumCount = current - prevPrevZeroIndex;
                    index = prevZeroIndex;
                }

                prevPrevZeroIndex = prevZeroIndex;
                prevZeroIndex = current;
            }
        }

        if (x-prevPrevZeroIndex > maximumCount)
            index = prevZeroIndex;

        return index;

    }

    public static void main(String[] args){

        int a[] = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
        int number = a.length;
        System.out.println("Index"+
                findTheIndexOfZeroToBeReplacedWithOne(a, number));

    }

}
