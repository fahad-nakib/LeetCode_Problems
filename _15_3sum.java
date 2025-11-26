import java.util.*;

public class _15_3sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();

        for (int i=0; i<=nums.length-3;i++){
            for (int j=i+1; j<=nums.length-2; j++){
                for (int k=j+1; k<=nums.length-1; k++){
                    if (nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]); temp.add(nums[j]); temp.add(nums[k]);
                        Collections.sort(temp);
//                        if (!list.contains(temp)){
//                            list.add(temp);
//                        }
                        list.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(list);
    }
    public static void main(String[] args) {
        _15_3sum sum = new _15_3sum();
        List<List<Integer>> list = new ArrayList<>();
        int[] num = {-1,0,1,2,-1,-4};
        list = sum.threeSum(num);
        System.out.println(list);
    }
}
