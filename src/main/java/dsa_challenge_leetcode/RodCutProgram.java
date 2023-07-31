package dsa_challenge_leetcode;

public class RodCutProgram {

public static int findRodCutTest (int p[], int n){

    int m[][] = new int[n + 1][n + 1];

    for(int i=0; i<n; i++){

        for(int j=0; j<n; j++){


            if (i == 0 || j == 0) {
                m[i][j] = 0;
            }
            else {
                if (i == 1) {
                    m[i][j] = j * p[i - 1];
                }
                else {
                    if (i > j) {
                        m[i][j] = m[i - 1][j];
                    }
                    else {
                        m[i][j] = Math.max(
                                p[i - 1]
                                        + m[i][j - i],
                                m[i - 1][j]);
                    }
                }
            }
        }
        }

    return m[n][n];

    }

    public static void main(String[] args){

        int prices[]
                = new int[] { 1, 5, 8, 9, 10, 17, 17, 20 };
        int n = prices.length;

        System.out.println("Maximum obtained value is : " + findRodCutTest(prices, n));


    }

}


/* Given a rod of length n and a list of rod prices of length i, where 1 <= i <= n, find the optimal way to cut the rod into smaller rods to maximize profit.
        For example, consider the following rod lengths and values:
        Input:

        length[] = [1, 2, 3, 4, 5, 6, 7, 8]
        price[] = [1, 5, 8, 9, 10, 17, 17, 20]*/



