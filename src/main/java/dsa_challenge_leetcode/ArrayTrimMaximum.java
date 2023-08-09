package dsa_challenge_leetcode;

public class ArrayTrimMaximum {

      public  static int getArrayTrimMaximumNumbers(int a[], int nums)
        {
            int max = 0, min, mxm;

            for (int i = 0; i < nums && nums - i > max; i++) {

                min = mxm = a[i];

                for (int j = i; j < nums; j++) {

                    min = FindMin(min, a[j]);
                    mxm = FindMax(mxm, a[j]);

                    if (2 * min <= mxm) {

                        break;
                    }

                    max = FindMax(max, j - i + 1);
                }
            }

            return nums - max;
        }

        public static void main(String args[]) {
            int input[] = {4, 6, 1, 7, 5, 9, 2 };
            int nums = input.length;

            int result = getArrayTrimMaximumNumbers(input, nums);

            System.out.println("The minimum number of removals is {} : " +result);
        }

    public static int FindMin(int first, int second) {
        if (first < second)
            return first;
        else
            return second;
    }
   public  static int FindMax(int first, int second) {
        if (first > second)
            return first;
        else
            return second;
    }

}





   /* public static int getArrayTrimMaximumNumbers (int[] arr, int n, int k){

        Arrays.sort(arr);
        int d = 0;
        int result = 0;

        for (int i = 0, j = 0; i < n; i++)
        {

            d = arr[i] - arr[j];
            while (i >= j && d > k) {
                d = arr[i] - arr[++j];

            }

            result = Math.max(result, i - j + 1);

        }

        return n - result;
    }


    public static void main(String[] args)
    {
        int input[]
                = new int[] { 4, 6, 1, 7, 5, 9, 2 };
        int n = input.length;
        int k = 3;

        System.out.print(getArrayTrimMaximumNumbers(input, n, k));

    }*/





   /* Given an integer array, trim it such that its maximum element becomes less than twice the minimum, return the minimum number of removals required for the conversion.
        For example,
        Input:  [4, 6, 1, 7, 5, 9, 2]
        Output: The minimum number of removals is 4*/