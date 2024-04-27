public class MaximumSubarraySum {
    public static int maxSubArraySum(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty.");
        }
        
        int maxEndingHere = nums[0]; // Initialize maxEndingHere with the first element
        int maxSoFar = nums[0]; // Initialize maxSoFar with the first element
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update maxEndingHere to be the maximum of the current element or the sum of the current element and maxEndingHere
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            // Update maxSoFar to be the maximum of maxSoFar and maxEndingHere
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = maxSubArraySum(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}


