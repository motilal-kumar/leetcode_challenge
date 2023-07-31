package dsa_challenge_leetcode;

public class ArrayPairTest {

    //Find a pair with the given sum in an array.
    //Given an unsorted integer array, find a pair with the given sum in it.
    public static void testPair(int[] nums, int target){

        for(int i=0; i<=nums.length-1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    System.out.println("Pair Found : "+nums[i] +"," + nums[j]);

                    return;

                }

            }

        }

        System.out.println("Pair Not found");

    }
    public static void main(String[] args){

        int[]   nums = {8, 7, 2, 5, 3, 1};
        int target = 10;
        testPair(nums, target);


/*
        Map<Integer, Integer> map = new HashMap<>();
        int[] nums = {8, 7, 2, 5, 3, 1};
        int target = 10;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                //System.out.println(i+ " " +  hash.get(sum-arr[i]));
                System.out.println(nums[i]+ " " + (target-nums[i]));
            }
        }
*/

    }
}
