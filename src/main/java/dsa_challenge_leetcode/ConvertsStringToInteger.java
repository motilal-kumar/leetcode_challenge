package dsa_challenge_leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertsStringToInteger {


    public static void main(String[] args){

        String str   = "42";
       // String str =  "4193 with words";

        int result  = getConvertsStringToInteger(str);

        System.out.println("result : {} : "+result);


        /////////////getConvertsStringToInteger1///////////
        int result1 =  getConvertsStringToInteger1(str);
        System.out.println("result1 : {} : "+result1);

    }

    public static int getConvertsStringToInteger(String str) {

        if (str == null)
            return 0;
        int num = str.length();

        if (num == 0)
            return 0;
        int i = 0;
        while (str.charAt(i) == ' ') {

            if (++i == num)
                return 0;
        }
        int sign = 1;
        if (str.charAt(i) == '-')
            sign = -1;
        if (str.charAt(i) == '-' || str.charAt(i) == '+') ++i;
        int data = 0, temp = Integer.MAX_VALUE / 10;

        for (; i < num; ++i) {

            if (str.charAt(i) < '0' || str.charAt(i) > '9')
                break;

            if (data > temp || (data == temp && str.charAt(i) > '7'))

                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            data = data * 10 + (str.charAt(i) - '0');

        }
        return sign * data;
    }



    /////getConvertsStringToInteger1. /////////
    public static int getConvertsStringToInteger1(String str) {

        while(str.startsWith(" ")){
            str = str.substring(1);
        }

        String strPattern = "^[+-]?[0-9]+";
        int result = 0;
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(str);

        if(matcher.find()){
            try{
                result = Integer.parseInt(matcher.group());
            }catch(Exception e){
                if(str.startsWith("-")){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }
        }
        return result;
    }

}
