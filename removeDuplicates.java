public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        //int[] expectedArray = new int[nums.length];
        int j = 0;
        //nums[j] = nums[0];
        for (int i=0; i<nums.length; i++){
           if (nums[j] != nums[i]){
               j = j+1;
               nums[j] = nums[i];
           }
        }

        System.out.println("currIndex : "+ j);
        System.out.println();
        System.out.print("Expected array : ");
        for (int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }

    }
}
