import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Number of elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // If the current element is not equal to val, move it to the front of the array
                nums[k] = nums[i];
                k++; // Increment k for each element not equal to val
            }
        }

        return k;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int k = removeElement.removeElement(nums, val);
        System.out.println("Output: " + k + ", nums = " + Arrays.toString(nums));
    }
}
