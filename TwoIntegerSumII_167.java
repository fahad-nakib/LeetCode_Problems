class TIS{

// // TOW POINTER APPROACH
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                return new int[]{left + 1, right + 1};
            }
            else if (currentSum < target) {left++;}
            else {right--;}
        }
        return new int[]{-1, -1};
    }


//    // BRUTE FORCE APPROACH
//    public int[] twoSum(int[] numbers, int target) {
//        int[] result = new int[2];
//        Arrays.sort(numbers);
//        for (int i=0; i<numbers.length; i++){
//            int num = target - numbers[i];
//            int numIdx = binarySearch(numbers,0,numbers.length-1,num,i);
//            if ( numIdx != -1){
//                result[0] = Math.min(i,numIdx);
//                result[1] = Math.max(i,numIdx);
//            }
//        }
//        return result;
//    }
//
//    public int binarySearch(int[] numbers,int left, int right, int num, int idx){
//        if (left<right){
//            int mid = left + (right-left / 2);
//            if (numbers[mid] == num && mid != idx){
//                return mid;
//            }
//            if (numbers[mid] > num){
//                int r = mid-1;
//                return binarySearch(numbers, left,r,num,idx);
//            }
//
//            if (numbers[mid] < num){
//                int l = mid+1;
//                return binarySearch(numbers,l, right,num,idx);
//            }
//        }
//        return -1;
//    }
}
public class TwoIntegerSumII_167 {
    static void main() {
        int[] numbers = {1,2,3,4,6,7,4,9};
        TIS tis = new TIS();
        int[] res = tis.twoSum(numbers,3);
        for (int n : res){
            System.out.print(n + " ");
        }

    }
}
