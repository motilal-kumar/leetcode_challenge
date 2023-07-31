package dsa_challenge_leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringSpecialChar {
        public static void main(String[] args) {
            String msg = "I@Love#India";
            String reversedString = reverseStringByWord(msg);
            System.out.println(reversedString);
        }

        public static String reverseStringByWord(String str) {
            String[] words = str.split("\\s");
            return Arrays.stream(words)
                    .map(ReverseStringSpecialChar::reverseWord)
                    .collect(Collectors.joining(" "));
        }

        public static String reverseWord(String word) {
            StringBuilder reversedWord = new StringBuilder();
            StringBuilder specialChars = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (isSpecialChar(c)) {
                    specialChars.append(c);
                } else {
                    reversedWord.append(c);
                }
            }

            return reversedWord.reverse().append(specialChars).toString();
        }

        public static boolean isSpecialChar(char c) {
            return c == '@' || c == '#';
        }
    }
