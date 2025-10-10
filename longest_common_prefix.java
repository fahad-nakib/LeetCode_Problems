public class longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        int lowestStrLen = 200;
        int lowerStrIdx = 0;
        for (int i=0; i< strs.length; i++){
            if (strs[i].length()< lowestStrLen){
                lowestStrLen = strs[i].length();
                lowerStrIdx = i;
            }
        }
        String longStrPfx = strs[lowerStrIdx];
        int longStrPfxLen = 200;
        String longCommonPfx = "";
        for (int i=0; i<strs.length; i++){
            String currStr = strs[i];
            String currLongestPfx = "";
            for (int j=0; j<lowestStrLen; j++)
            {
                if (longStrPfx.charAt(j)== currStr.charAt(j)){
                    currLongestPfx += longStrPfx.charAt(j);
                }
            }
            int len = currLongestPfx.length();
            if (len<longStrPfxLen){
                longStrPfxLen = len;
                longCommonPfx = currLongestPfx;
            }
            currLongestPfx = "";
        }
        System.out.println(longCommonPfx);



    }
}
