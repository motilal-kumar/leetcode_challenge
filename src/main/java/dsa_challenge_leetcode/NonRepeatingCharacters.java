package dsa_challenge_leetcode;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class NonRepeatingCharacters {
    public static Character test(String str){
        Map<Character, Integer> map  =   new LinkedHashMap<>();
        for(Character  ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map .put(ch,map.containsKey(ch) ? map.get(ch)+1 :1);

            } else{
                map.put(ch,1);
            }
        }

       List<Character> charList = map.entrySet().stream().filter(c-> c.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toCollection(LinkedList::new));
        return charList.get(charList.size() - 1);
    }
    public static void main(String[] args){
        String input = "hi there";
        char ch = test(input);
        System.out.println(ch);


       /* Map<Character, Long> collect =  "abcsdnvs".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
       // collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));

        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if(firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
        Optional<Character> firstRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
*/

    }
}
