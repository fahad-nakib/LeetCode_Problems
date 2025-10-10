public class BinarySearch {
    // Binary Search Using  RECURSIVE  Technique
    public static int search(int[] arr, int low, int high, int target){
        if (high >= low){
            int mid = low + (high-low)/2;
            if (arr[mid] == target){
                System.out.println("mid : "+mid);
                return mid;
            } else if (target>arr[mid]) {
                int lo = mid+1;
                System.out.println("calling "+ lo + " "+high);
                return search(arr,mid+1,high,target);
            } else if (target<arr[mid]) {
                int hi = mid -1;
                System.out.println("calling " + low + " "+ hi);
                return search(arr,low,mid-1,target);
            }else {
                System.out.println("fnal mid : "+ mid);
                return mid;
            }
        }
        return low;
    }

    //Binary Search Using  ITERATIVE  Technique

    public static int search2(int[] arr, int low, int high, int target) {
        int mid = -1;
        while (high >= low){

            mid = low + (high-low)/2;

            if (arr[mid] == target){
                return mid;
            } else if (target>arr[mid]) {
                low = mid+1;
            } else if (target<arr[mid]) {
                high = mid-1;
            }
        }

        return mid;
    }
    public static void main(String[] args) {
        int[] arr = {1,6,8,9,13,16,17,21,25,29,33,38,41,45,49};

        //int target = 29;
        int target = 10;

        int low = 0;
        int high = arr.length-1;

        //Call Recursive method
        int result = search(arr,low, high,target);

        //Call Iterative method
        //int result = search2(arr,low, high,target);
        if (result == -1){
            System.out.println("Element not found ! ");
        }else {
            System.out.println("Element present at index : "+ result);
        }
    }
}
