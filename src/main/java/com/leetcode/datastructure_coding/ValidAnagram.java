package com.leetcode.datastructure_coding;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {



    public static void main(String[] args)
    {
        String X = "listen";
        String Y = "silent";

        if (isAnagram(X, Y)) {
            System.out.print("Given String is an Anagram.");
        }
        else {
            System.out.print("Given String is Not an Anagram.");
        }
    }

    public static boolean isAnagram(String S, String T)
    {

        if (S.length() != T.length()) {
            return false;
        }


        Map<Character, Integer> FREQUENCY_S = new HashMap<>();

        for (char ch: S.toCharArray()) {

            FREQUENCY_S.put(ch, FREQUENCY_S.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> FREQUENCY_T = new HashMap<>();

        for (char ch: T.toCharArray()) {

            FREQUENCY_T.put(ch, FREQUENCY_T.getOrDefault(ch, 0) + 1);
        }

        return FREQUENCY_S.equals(FREQUENCY_T);
    }


   /* Given two strings s and t , return true if t is an anagram of s , and
false otherwise.

    An Anagram is a word or phrase formed by rearranging the letters of a
    different word or phrase, typically using all the original letters exactly once.*/
}
