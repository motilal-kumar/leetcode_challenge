package dsa_challenge_leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseOrderOfCharInString {


    public static void main(String[] args){

        String  s = "Let's take LeetCode contest";
        String  result  = reverseWords(s);
        System.out.println("result   : {} "+result);


        /////////////////////////////Stream////////////////////////////////
       /* String s1 = "Let's take LeetCode contest";
        String str = reverseWords1(s);

        System.out.println("str{}  "+str);*/
    }

    public static String reverseWords(String str) {

        int l = str.length();
        if(l == 1)
            return str;

        int f_ind, l_ind;
        char[] ch = str.toCharArray();
        char temp;

        for(int ind = 0 ; ind <l ; ind++){

            f_ind = ind;

            while(++ind < l && ch[ind] != ' ');
            l_ind = ind - 1;

            // reversing characters of the word
            while(f_ind < l_ind){
                temp = ch[f_ind];
                ch[f_ind++] = ch[l_ind];
                ch[l_ind--] = temp;
            }
        }

        return new String(ch);
    }


    //////////////////////////////////////Using steeam ///////////////////////.

    public static String reverseWords1(String str) {
        return Arrays.stream(str.split(" "))
                .map(ReverseOrderOfCharInString::reverseWord)
                .collect(Collectors.joining(" "));
    }

    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }


}
