public class searchInsertPosition {
    public int binarySearch(int [] arr, int low, int high, int target){
        if (high >= low){
            int mid = low + (high-low)/2;
            if (arr[mid] == target){
                System.out.println("mid : "+mid);
                return mid;
            } else if (target>arr[mid]) {
                int lo = mid+1;
                System.out.println("calling "+ lo + " "+high);
                return binarySearch(arr,mid+1,high,target);
            } else if (target<arr[mid]) {
                int hi = mid -1;
                System.out.println("calling " + low + " "+ hi);
                return binarySearch(arr,low,mid-1,target);
            }
        }
        return low;
    }
    public int searchInsert(int nums[], int target){
        int result = binarySearch(nums,0,nums.length,target);
        return result;
    }
    public static void main(String[] args) {
        searchInsertPosition si = new searchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 2;
        int result = si.searchInsert(nums,target);
        System.out.println("index : "+ result);
    }
}
