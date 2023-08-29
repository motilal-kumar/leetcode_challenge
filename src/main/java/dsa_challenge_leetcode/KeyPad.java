package dsa_challenge_leetcode;

import java.util.*;

public class KeyPad {

    public static void main(String[] args)
    {
        int n[] = { 2, 3, 4 };

        getWords(n);


        /////////////////////////////////////
        int[] n1 = { 2, 3, 4 };
        List<String> list = getKeypadWords(n1);
        for (String w : list) {
            System.out.println(w);
        }
    }



    static Character[][] NUMBER_CHAR;

    private static void getNum_Char()
    {
        NUMBER_CHAR = new Character[10][5];
        NUMBER_CHAR[0] = new Character[] { '\0' };
        NUMBER_CHAR[1] = new Character[] { '\0' };
        NUMBER_CHAR[2]
                = new Character[] { 'A', 'B', 'C' };
        NUMBER_CHAR[3]
                = new Character[] { 'D', 'E', 'F' };
        NUMBER_CHAR[4]
                = new Character[] { 'G', 'H', 'I' };
        NUMBER_CHAR[5]
                = new Character[] { 'J', 'K', 'L' };
        NUMBER_CHAR[6]
                = new Character[] { 'M', 'N', 'O' };
        NUMBER_CHAR[7]
                = new Character[] { 'P', 'Q', 'R', 'S' };
        NUMBER_CHAR[8]
                = new Character[] { 'T', 'U', 'V' };
        NUMBER_CHAR[9]
                = new Character[] { 'W', 'X', 'Y', 'Z' };
    }

    private static List<String> getWords(int[] n,
                                           int l,
                                           int ind,
                                           String str)
    {
        if (l == ind) {
            return new ArrayList<>(
                    Collections.singleton(str));
        }

        List<String> list = new ArrayList<>();

        for (int i = 0;
             i < NUMBER_CHAR[n[ind]].length;
             i++) {
            String str_copy
                    = String.copyValueOf(str.toCharArray());
            str_copy = str_copy.concat(
                    NUMBER_CHAR[n[ind]][i]
                            .toString());
            list.addAll(getWords(
                    n, l, ind + 1, str_copy));
        }
        return list;
    }
    private static void getWords(int[] n)
    {
        getNum_Char();
        List<String> str
                = getWords(n, n.length, 0, "");
        str.stream().forEach(System.out::println);
    }


    /************************************JAVA8***********************************************/
    public static List<String> getKeypadWords(int[] input) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "ABC");
        map.put(3, "DEF");
        map.put(4, "GHI");
        map.put(5, "JKL");
        map.put(6, "MNO");
        map.put(7, "PQRS");
        map.put(8, "TUV");
        map.put(9, "WXYZ");

        List<String> list = new ArrayList<>();
        getWords(input, 0, "", list, map);
        return list;
    }

    public static void getWords(int[] n, int ind, String str, List<String> strList, Map<Integer, String> map) {
        if (ind == n.length) {
            strList.add(str);
            return;
        }

        int digit = n[ind];
        String s = map.get(digit);

        for (char c : s.toCharArray()) {
            getWords(n, ind + 1, str + c, strList, map);
        }
    }

}
