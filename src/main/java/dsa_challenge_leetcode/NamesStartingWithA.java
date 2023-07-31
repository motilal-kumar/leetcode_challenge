package dsa_challenge_leetcode;

import java.util.function.Predicate;

public class NamesStartingWithA {

    //Declare names in an array and print names which are starting with 'A' using lambda expression?
    //String[] names = {"Anushka", "Anupma", "Deepika", "Kajol", "Sunny"};

    public static void main(String[] args) {
        String[] names = {"Anushka", "Anupma", "Deepika", "Kajol", "Sunny"};

        Predicate<String> p = name -> name.charAt(0) == 'A';
        for(String name : names){
            char c = name.charAt(0);
            if(p.test(name)){

                System.out.println("name : "+name.charAt(0));

            } else {

                System.out.println("Other : "+name.charAt(0));
            }

        }

    }
}
