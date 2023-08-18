package dsa_challenge_leetcode;

public class SurpasserCount {

    public static void main (String[] args)
    {
        int a[] = {4, 6, 3, 9, 7, 10 };
        int n = a.length;

        System.out.println("Input :: {}  ");
        printArray(a, n);

        System.out.println("Surpasser Count of"
                + " array is ");
        getSurpasserCount(a, n);
    }


    static void getSurpasserCount(int a[], int nums)
    {
        for (int i = 0; i < nums; i++)
        {

            int c = 0;
            for (int j = i + 1; j < nums; j++)
                if (a[j] > a[i])
                    c++;

            System.out.print(c +" ");
        }
    }


  public  static void printArray(int a[], int nums)
    {
        for (int i = 0; i < nums; i++)
            System.out.print( a[i] + " ");

        System.out.println();
    }

}












  /*  Given an integer array having distinct elements, find the surpasser count for each element in it. In other words, for each array element, find the total number of elements to its right, which are greater than it.
        For example:
        Input:  { 4, 6, 3, 9, 7, 10 }

        Output: { 4, 3, 3, 1, 1, 0 }*/