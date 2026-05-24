import java.util.Arrays;

class ValidAnagram{
    public boolean isAnagram(String s, String t) {
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        s = new String(cArr);

        cArr = t.toCharArray();
        Arrays.sort(cArr);
        t = new String(cArr);

        if(s.equals(t)) return true;
        return false;
    }
}

public class ValidAnagram_242 {
    static void main() {

    }
}
