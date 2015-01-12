import java.util.LinkedHashMap;
public class IntegerToRomanHashMap {
// Here LinkedHAshMap is used to preserve the order in which the iteration is done.
// Reference : http://stackoverflow.com/questions/2889777/difference-between-hashmap-linkedhashmap-and-treemap
    private static LinkedHashMap<Integer, String> numToRoman = new LinkedHashMap<Integer, String>();
    static {
        numToRoman.put(1000, "M");
        numToRoman.put(900, "CM");
        numToRoman.put(500, "D");
        numToRoman.put(400, "CD");
        numToRoman.put(100, "C");
        numToRoman.put(90, "XC");
        numToRoman.put(50, "L");
        numToRoman.put(40, "XL");
        numToRoman.put(10, "X");
        numToRoman.put(9, "IX");
        numToRoman.put(5, "V");
        numToRoman.put(4, "IV");
        numToRoman.put(1, "I");
    }
    public static String intToRoman(int num) {
        for (Integer i : numToRoman.keySet()) {
            if (num >= i) {
                return numToRoman.get(i) + intToRoman(num - i);
            }
        }
        return "";
    }
    public static void main(String args[])
    {
        String res = intToRoman(2014);
        System.out.println(res);
    }
}