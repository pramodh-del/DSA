import java.util.Arrays;
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0; // Index to track the position to place the next non-zero element

        // Traverse the array and move non-zero elements to the left side of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill the remaining positions with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        System.out.println("Output: " + Arrays.toString(nums));
    }
}
