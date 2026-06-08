

class VP{
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (!isAlphanumeric(arr[i])) {
                i++;
                continue;
            }
            if (!isAlphanumeric(arr[j])) {
                j--;
                continue;
            }

            if (toLowerCase(arr[i]) != toLowerCase(arr[j])) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        return (c >= 'A' && c <= 'Z') ||
                (c >= 'a' && c <= 'z') ||
                (c >= '0' && c <= '9');
    }

    private char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }
        return c;
    }





//    public boolean isPalindrome(String s) {
//
//
//        String input = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//        int l = 0;
//        int r = input.length()-1;
//        while(l<r){
//            if(input.charAt(l) != input.charAt(r)){
//                return false;
//            }
//            l++;
//            r--;
//        }
//        return true;
//    }


//    public boolean isPalindrome(String s) {
//        int l = 0;
//        int r = s.length()-1;
//
//        while (l < r) {
//            char a = s.charAt(l);
//            char b = s.charAt(r);
//
//            if (a >= 'A' && a<= 'Z') {
//                a = (char) (a + 32);
//            }
//
//            if (b >= 'A' && b<= 'Z') {
//                b = (char) (b + 32);
//            }
//
//            if (!((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))) {
//                l++;
//                continue;
//            }
//            if (!((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))) {
//                r--;
//                continue;
//            }
//
//            if (a != b) {
//                return false;
//            }
//            l++;
//            r--;
//        }
//
//        return true;
//    }
}


public class ValidPalindrome_125 {
    static void main() {
        String s = "tab a cat";
        VP vp = new VP();
        System.out.println(vp.isPalindrome(s));
    }
}
