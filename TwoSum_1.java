import java.util.HashMap;

class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tarValue = new HashMap<>();
        int i=0;
        for (int num : nums){
            tarValue.put(num,i);
            i++;
        }
        int idx=-1, idx2 =-1;
        for (int j=0; j<nums.length; j++){
            if (tarValue.containsKey(target-nums[j])){
                idx = tarValue.get(target-nums[j]);
                if (idx == j)continue;
                idx2=j;
                break;
            }
        }
        return new int[] {idx2, idx};

//
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            int com=target-nums[i];
//            if(map.containsKey(com)){
//                return new int[]{map.get(com),i};
//            }else{
//                map.put(nums[i],i);
//            }
//        }
//        return new int[]{};


//        for (int i=0; i<nums.length; i++){
//            int sub = target - nums[i];
//            if(tarValue.containsKey(sub)){
//
//            }else {
//
//            }
//        }
    }
}

public class TwoSum_1 {
    static void main() {
        int[] arr = {3,2,4};
        TwoSum ts = new TwoSum();
        ts.twoSum(arr,6);
    }
}
