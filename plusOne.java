import java.math.BigInteger;

public class plusOne {
//    static void addNumber(int[] digits){
//        int num =0;
//        for (int i=0; i<digits.length; i++){
//            int currNum = digits[i];
//            num = num*10 + currNum;
//        }
//        num = num + 1;
//        System.out.println("Number : "+num);
//    }
    public int[] plusOneByStr(int[] digits){

        int carry = 1;
        for (int i= digits.length-1; i>=0 ; i--){
            int sum = digits[digits.length-1] + carry;
            System.out.println("sum : "+sum);
            if (sum > 9){
                digits[i] = 0;
            }
            if (i == 0 && carry > 0){
                int[] newArr = new int[digits.length+1];
                newArr[0] = carry;
                for (int j=1; j<newArr.length; j++){
                    newArr[j] = 0;
                }
                return newArr;
            }else {
                digits[i] = sum;
                return digits;
            }
        }
        return digits;
    }
    public int[] addOne(int[] digits, int index){
        int sum = digits[index] + 1;
        if (index == 0 && sum > 9){
            System.out.println("length : " + digits.length);
            int[] newArr = new int[digits.length+1];
            newArr[0] = 1;
            for (int i=1; i<=digits.length; i++){
                newArr[i] = 0;
            }
            return newArr;
        }
        if (sum<10){
            digits[index] = sum;
            return digits;
        }else {
            digits[index] = 0;
            return addOne(digits, index-1);
        }
        //return digits;
    }
    public int[] plusOneByRecursion(int[] digits){
        return addOne(digits, digits.length-1);
    }
    public static void main(String[] args) {
        //int[] arr = {9,8,7,6,5,4,3,2,1,0};
        //int[] arr = {9,8,7,6,5,4,3,2,1,9};
        int[] arr = {9,9};
        plusOne po = new plusOne();
        //int[] digits = po.plusOneByStr(arr);
        int[] digits = po.plusOneByRecursion(arr);      // Final approach 0ms runtime;

        System.out.println("New Arr : ");
        for (int i=0; i<digits.length; i++)
        {
            System.out.print(digits[i] + " ");
        }
        System.out.println("New arr length : "+ digits.length);
    }
}
