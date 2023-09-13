package dsa_challenge_leetcode;

public class CountOfSetBits {


    public static void main(String[] args)
    {
        int N = 6;

       int result  = getCountOfSetBits(N);
        System.out.println("result : {} : "+ N +" is : "+result);

        //Use Java8 Stream api
        int X = 6;
        long resultJava8 = Integer.toBinaryString(N)
                .chars()
                .filter(c -> c == '1')
                .count();

        System.out.println(" resultJava8 :" + N + " is: " + resultJava8);

    }

    static int getCountOfSetBits(int N)
    {
        int result = 0;
        int largestPower = findLargestPower(N);
        int value, temp;

        for (int i = largestPower; i >= 0; i--) {
            value = (int)Math.pow(2, i);
            temp = value & N;

            if (temp > 0) {
                result++;
            }
        }
        return result;
    }

  public   static int findLargestPower(int x)
    {
        int a = 0;
        int i = 0;
        int res = (int)Math.pow(2, i);

        while (res <= x) {
            a = i;
            i++;
            res = (int)Math.pow(2, i);
        }
        return a;
    }

}



  /*  Given a positive integer N, print count of set bits in it.

        Input:
        N = 6
        Output:
        2
        Explanation:
        Binary representation is '110'
        So the count of the set bit is 2.*/