import java.util.ArrayList;

class CTNOS{
    public int numberOfSpecialChars(String word) {
        int specialNumber =0;
        ArrayList<Integer> asciiValue = new ArrayList<>();
        ArrayList<Integer> matched = new ArrayList<>();
        for(int i=0; i<word.length(); i++){
            int cAscii = (int) word.charAt(i);
            if (matched.contains(cAscii)) continue;
            if (!asciiValue.contains(cAscii))asciiValue.add(cAscii);
            if (cAscii<91){
                if (asciiValue.contains(cAscii+32)){
                    specialNumber++;
                    matched.add(cAscii);
                    matched.add(cAscii+32);
                }
            }else{
                if (asciiValue.contains(cAscii-32)){
                    specialNumber++;
                    matched.add(cAscii);
                    matched.add(cAscii-32);
                }
            }
        }
        return specialNumber;
    }
}
public class CountTheNumberOfSpecialChar_3120 {
}
