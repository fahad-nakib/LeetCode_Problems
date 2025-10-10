public class AddBinary {
    public char carr = '0';
    public char sum(char a, char b){
        if (a=='0' && b=='0' && carr=='0'){
            carr = '0';
            return '0';
        } else if (a=='0' && b=='0' && carr=='1') {
            carr = '0';
            return '1';
        }else if (a=='0' && b=='1' && carr=='0') {
            carr = '0';
            return '1';
        }else if (a=='0' && b=='1' && carr=='1') {
            carr = '1';
            return '0';
        }else if (a=='1' && b=='0' && carr=='0') {
            carr = '0';
            return '1';
        }else if (a=='1' && b=='0' && carr=='1') {
            carr = '1';
            return '0';
        }else if (a=='1' && b=='1' && carr=='0') {
            carr = '1';
            return '0';
        }else if (a=='1' && b=='1' && carr=='1') {
            carr = '1';
            return '1';
        }
        return '0';
    }
    public String addBinary(String a, String b){
        char[] a_arr = a.toCharArray();
        char[] b_arr = b.toCharArray();
        int i=a_arr.length-1,j=b_arr.length-1;

        String result = "";
        while (i>=0 || j >=0){
            if (i<0){
                result = sum('0', b_arr[j]) + result;
                j--;
            }else if(j<0){
                result = sum(a_arr[i], '0') + result;
                i--;
            }else{
                result = sum(a_arr[i], b_arr[j]) + result;
                i--;
                j--;
            }
        }
        if (carr == '1')
        {
            return "1"+result;
        }
        return result;
    }
    public static void main(String[] args) {
        AddBinary ab = new AddBinary();
        String a = "1010";
        String b = "1011";
        String result = ab.addBinary(a,b);
        System.out.println("result : "+ result);
    }
}
