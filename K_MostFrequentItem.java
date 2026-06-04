import java.util.*;

class KMFI{
    public int[] topKFrequent(int[] nums, int k) {

        if (nums.length == k) return nums;
        System.out.println("Nums arr : ");
        printArr(nums);

        int[] max = new int[k*2];
        for (int i=0; i<max.length; i++){
            if (i%2 == 0){
                max[i] = nums[0]; // element (idx 0,2,4)
            }
            max[i] = 0; //element count (idx 1,3,5)
        }

        Arrays.sort(nums);

        System.out.println();
        System.out.println("Sorted Nums arr : ");
        printArr(nums);
        System.out.println();

        if (nums.length > 1){
            int count=1;
            boolean changeable = false;
            int changeableIdx = 1;   // element count idx

            for (int i=0; i<nums.length-1; i++){
                if (nums[i] == nums[i+1] ){
                    count++;
                    System.out.println("Array iteration : " + i + "th item "+ nums[i] +" current count : "+ count);
                    if (i+1 != nums.length-1)continue;
                }

                    int min = Integer.MAX_VALUE;
                    for (int j=1; j<max.length; j=j+2){
                        if (count > max[j]) {
                            changeable = true;
                            System.out.println("Checking count : "+count + " and "+ j + "th max : "+max[j]);
                        }
                        if (max[j] < min){
                            min = max[j];
                            changeableIdx = j;

                            System.out.println("Min value : "+ min + " changeable idx : " + changeableIdx);
                        }
                    }

                    if (changeable){
                        max[changeableIdx] = count;
                        max[changeableIdx-1] = nums[i];
                        changeable = false;
                        count =1;
                    }


                    System.out.println();
                    System.out.println("Max arr : " + i +"th itr");
                    printArr(max);


            }

            System.out.println();
            System.out.println("Final Max arr : ");
            printArr(max);


            int[] result = new int[k];
            k=k-1;
            for (int i=0; i<max.length; i=i+2){
                result[k] = max[i];
                k--;
            }
            return result;
        }
        return nums;
    }

    public void printArr(int[] nums){
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

public class K_MostFrequentItem {
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
