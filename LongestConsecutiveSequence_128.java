import java.util.Arrays;
import java.util.TreeSet;

class LCS128{
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);
        int currentStreak = 1;
        int longestStreak = 1;

        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1) currentStreak++;
            else if(nums[i] == nums[i-1]) continue;
            else currentStreak = 1;

            longestStreak = Math.max(longestStreak,currentStreak);
        }
        return longestStreak;
    }
}


public class LongestConsecutiveSequence_128 {
    static void main() {
        LCS128 ls = new LCS128();

        int[] nums = {0,3,2,5,4,6,1,1};

        int result = ls.longestConsecutive(nums);
        System.out.println(result);
    }
}
