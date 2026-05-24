import java.util.HashSet;
import java.util.Set;

class HappyNumber{
    public boolean isHappy(int n) {
        HashSet<Integer> usedNumber = new HashSet<>();
        while (true){
            int sum = 0;
            while (n!= 0){
                int num = n%10;
                n= n/10;
                sum += num*num;
            }
            if (sum == 1) return true;
            if (usedNumber.contains(sum)){
                return false;
            }else {
                usedNumber.add(sum);
                n = sum;
            }

        }
    }
}

public class HappyNumber_202 {
    static void main() {
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(20));
    }
}
