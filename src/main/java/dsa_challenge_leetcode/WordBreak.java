package dsa_challenge_leetcode;

import java.io.IOException;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordBreak {


   /* Given a string s and a dictionary of words dict, determine if s can be segmented into
    a space-separated sequence of one or more dictionary words. For example, given s =
            "leetcode", dict = ["leet", "code"]. Return true because "leetcode" can be segmented as
"leet code".*/


    public static void main(String[] args) throws IOException {

        HashSet<String> dict = new HashSet<String>();
        dict.add("go");
        dict.add("goal");
        dict.add("goals");
        dict.add("special");
        StringBuilder sb = new StringBuilder();
        for(String s: dict){
            sb.append(s + "|");
        }
        String pattern = sb.toString().substring(0, sb.length()-1);
        pattern = "("+pattern+")*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher("goalspecial");
        if(m.matches()){
            System.out.println("match");
        }
    }

}

