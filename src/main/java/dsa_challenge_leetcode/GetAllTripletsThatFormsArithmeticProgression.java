package dsa_challenge_leetcode;

public class GetAllTripletsThatFormsArithmeticProgression {


    public static void main (String[] args)
    {

        /*int arr[] = { 2, 6, 9, 12, 17,
                22, 31, 32, 35, 42 };*/
        int a[] = { 5, 8, 9, 11, 12, 15 };
        int n = a.length;

        findAllTriplets(a, n);
    }



    static void findAllTriplets(int a[], int n)
    {

        for (int i = 1; i < n - 1; i++)
        {
            for (int j = i - 1, k = i + 1; j >= 0 && k < n;)
            {

                if (a[j] + a[k] == 2 * a[i])
                {
                    System.out.println(a[j] +" " +
                            a[i]+ " " + a[k]);
                    k++;
                    j--;
                }

                else if (a[j] + a[k] < 2 * a[i])
                    k++;
                else
                    j--;
            }
        }
    }

}