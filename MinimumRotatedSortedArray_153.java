class MRSA{
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[right] < nums[mid]){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
public class MinimumRotatedSortedArray_153 {
    static void main() {
        MRSA mrsa = new MRSA();
        int[] nums = {4,5,6,7};
        int ans = mrsa.findMin(nums);
        System.out.println(ans);
    }
}
