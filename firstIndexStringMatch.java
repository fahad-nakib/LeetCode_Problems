public class firstIndexStringMatch {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int i = 0;
        while (i<haystack.length()){
            if (haystack.charAt(i) == needle.charAt(i)){

            }
        }
    }
}
// class Solution {
//     public int strStr(String haystack, String needle) {
//         for(int i=0; i<=haystack.length()- needle.length(); i++){
//             int j;
//             for(j=0; j<needle.length(); j++){
//                 if(haystack.charAt(i+j) != needle.charAt(j)){
//                     break;
//                 }
//             }
//             if(j == needle.length()) return i;
//         }
//         return -1;
//     }
// }