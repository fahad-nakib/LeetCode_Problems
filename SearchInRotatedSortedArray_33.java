
class SIRSA{
    public int search(int[] nums, int target) {
        int minIdx = findMinIdx(nums);
        int left = 0;
        int right = nums.length-1;
        int result = 0;
        if(target >= nums[minIdx] && target <= nums[right] ){
            left = minIdx;
            result = binarySearch(nums, target, left, right);
        }else if(minIdx != 0){
            right = minIdx - 1;
            result = binarySearch(nums, target, left, right);
        }else{
            result = -1;
        }
        return result;
    }

    public int binarySearch(int[] nums, int target, int left, int right){
        while(left<=right){
            int mid = left+ (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target < nums[mid]){
                right = mid-1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int findMinIdx(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right-left) / 2;
            if(nums[right] < nums[mid]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}

public class SearchInRotatedSortedArray_33 {
    static void main() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        SIRSA sirsa = new SIRSA();
        int result = sirsa.search(nums, target);
        System.out.println("Result : " + result);

    }
}
