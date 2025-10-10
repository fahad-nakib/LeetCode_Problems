public class lengthOfLastWord {
    public int countLength(char[] charArr, int idx){
        int length =0;
        for (int i=idx; i>=0; i--){
            if (charArr[i] == ' ')break;
            length++;
        }
        return length;
    }
    public int lengthOfLastWord(String s) {
        int length = 0;
        char[] charArr = s.toCharArray();
        for (int i=charArr.length-1; i>=0; i--){
            if (charArr[i] == ' ' ){
                continue;
            }
            return countLength(charArr,i);
        }
        return length;
    }
    public static void main(String[] args) {
        lengthOfLastWord lw = new lengthOfLastWord();
        String str = "a";

        System.out.println("Length : " + lw.lengthOfLastWord(str));



//        char[] charArr = str.toCharArray();
//        System.out.println(charArr.length);
//        for (int i=charArr.length-1; i>0; i--){
//            if (charArr[i] == ' ' ){
//                continue;
//            }
//            int length = lw.countLength(charArr,i);
//            System.out.println("length : "+ length);
//            break;
//
//        }
    }
}
