package dsa_challenge_leetcode;

import java.util.Collections;

public class LargestNumberSumWithNdigits {


    public static void main(String[] args)
    {

        int N = 9, S = 2;
        int result =  getLargestNumberSumWithNdigits(N, S);
        System.out.println("result : {} : "+result);
    }


    public static int getLargestNumberSumWithNdigits(int S, int N)
    {

        if (S == 0) {
            return 0;
        }

        if (S > 9 * N) {
            return -1;
        }

        String data = "";
        for (int i = 0; i < N; i++) {

            if (S >= 9) {
                data += '9';
                S -= 9;
            }

            else {
                data += Integer.toString(S);
                S = 0;
            }
            if (S == 0 && i < N - 1) {
                data += String.join(
                        "",
                        Collections.nCopies(N - i - 1, "0"));
                break;
            }
        }
        return Integer.parseInt(data);
    }

}
