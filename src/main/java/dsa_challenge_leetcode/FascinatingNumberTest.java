package dsa_challenge_leetcode;

public class FascinatingNumberTest {

    public static void main(String args[])
    {
        int n = 2019;
        //int n = 853;

       // 192, 219, 273, 327, 1902, 1920, 2019

        if (n < 100)
            System.out.println("No");

        else
        {

            boolean result = isFascinatingNumberTest(n);
            if (result)
                System.out.println("Given Number is Fascinating");
            else
                System.out.println("Given Number is Not Fascinating");
        }
    }


    //Check the number is fascinating or not.
    public static boolean isFascinatingNumberTest(int n)
    {

        int[] occurance = new int[10];

        String result = "" + n + n * 2 +
                n * 3;

        for (int i = 0; i < result.length(); i++)
        {

            int d = result.charAt(i) - '0';


            if (occurance[d]>0 && d != 0)
                return false;
            else
                occurance[d]++;
        }

        for (int i = 1; i < occurance.length; i++)
        {
            if (occurance[i] == 0)
                return false;
        }
        return true;
    }



}





  /*  Given a number N. Your task is to check whether it is fascinating or not.
        Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3, and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.
        Example 1:

        Input:
        N = 192
        Output: Fascinating*/