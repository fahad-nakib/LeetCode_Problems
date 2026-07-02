import java.util.Stack;

class DT{
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        int n= temperatures.length;
        int[] result = new int[n];

        result[n-1] = 0;
        stk.push(n-1);
        for(int j=n-2; j>=0; j--){
            int st_tem = temperatures[stk.peek()];
            if (temperatures[j] < st_tem){
                int distance = stk.peek()-j;
                result[j] = distance;
                stk.push(j);
            }
            if (temperatures[j] >= st_tem ){
                while (temperatures[j] >= temperatures[stk.peek()]) {
                    stk.pop();
                    if (stk.isEmpty()) break;
                }
                if (stk.isEmpty()){
                    stk.push(j);
                    result[j] =0;
                }else {
                    st_tem = temperatures[stk.peek()];
                    int distance = stk.peek() - j;
                    result[j] = distance;
                    stk.push(j);
                }
            }
        }
        return result;
    }
}



//class Solution {
//    public int[] dailyTemperatures(int[] temp) {
//        int n = temp.length;
//        int[] ans = new int[n];
//        Deque<Integer> st = new ArrayDeque<>();
//        ans[n-1] = 0;
//        st.push(n-1);
//        for(int i=n-2;i>=0;i--){
//            int curr = temp[i];
//            while(st.size()>0&&temp[st.peek()]<=curr){
//                st.pop();
//            }
//            if(st.size()==0) ans[i] = 0;
//            else{
//                ans[i] = st.peek()-i;
//            }
//            st.push(i);
//        }
//        return ans;
//    }
//}
public class DailyTemperatures_739 {
    static void main() {
        int[] temp = {30,38,30,36,35,40,28};
        int[] result;
        DT dt = new DT();
        result = dt.dailyTemperatures(temp);

        System.out.println("Result : ");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
