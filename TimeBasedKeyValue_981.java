import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class TimeStampedValue{
    public int timeStamp;
    public String value;

    public TimeStampedValue(int timeStamp, String value){
        this.timeStamp = timeStamp;
        this.value = value;
    }
}

class TimeMap{
    Map<String, ArrayList<TimeStampedValue>> entrySet;

    public TimeMap() {
        entrySet = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!entrySet.containsKey(key)){
            entrySet.put(key,new ArrayList<>());
        }

        ArrayList<TimeStampedValue> allTimeStampedValue = entrySet.get(key);
        allTimeStampedValue.add(new TimeStampedValue(timestamp,value));
    }

    public String get(String key, int timestamp) {
        if (!entrySet.containsKey(key)) return "";
        ArrayList<TimeStampedValue> allTimeStampedValue = entrySet.get(key);
        Optional<TimeStampedValue> timeStamp = binarySearch(allTimeStampedValue,timestamp);

        if (timeStamp.isEmpty()) return "";

        return timeStamp.get().value;
    }

    private Optional<TimeStampedValue> binarySearch(ArrayList<TimeStampedValue> arr, int target){
        int left =0, right = arr.size()-1;
        int matchIndex = -1;

        while (left <= right){
            int mid = left + (right-left) /2;
            TimeStampedValue currentTSV = arr.get(mid);

            if (currentTSV.timeStamp <= target){
                matchIndex = mid;
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        if (matchIndex == -1){
            return Optional.empty();
        }
        return Optional.of(arr.get(matchIndex));
    }
}


public class TimeBasedKeyValue_981 {
    static void main() {

    }
}
