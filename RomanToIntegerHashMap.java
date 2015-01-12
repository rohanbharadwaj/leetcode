import java.util.*;
public class RomanToIntegerHashMap {
    static HashMap<Character,Integer> value=new HashMap<Character,Integer>();
      static{
        value.put('M',1000);
        value.put('D',500);
        value.put('C',100);
        value.put('L',50);
        value.put('X',10);
        value.put('V',5);
        value.put('I',1);
    }
    public static int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1&&value.get(s.charAt(i))<value.get(s.charAt(i+1)))
                sum-=value.get(s.charAt(i));
            else
                sum+=value.get(s.charAt(i));
        }
        return sum;
    }
     public static void main(String args[])
    {
        System.out.println(romanToInt("MMXIV")); //2014

    }
}