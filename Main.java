import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list;
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter arr size : ");
        int arrSize = sc.nextInt();
        list = new int[arrSize];
        //System.out.println("Enter elements : ");
        for (int i =0; i<arrSize; i++)
        {
            int value = sc.nextInt();
            list[i] = value;
        }
        //System.out.println("Enter target amount : ");
        int target = sc.nextInt();
        Solution sol = new Solution();
        int[] ans1 = sol.twoSum(list, target);
        for (int i=0; i<ans1.length; i++)
        {
            System.out.println(ans1[i]);
        }

    }
}
class Solution {
    static Map<Integer,Integer> map = new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int[] ans = new int[2];
        for (int j=0;j<nums.length;j++)
       {
           System.out.println(map);
           int value = nums[j];
           //if (value>target)continue;
           int complement = target-value;
           if (map.containsKey(complement) && map.get(complement)!=j){
               ans[i] = map.get(complement);i++;
               ans[i]=j;
               break;
           }
           map.put(value,j);
       }
    return ans;
    }
}

/*
input :
4
2 7 11 15
9

3
3 2 4
6

output :
0 1



4
-10 7 19 15
9

[0,2]
 */