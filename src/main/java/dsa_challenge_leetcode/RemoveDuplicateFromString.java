package dsa_challenge_leetcode;
import java.util.*;
public class RemoveDuplicateFromString {
    static void removeDuplicateCharactersFromString ( char s[], int l)
        {
            int ind = 0;
            for (int i = 0; i < l; i++) {
                int j;
                for (j = 0; j < i; j++) {
                    if (s[i] == s[j]) {
                        break;
                    }
                }
                if (j == i) {
                    s[ind++] = s[i];
                }
            }
            System.out.println(String.valueOf(Arrays.copyOf(s, ind)));
        }
        public static void main(String[] args)
        {
            String str = "Java language";
            char s[] = str.toCharArray();
            int l = s.length;
            System.out.println("length : "+l);
            removeDuplicateCharactersFromString(s, l);


            //Using Java8.
           /* Map<Character, Long>  result = str
                    .chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
            result.forEach(
                    (k,v) ->{
                        if(v>1){
                            System.out.println(k + " : " +v);
                        }
                    }
            );*/

            //Without java 8.

          /*  Map<Character, Integer>  map = new HashMap<>();
            char[]  charArray = str.toCharArray();
            for(char c : charArray){
                if(map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                } else {
                    map.put(c,1);
                }
            }
            for(Map.Entry<Character, Integer>  entry : map.entrySet()){
                if(entry.getValue()>1){
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            }*/

        }

    }

