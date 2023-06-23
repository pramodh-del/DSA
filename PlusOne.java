import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the digits array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by 1
            digits[i]++;
            // If the current digit becomes 10, set it to 0 and continue the loop
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // If the current digit is less than 10, we have no carry, so return the digits array
                return digits;
            }
        }

        // If we reach here, it means all the digits were 9 and we have a carry
        int[] result = new int[n + 1];
        result[0] = 1; // Set the most significant digit to 1
        return result;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = {1, 2, 3};
        int[] result = plusOne.plusOne(digits);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
