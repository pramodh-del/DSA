import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;

        // Traverse the array and mark visited elements as negative
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result[0] = Math.abs(nums[i]);
            } else {
                nums[index] *= -1;
            }
        }

        // Find the missing number
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SetMismatch setMismatch = new SetMismatch();
        int[] nums = {1, 2, 2, 4};
        int[] result = setMismatch.findErrorNums(nums);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
