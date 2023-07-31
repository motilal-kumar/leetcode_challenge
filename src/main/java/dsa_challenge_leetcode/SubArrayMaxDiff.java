package dsa_challenge_leetcode;

public class SubArrayMaxDiff {

        int getMaxSubArrayDifference(int arr[], int n)
        {

            int d[] = new int[n - 1];
            for (int i = 0; i < n - 1; i++)
                d[i] = arr[i + 1] - arr[i];


            int maximum_difference = d[0];
            for (int i = 1; i < n - 1; i++)
            {
                if (d[i - 1] > 0)
                    d[i] += d[i - 1];
                if (maximum_difference < d[i])
                    maximum_difference = d[i];
            }
            return maximum_difference;
        }

        public static void main(String[] args)
        {
            SubArrayMaxDiff mxdif = new SubArrayMaxDiff();
            int arr[] = { 2, 7, 9, 5, 1, 3, 5 };
            int size = arr.length;
            System.out.println(mxdif.getMaxSubArrayDifference(arr, size));
        }
    }
