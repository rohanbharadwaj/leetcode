public class TrailingZeros {
    public static int ipow(int base, int exp)
        {
            int result = 1;
            while (exp!=0)
            {
                if ((exp & 1)!=0)
                    result *= base;
                exp >>= 1;
                base *= base;
            }

            return result;
    }
    public static int trailingZeroes(int n) {
        int k=1;
        int res = 0;
        int denom=5;
        while(denom<n)
        {
            // System.out.println(n/denom);
            res = res+(n/denom);
            //denom = Math.pow(5,(k+1)); // Math.pow works on double does not work here
            denom = ipow(5,k+1);
            // System.out.println(denom);
            //k = Math.floor(n/5^i);
            k++;
        }
        return res;
    }
    public static void main(String args[])
    {
        System.out.println(trailingZeroes(101));
    }
}