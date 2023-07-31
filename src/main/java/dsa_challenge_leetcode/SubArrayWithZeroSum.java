package dsa_challenge_leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SubArrayWithZeroSum {


    public static void testSubArrayWithZeroSum(int[] n){

        for(int i =0; i<n.length; i++){

            int result = 0;

            for(int j=i+1; j<n.length; j++){

                result +=  n[j];

                if(result  == 0){

                    System.out.println("index i : " +i +" :  index j : " +j);

                }

            }

        }

    }

    public static void main(String[] args){
        //int[] n = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        int[] n =  { 4, 2, -3, -1, 0, 4 };
     //   testSubArrayWithZeroSum(arr);

        for(int i =0; i<n.length; i++){
            int result =  n[i];
            int k = 0;
            int[] n1 = new int[n.length];

            n1[k]  = n[i];

            for(int j=i+1; j<n.length; j++){

                result +=  n[j];
                k++;
                n1[k] = n[j];

                if(result  == 0){

                    IntStream stream = Arrays.stream(n1).filter(x -> x!=0);
                    System.out.println("stream : "+Arrays.toString(stream.toArray()));

                }
            }
        }
    }

   // Print all subarrays with 0 sum
    //Given an integer array, print all subarrays with zero-sum.
}
