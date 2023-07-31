package dsa_challenge_leetcode;

public class CheckPalindrome {
    public static void checkPalindrome (String check) {
        int length = check.length();

        for(int i = 0; i< length/2; i++) {
            if(check.charAt(i) != check.charAt(length-i-1)) {
                System.out.println("Not Palindrome");
                break;
            }

            if(i == length/2-1) {
                System.out.println("Palindrome");
            }
        }
    }

    public static void main(String args[]) {
        CheckPalindrome.checkPalindrome ("rar");
    }
}
