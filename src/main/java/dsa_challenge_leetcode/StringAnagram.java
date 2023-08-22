package dsa_challenge_leetcode;

import java.util.HashMap;
import java.util.Set;

public class StringAnagram {

    public static void main(String[] args)
    {
        String str1 = "act";
        String str2 = "tac";

        if (isStringAnagram(str1, str2))
            System.out.print("Yes");
        else
            System.out.print("No");
    }


    public static boolean isStringAnagram(String str1, String str2)
    {

        //compare the length.
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {

            if (hashMap.containsKey(str1.charAt(i))) {

                hashMap.put(str1.charAt(i),
                        hashMap.get(str1.charAt(i)) + 1);
            }
            else {

                hashMap.put(str1.charAt(i), 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {

            if (hashMap.containsKey(str2.charAt(i))) {

                hashMap.put(str2.charAt(i),
                        hashMap.get(str2.charAt(i)) - 1);
            }
            else {
                return false;
            }
        }

        Set<Character> setKeys = hashMap.keySet();
        for (Character k : setKeys) {
            if (hashMap.get(k) != 0) {
                return false;
            }
        }
        return true;
    }
}










   /* Given two strings a and b consisting of lowercase characters. The task is to
        check whether two given strings are an anagram of each other or not. An anagram
        of a string is another string that contains the same characters, only the order
        of characters can be different. For example, act and tac are an anagram of each other.*/
