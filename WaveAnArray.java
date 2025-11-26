public class WaveAnArray {
    static void waveArr(int[] arr){
        int arrLength = arr.length;

        for (int i=0; i<arrLength-1; i=i+2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        waveArr(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
