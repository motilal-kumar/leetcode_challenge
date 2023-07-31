package dsa_challenge_leetcode;

public class ArrayDutchNationalFlagProb {

    public static void sortArray(int[] n) {

        int s = 0;
        int m = 0;
        int h = n.length - 1;

        while (m <= h) {

            switch (n[m]) {
                case 0: {
                    swapArray(n, s, m);
                    s++;
                    m++;
                    break;
                }
                case 1:
                    m++;
                    break;
                case 2: {
                    swapArray(n, m, h);
                    h--;
                    break;
                }
            }
        }

    }

    private static void swapArray(int[] n, int s, int e) {
        int tempArray = n[s];
        n[s] = n[e];
        n[e] = tempArray;
    }

    public static void main(String[] args){

       int[] n =  { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
        sortArray(n);
        for (int i = 0; i < n.length; i++) {
            System.out.print("Output : " +n[i] + " ");
        }


    }
}

    /*Sort an array of 0’s, 1’s, and 2’s (Dutch National Flag Problem)
        Given an array containing only 0’s, 1’s, and 2’s, sort it in linear time and using constant space.
        For Example:
        Input:  { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 }

        Output: { 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2 }
*/