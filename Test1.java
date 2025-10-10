public class Test1 {
//    public static void method(int[] n){
//        n[1] = 5;
//        n[2]=6;
//        n[3]=7;
//    }
    public static void main(String[] args) {
        int[] N = {1,2,3,4};
        Test2 test2 = new Test2();
        test2.method(N);
        for (int i=0; i<N.length; i++)
        {
            System.out.println(N[i]);
        }

    }
}
