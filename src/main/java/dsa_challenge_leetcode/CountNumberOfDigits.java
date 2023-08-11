package dsa_challenge_leetcode;

public class CountNumberOfDigits {

    public static void main(String args[])
        {
            int n = 12;
           // int n =  23;
            System.out.println(getCountNumberOfDigits(n));
        }

  public static int getCountNumberOfDigits(int number)
    {
        int res = number, counter = 0;
        while (res != 0) {
            int digits = res % 10;
            res /= 10;

            if (digits > 0 && number % digits == 0)
                counter++;
        }

        return counter;
    }
}








  /*  Given a number N. Count the number of digits in N which evenly divides N.

        Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
*/