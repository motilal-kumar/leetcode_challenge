package dsa_challenge_leetcode;

public class FindMergeSort {


    public static void main(String args[])
    {
        int a[] = { 10, 12, 13, 7, 8, 9 };

        System.out.println("Given Array");
        printArray(a);

        FindMergeSort ob = new FindMergeSort();
        ob.findSort(a, 0, a.length - 1);

        System.out.println("\nSorted array");
        printArray(a);
    }


  public  void findMergeSort(int a[], int lt, int mid, int rt)
    {

        int nums1 = mid - lt + 1;
        int nums2 = rt - mid;

        int left[] = new int[nums1];
        int right[] = new int[nums2];


        for (int i = 0; i < nums1; ++i)
            left[i] = a[lt + i];
        for (int j = 0; j < nums2; ++j)
            right[j] = a[mid + 1 + j];


        int i = 0, j = 0;

        int x = lt;
        while (i < nums1 && j < nums2) {
            if (left[i] <= right[j]) {
                a[x] = left[i];
                i++;
            }
            else {
                a[x] = right[j];
                j++;
            }
            x++;
        }

        while (i < nums1) {
            a[x] = left[i];
            i++;
            x++;
        }

        while (j < nums2) {
            a[x] = right[j];
            j++;
            x++;
        }
    }


    void findSort(int a[], int lt, int rt)
    {
        if (lt < rt) {

            int mid = (lt + rt) / 2;

            findSort(a, lt, mid);
            findSort(a, mid + 1, rt);

            findMergeSort(a, lt, mid, rt);
        }
    }

   public  static void printArray(int a[])
    {
        int nums = a.length;
        for (int i = 0; i < nums; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}



///Given an integer array, sort it using the merge sort algorithm.