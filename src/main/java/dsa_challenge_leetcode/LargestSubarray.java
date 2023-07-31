package dsa_challenge_leetcode;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarray {

  public static void findSubArrayHavingEqualsNumberOfZerosAndOOnes(int[] A){

      Map<Integer,Integer>   map = new HashMap<>();
      map.put(0,-1);

      int l = 0;
      int end_index = -1;
      int s = 0;

      for(int i=0; i<A.length; i++) {

          s += (A[i] == 0) ? -1 : 1;

          if(map.containsKey(s)){

              if (l < i - map.get(s))
              {
                  l = i - map.get(s);
                  end_index = i;
              }

          } else {
              map.put(s,i);
          }
      }

      if (end_index != -1)
      {
          System.out.println("[" + (end_index - l + 1) + ", " +
                  end_index + "]");
      }
      else {
          System.out.println("SubArray Not Found");
      }
  }

  public static void main(String[] args){

      int[] input = { 0, 0, 1, 0, 1, 0, 0 };

      findSubArrayHavingEqualsNumberOfZerosAndOOnes(input);
  }

}


    /*Find the largest subarray having an equal number of 0’s and 1’s
        Given a binary array containing 0’s and 1’s, find the largest subarray with equal numbers of 0’s and 1’s.
        For Example:
        Input:  { 0, 0, 1, 0, 1, 0, 0 }

        Output: Largest subarray is { 0, 1, 0, 1 } or { 1, 0, 1, 0 }*/
