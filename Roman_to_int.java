import java.util.HashMap;

public class Roman_to_int {
    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for (int i=0; i<s.length(); i++)
        {
            char value = s.charAt(i);
            System.out.println("current character : "+ value + "index : "+ i);
            if (value == 'I' && i<s.length()-1){
                //System.out.println(result +"->" +  s.charAt(i));
                if (s.charAt(i+1) == 'V'){ result =result+4; i++;continue;}
                if (s.charAt(i+1) == 'X'){ result =result+9; i++;continue;}
                else result = result + map.get(value);

                System.out.println(result +"->" +  s.charAt(i));
                continue;
            }
            if (value == 'X' && i<s.length()-1){

                if (s.charAt(i+1) == 'L') {result =result+40; i++;continue;}
                if (s.charAt(i+1) == 'C') {result =result+90; i++;continue;}
                else result = result + map.get(value);
                System.out.println(result +"->" +  s.charAt(i));
                continue;
            }
            if (value == 'C' && i<s.length()-1){
                //System.out.println(result +"->" +  s.charAt(i));
                if (s.charAt(i+1) == 'D') {result =result+400;i++;continue;}
                if (s.charAt(i+1) == 'M') {result =result+900;i++;continue;}
                else result = result + map.get(value);
                System.out.println(result +"->" +  s.charAt(i));
                continue;
            }
            if (i == s.length()){
                break;
            }else {
                result = result + map.get(value);
                System.out.println(result +"->" +  s.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Roman_to_int RI = new Roman_to_int();
        System.out.println(RI.romanToInt("MCMXCIV"));
    }
}
