class Solution {
    // public int lengthOfLongestSubstring(String s) {

    //     char[] charArray = s.toCharArray();
    //     Set<Character> latters = new HashSet<>();
    //     int count = 0;

    //     for(int i=0; i<charArray.length; i++){
    //         if(!latters.contains(charArray[i])){
    //             latters.add(charArray[i]);
    //             if(latters.size() > count) count = latters.size();
    //         }else{
    //             latters.clear();
    //             latters.add(charArray[i]);
    //         }
    //     }
    //     return count;
    // }


    public int lengthOfLongestSubstring(String s) {

        char[] cArr = s.toCharArray();
        Map<Character, Integer> map = new HashMap();

        int left=0, right=0, maxCount=0;
        for(right=0; right<cArr.length; right++){
            int idx = map.getOrDefault(cArr[right], -1);

            if(idx != -1 && idx >= left){
                maxCount = Math.max(maxCount, right-left);
                left= idx + 1;
            }
            map.put(cArr[right],right);
        }
        return Math.max(maxCount, right-left);
    }
}
