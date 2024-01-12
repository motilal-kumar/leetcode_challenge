package dsa_challenge_leetcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MoveZeroesToEndArray {

    public static void main(String[] args) {
        int[] array = {1, 0, 3, 0, 5, 0, 7, 8, 0, 10};
        moveZeroesToEnd(array);

        for (int num : array) {
            System.out.print(num + " ");
        }


System.out.println("===============");
        //java8 Stream.
        moveZeroesToEndJava8(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
       // Arrays.stream(array).forEach(System.out::print);

    }

    private static void moveZeroesToEnd(int[] array) {
        int nonZeroIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[nonZeroIndex];
                array[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }



    ///Using Java8.
    private static void moveZeroesToEndJava8(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.stream(array)
                .filter(num -> num != 0)
                .forEachOrdered(num -> map.put(map.size(), num));
        Arrays.setAll(array, i -> map.containsKey(i) ? map.get(i) : 0);
    }
}
