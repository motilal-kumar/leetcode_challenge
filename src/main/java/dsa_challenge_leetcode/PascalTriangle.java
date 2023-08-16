package dsa_challenge_leetcode;

public class PascalTriangle {

    public static void main(String[] args)
    {
        int num = 3;
        getPascalTriangle(num);

    }
    public static void getPascalTriangle(int num)
    {
        for (int l = 1; l <= num; l++) {
            for (int j = 0; j <= num - l; j++) {

                System.out.print(" ");
            }

            int m = 1;
            for (int i = 1; i <= l; i++) {

                System.out.print(m + " ");
                m = m * (l - i) / i;
            }
            System.out.println();
        }
    }
}











   /* Given a non-negative integer n, print the first n rows of Pascal’s triangle.
        Each number in Pascal’s triangle is constructed by adding the two numbers diagonally above, where blank entries being interpreted as 0. For instance, the first eight rows of Pascal’s triangle are depicted in the diagram below.


        For Example:
        Input: n = 3
        Output: [[1], [1, 1], [1, 2, 1]]

         1
        1 1
       1 2 1

        */