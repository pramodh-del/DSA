import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each number and its index
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // If the complement exists in the HashMap, we have found the solution
            if (complementMap.containsKey(complement)) {
                return new int[] { complementMap.get(complement), i };
            }
            // Otherwise, store the current number and its index in the HashMap
            complementMap.put(nums[i], i);
        }

        // No solution found, return an empty array or handle the error as per your requirements
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
