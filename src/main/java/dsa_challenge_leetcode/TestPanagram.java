package dsa_challenge_leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestPanagram {


    public static void main(String[] args) {
       /* String str = "The quick brown fox jumps over the lazy dog";
       // String str = "leetcode";
        boolean isPangram = checkPangram(str);

        System.out.println(isPangram);*/

        /////////////////////////Linkedlist////////////////////////////////
       /* String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = testPangram(str);

        System.out.println(isPangram);*/

        ////////////////////////////Stream/////////////////////////////////////

        String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = testPangramUsingStream(str);

        System.out.println(isPangram);

    }

    public static boolean checkPangram(String str) {

        Map<Character, Integer> map = new HashMap<>();

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        return map.size() == 26;
    }


    /////////////////////////Linkedlist////////////////////////////////
    public static boolean testPangram(String str) {
        LinkedList<Character> list = new LinkedList<>();
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch) && !list.contains(ch)) {
                list.add(ch);
            }
        }
        return list.size() == 26;
    }





    /////////////////////////////////////Stream////////////////////////


    public static boolean testPangramUsingStream(String str) {

        str = str.toLowerCase();
        Set<Character> set = str.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        return set.size() == 26;
    }

}







/*
Check if the sentence is pangram.
        A pangram is a sentence where every letter of the English alphabet appears at least once.
        Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

        Example 1:

        Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
        Output: true
        Explanation: sentence contains at least one of every letter of the English alphabet.
        Example 2:

        Input: sentence = "leetcode"
        Output: false
*/
