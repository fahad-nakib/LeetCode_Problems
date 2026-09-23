class Solution {
    public String minWindow(String s, String t) {
        int[] mapS = new int[123];
        int[] mapT = new int[123];

        for(int i=0; i<t.length(); i++){
            mapT[t.charAt(i)]++;
        }

        int left=0, right=0, minLength=Integer.MAX_VALUE, minStart=0;

        while(right<s.length()){
            mapS[s.charAt(right)]++;

            while(contains(mapS, mapT)){
                if(right-left+1 < minLength){
                    minLength = right-left+1;
                    minStart = left;
                }
                mapS[s.charAt(left++)]--;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart+minLength);
    }
    public boolean contains(int[] mapS, int[] mapT){
        for(int i=0; i<123; i++){
            if(mapT[i]>mapS[i]){
                return false;
            }
        }
        return true;
    }
}
