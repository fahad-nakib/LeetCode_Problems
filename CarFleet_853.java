import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class CarFleet{
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> distanceSpeedMap = new HashMap<>();
        for (int i=0; i<position.length; i++){
            distanceSpeedMap.put(position[i], speed[i]);
            speed[i] =0;
        }
        Arrays.sort(position);
        //printArr(position, "Sorted Position ");
        System.out.println(distanceSpeedMap);

        int group = 0;
        for (int i=position.length-1; i>=0; i--){
            int time = (target-position[i])*distanceSpeedMap.get(position[i]);
            if (i != position.length-1 && time<=speed[i+1]){    // here now speed[] stores time
                speed[i] = speed[i+1];
            }else {
                group++;
                speed[i] = time;
            }
        }

        printArr(speed, "time to reach arr : ");
        System.out.println("Groups : " + group);

        return group;
    }



    public void printArr(int[] arr, String name){
        System.out.println(name + "Array : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
public class CarFleet_853 {
    static void main() {
        CarFleet cf = new CarFleet();
        int target = 10;
        int[] position = {1,4};
        int[] speed = {3,2};

        cf.carFleet(target,position,speed);
    }
}
