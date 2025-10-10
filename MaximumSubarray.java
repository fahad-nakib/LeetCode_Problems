public class MaximumSubarray {
    public int maxSubArray(int[]nums){
        int currSum=nums[0], maxSum=nums[0];
        for (int i=1; i<nums.length; i++){
            currSum += nums[i];
            System.out.println("i : "+ i + " currSum : "+ currSum);
            if (currSum>maxSum) maxSum = currSum;
            if (currSum<0) currSum =0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        MaximumSubarray ms = new MaximumSubarray();
        int[] nums = {-2,1};
        System.out.println(ms.maxSubArray(nums));
    }
}
