package dsa_challenge_leetcode;



/*Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that:
        Only one letter can be changed at a time Each intermediate word must exist in the
        dictionary For example,
        Given:
        start = "hit"
        end = "cog"
        dict = ["hot","dot","dog","lot","log"]
        As one shortest transformation is "hit" ->"hot" ->"dot" ->"dog" ->"cog", the program
        should return its length 5.
        Note: Return 0 if there is no such transformation sequence. All words have the same
        length. All words contain only lowercase alphabetic characters.
        This problem is a classic problem that has been asked frequently during interviews.*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WordLadder {


    public static void main(String[] args){
        System.out.println("Hello world      kknkjhjglhj");
      //  System.out.print("======rotate"+ Arrays.toString(numsssjs));


        String   start = "hit";
        String end = "cog";

        //Set<String> set = new HashSet<>(Arrays.asList(array));
       // HashSet<String>   dict = ["hot","dot","dog","lot","log"];


     //   ladderLength(String start, String end, HashSet<String> dict)


    }

    public int ladderLength(String start, String end, HashSet<String> dict) {
        if (dict.size() == 0)
            return 0;
        dict.add(end);
        LinkedList<String> wordQueue = new LinkedList<String>();
        LinkedList<Integer> distanceQueue = new LinkedList<Integer>();
        wordQueue.add(start);
        distanceQueue.add(1);
//track the shortest path
        int result = Integer.MAX_VALUE;
        while (!wordQueue.isEmpty()) {
            String currWord = wordQueue.pop();
            Integer currDistance = distanceQueue.pop();
            if (currWord.equals(end)) {
                result = Math.min(result, currDistance);
            }
            for (int i = 0; i < currWord.length(); i++) {
                char[] currCharArr = currWord.toCharArray();
                for(char c = 'a' ; c<= 'z'; c++) {
                    currCharArr[i] = c;
                    String newWord = new String(currCharArr);
                    if (dict.contains(newWord)) {
                        wordQueue.add(newWord);
                        distanceQueue.add(currDistance + 1);
                        dict.remove(newWord);
                    }
                }
            }
        }
        if (result < Integer.MAX_VALUE)
            return result;
        else
            return 0;
    }

}
