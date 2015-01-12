public class ExcelTitle {
    public static String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
        
    }
    
    public static void main(String args[])
    {
    	System.out.println(convertToTitle(283));
    	

    }
}