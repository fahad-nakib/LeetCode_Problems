public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                for(int j=i; j<nums.length; j++){
                    if(nums[j] != val){
                        nums[i] = nums[j];
                        nums[j] = val;
                        count = count + 1;
                        break;
                    }
                }
            }else {
                count = count + 1;
            }
        }



        System.out.println("K : "+ count);
        System.out.print("Arr : ");
        for (int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }

    }
}
