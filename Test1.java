import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1 {
//    public static void method(int[] n){
//        n[1] = 5;
//        n[2]=6;
//        n[3]=7;
//    }
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2,4);
        map.put(1,5);
        map.put(4,2);
        map.put(3,3);
        System.out.println(map);


    }
}
