package dsa_challenge_leetcode;

public class GetDistinctCombinationsPairOfArray {

    public static void main (String[] args) {

        int input[] = {1, 2, 3};
        //int input[] = {1, 2, 3,4};
       // int input[] = {1, 2, 1};
        int k = 2;
        int num = input.length;
        getComb(input, num, k);

    }


 public static void getDistinctCombinationsPairOfArray(int a[], int n, int k,
                                                       int ind, int d[], int i)
    {
        if (ind == k)
        {
            for (int j=0; j<k; j++)
                System.out.print(d[j]+" ");
            System.out.println("");
            return;
        }

        if (i >= n)
            return;

        d[ind] = a[i];

        getDistinctCombinationsPairOfArray(a, n, k, ind+1, d, i+1);


        getDistinctCombinationsPairOfArray(a, n, k, ind, d, i+1);

    }
   public static void getComb(int a[], int n, int r)
    {
        int d[]=new int[r];

        getDistinctCombinationsPairOfArray(a, n, r, 0, d, 0);
    }

}













   /* Given an integer array, find all distinct combinations of a given length k, where the repetition of elements is allowed.
        For example,
        Input:  {1, 2, 3}, k = 2
        Output: {1, 1}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {3, 3}*/
