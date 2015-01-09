public class PlusOne{
	 public int[] plusOne(int[] digits) {
        int carry = 0;
        int n=digits.length;
        int i=n-1;
        int[] res = new int[n];
        while(i>=0)
        {   
            int sum;
            if(i==n-1)
            sum = digits[i]+1;
            else
            sum = digits[i]+carry;
            res[i] = sum%10;
            carry = sum/10;
            i-=1;
        }
         if ( carry > 0 ) {
            int[] newres = new int[digits.length + 1];
            newres[0] = carry;
            System.arraycopy(res,0,newres,1,digits.length);
            /*public static void arraycopy(Object src,
             int srcPos,
             Object dest,
             int destPos,
             int length)*/
            return newres;
        }
        
        return res;
    }
}