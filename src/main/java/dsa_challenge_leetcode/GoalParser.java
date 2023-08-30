package dsa_challenge_leetcode;

public class GoalParser {


    public static void main(String[] args){

        String str = "G()(al)";
        String result = goalParser(str);
        System.out.println("result  {} : "+result);

    }

    public static String goalParser(String str) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch == 'G') {
                strBuilder.append(ch);
            } else if (ch == '(') {
                strBuilder.append(str.charAt(i + 1) == ')' ? "o" : "al");
            }
        }
        return strBuilder.toString();
    }

}
