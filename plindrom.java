public class plindrom {
    public  boolean isPalindrome(int x){
        int initial_x = x;
        int reverse_x = 0;
        while (x>0){
            reverse_x = reverse_x * 10 + (x % 10);
            x = x/10;
        }
        if (initial_x == reverse_x) return true;
        return false;
    }
    public static void main(String[] args) {
        plindrom pl = new plindrom();
        System.out.println(pl.isPalindrome(121));

    }
}
