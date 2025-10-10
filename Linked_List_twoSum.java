import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
class Solution1{
    public LinkedList addTwoNumbers(LinkedList<Integer> list1, LinkedList<Integer> list2){
        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());
        ListIterator<Integer> listIterator2 = list2.listIterator(list2.size());

        LinkedList<Integer> ans = new LinkedList<>();
        int carry = 0;
        while (listIterator1.hasPrevious() || listIterator2.hasPrevious() || carry>0)
        {
            int item1 = listIterator1.hasPrevious() ? listIterator1.previous() : 0;
            int item2 = listIterator2.hasPrevious() ? listIterator2.previous() : 0;
            int result = item1+item2+carry;
            if (result>9){
                result = result % 10;
                ans.add(result);
                carry = 1;
            }else {
                ans.add(result);
                carry = 0;
            }
            if (!listIterator1.hasPrevious() && !listIterator2.hasPrevious()){
                ans.add(carry);
                break;
            }
        }
        return ans;
    }
}
public class Linked_List_twoSum {
    public static void main(String[] args) {
        LinkedList<Integer> list1;
        list1 = new LinkedList<>(List.of(9,9,9,9,9,9,9));
        LinkedList<Integer> list2;
        list2 = new LinkedList<>(List.of(9,9,9,9));

//        LinkedList<Integer> list3 = new LinkedList<>();
//        LinkedList<Integer> list4 = new LinkedList<>();

//        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());
//        ListIterator<Integer> listIterator2 = list2.listIterator(list2.size());
//
//        LinkedList<Integer> ans = new LinkedList<>();
//        int carry = 0;
//        while (listIterator1.hasPrevious() || listIterator2.hasPrevious() || carry>0)
//        {
//            //System.out.println("_____________Iteration_________");
//            int item1 = listIterator1.hasPrevious() ? listIterator1.previous() : 0;
//            //System.out.println("item1 : "+item1);
//            int item2 = listIterator2.hasPrevious() ? listIterator2.previous() : 0;
//            //System.out.println("item2 : "+item2);
//            int result = item1+item2+carry;
//            //System.out.println("result : "+ result);
//            if (result>9){
//                result = result % 10;
//                ans.add(result);
//                carry = 1;
//            }else {
//                ans.add(result);
//                carry = 0;
//            }
//            //System.out.println("carry : "+ carry);
//            if (!listIterator1.hasPrevious() && !listIterator2.hasPrevious()){
//                ans.add(carry);
//                break;
//            }
//        }
        Solution1 s1 = new Solution1();
        LinkedList<Integer> ans = s1.addTwoNumbers(list1,list2);
        ListIterator<Integer> listIterator = ans.listIterator();
        while (listIterator.hasNext()) {
            int element = listIterator.next();
            System.out.println(element);
        }


    }
}
