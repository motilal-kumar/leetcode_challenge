package dsa_challenge_leetcode;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Map.Entry;

public class FindMajorityElementArray {

   public static int  majorityElementArrayTest(int[] A){

       Map<Integer, Integer>   map  = new HashMap<>();

       for(int i=0; i<A.length; i++){

           if(map.get(A[i]) == null){
               map.put(A[i], 0);

           }

           map.put(A[i], map.get(A[i] + 1));

       }

       //count is more than n/2.
       Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();

       while (iterator.hasNext())
       {
           Map.Entry<Integer, Integer> pair = iterator.next();
           if (pair.getValue() > A.length/2)
               return pair.getKey();
           iterator.remove();
       }
       return -1;


    }



    public static void main(String[] args) {

       /* int[] A = {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
        int output = majorityElementArrayTest(A);

        if (output != -1) {
            System.out.println("outputoutputoutput: " + output);

        } else {
            System.out.println("Does Exists!!: ");
        }*/

       /* List<Integer> integerArray = Arrays.asList(2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2);

        Map.Entry<Integer, Integer> entry = integerArray.parallelStream()
                .collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.summingInt(count -> BigInteger.ONE.intValue())))
                .entrySet()
                .parallelStream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .findFirst()
                .get();

        System.out.println((entry.getValue() > Long.valueOf(integerArray.size() / 2))
                ? IntStream.range(0, entry.getValue() + BigInteger.ONE.intValue())
                .boxed()
                .map(__ -> entry.getKey())
                .collect(Collectors.toList())
                : "Not valid data found");

*/

        List<Integer> integerArray = Arrays.asList(2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2);

        Entry<Integer, Integer> entry = integerArray.parallelStream()
                .collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.summingInt(count -> BigInteger.ONE.intValue())))
                .entrySet()
                .parallelStream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .findFirst()
                .get();

        System.out.println((entry.getValue() > Long.valueOf(integerArray.size() / 2))
                ? IntStream.range(BigInteger.ZERO.intValue(), entry.getValue())
                .boxed()
                .map(__ -> entry.getKey())
                .collect(Collectors.toList())
                : "Not valid data found");

    }
}


  /*  Find Majority element (Boyer-Moore Majority vote Algorithm)
    Given an integer array containing duplicates, return the majority element if present. A majority element appears more than n/2 times, where n is the array size.
        For example, the majority element is 2 in array {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2}.
        output: {2, 2, 2, 2, 2, 2}
*/