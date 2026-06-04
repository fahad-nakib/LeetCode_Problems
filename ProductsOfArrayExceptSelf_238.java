import java.util.Arrays;

class POAE{
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;

        for (int i=0; i<nums.length; i++){
            if (nums[i] == 0) zeroCount++;
            if(nums[i] != 0) product = product*nums[i];
        }
        if (zeroCount > 1){
            Arrays.fill(nums, 0);
            return nums;
        }

        if (zeroCount == 1){
            for (int i=0; i<nums.length; i++){
                if (nums[i] == 0) {
                    nums[i] = product;
                }else nums[i] = 0;
            }
            return nums;
        }

        for (int i=0; i<nums.length; i++){
            nums[i] = product / nums[i];
        }
        return nums;
    }
}

public class ProductsOfArrayExceptSelf_238 {
    static void main() {

    }
}
