import java.util.*;

class KMFI{

    public int[] topKFrequent(int[] nums, int k) {
//        if (nums.length == k) return nums;
//
//        List<Integer> count = new ArrayList<>();
//        Arrays.sort(nums);
//
//        int currentCount = 1;
//        for (int i=1; i<nums.length; i++){
//            if (nums[0] != nums[1]) count.add(1);
//            if (nums[i-1] == nums[i]){
//                currentCount++;
//                continue;
//            }
//
//            count.add(currentCount);
//            currentCount = 1;
//
//            if (i==nums.length-1 && nums[i] != nums[i-1]){
//                count.add(currentCount);
//            }
//        }
//        Collections.sort(count);

        if (nums.length == k) return nums;

        Map<Integer,List<Integer>> sortedMap = new TreeMap<>();
        Arrays.sort(nums);

        System.out.println("Sorted Array : ");
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        int count = 1;
        for (int i=1; i<nums.length; i++){
            if (nums[i] != nums[i-1]){
                sortedMap.computeIfAbsent(count, F -> new ArrayList<>()).add(nums[i-1]);
                count = 1;
            }
            if (nums[i] == nums[i-1]){
                count++;
            }

            if (i == nums.length-1){
                sortedMap.computeIfAbsent(count, F -> new ArrayList<>()).add(nums[i]);
            }
        }

        System.out.println("Sorted Map : ");
        System.out.println(sortedMap);

        List<Integer> resultList = new ArrayList<>();
        while (resultList.size() != k){
            Map.Entry<Integer, List<Integer>> lastEntry = ((TreeMap<Integer, List<Integer>>) sortedMap).pollLastEntry();
            resultList.addAll(lastEntry.getValue());
        }

        int[] result = new int[resultList.size()];
        int i=0;
        for (int num : resultList){
            result[i] = num;
            i++;
        }

        return result;
    }
}

public class K_MostFrequentItem_347 {
    static void main() {
        KMFI ob = new KMFI();
        int[] num = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        int[] result = ob.topKFrequent(num,10);
        System.out.println("result : ");
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
