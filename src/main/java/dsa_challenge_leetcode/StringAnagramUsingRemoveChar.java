package dsa_challenge_leetcode;

import java.util.HashMap;
import java.util.Map;

public class StringAnagramUsingRemoveChar {

    public static void main(String[] args) {
        String s1 = "bcadeh";
        String s2 = "hea";
       // int  value = getStringAnagramUsingRemoveChar(s1, s2);
        int  value = getStringAnagramUsingRemoveChar_Java8(s1, s2);
        System.out.println("value : {} :  " +value);
    }

    public static int getStringAnagramUsingRemoveChar(String s1, String s2) {


        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        int c = 0;
        for (int res : map.values()) {
            c += Math.abs(res);
        }
        return c;
    }




   /****************************************Java8 ****************************************/

   public static int getStringAnagramUsingRemoveChar_Java8(String s1, String s2) {

       Map<Character, Integer> map = new HashMap<>();

       s1.chars()
               .mapToObj(c -> (char) c)
               .forEach(c -> map.put(c, map.getOrDefault(c, 0) + 1));

       s2.chars()
               .mapToObj(c -> (char) c)
               .forEach(c -> map.put(c, map.getOrDefault(c, 0) - 1));

       return map.values().stream()
               .mapToInt(Math::abs)
               .sum();
   }
}





  /*  Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find the minimum number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.

        Example 1:

        Input:
        S1 = bcadeh
        S2 = hea
        Output: 3
        Explanation: We need to remove b, c
        and d from S1.*/