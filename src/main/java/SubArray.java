public class SubArray {
    /**
     * Returns a sub-array of the given array from the start index (inclusive) to the end index (exclusive).
     *
     * Example:
     * Given nums = {1, 2, 3, 4, 5}, start = 1, end = 4
     * The output should be {2, 3, 4}
     *
     * @param nums  an array of ints.
     * @param start the starting index, inclusive.
     * @param end   the ending index, exclusive.
     * @return a sub-array of nums containing the values between start and end.
     */
    public int[] sub(int[] nums, int start, int end) {
        if (nums == null || start < 0 || end > nums.length || start >= end) {
            throw new IllegalArgumentException("Invalid start or end index");
        }

        int[] subArray = new int[end - start]; // Create a new array of the required size
        for (int i = start; i < end; i++) {
            subArray[i - start] = nums[i]; // Copy elements from nums to subArray
        }

        return subArray;
    }

    public static void main(String[] args) {
        SubArray sa = new SubArray();
        int[] nums = {1, 2, 3, 4, 5};
        
        int[] result = sa.sub(nums, 1, 4); // Should return {2, 3, 4}
        
        System.out.println(java.util.Arrays.toString(result)); // Output: [2, 3, 4]
    }
}
