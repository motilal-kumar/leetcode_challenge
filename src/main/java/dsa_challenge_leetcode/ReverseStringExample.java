package dsa_challenge_leetcode;

public class ReverseStringExample {
    public void reverseString(String str){
     if(str == null || str.length() <= 1) {
     System.out.println(str);
  } else {
         System.out.println(str.charAt((str).length()-1));
         reverseString(str.substring(0,str.length()-1));
     }
    }
    public static void main(String[] args){
        String str = "India";
        ReverseStringExample reverseStringExample = new ReverseStringExample();
        reverseStringExample.reverseString(str);
    }
}
