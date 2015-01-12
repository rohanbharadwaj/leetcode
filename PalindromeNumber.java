public class PalindromeNumber
{
	public static boolean isPalindrome(int x) {
		int reversenumber=0;
		int tempreversenumber = 0;
		int xcopy =x;
		while(x!=0)
		{
			tempreversenumber = reversenumber*10 + x%10;
			if((tempreversenumber-x%10)/10!= reversenumber)
				break;
				//System.out.println("handle overflow b*T*h");
			x/=10;
			reversenumber=tempreversenumber;
		}
		System.out.println(reversenumber);
        if(xcopy == reversenumber)
        	return true;
        else
        	return false;
    }

    public static void main(String args[])
    {
    	System.out.println(isPalindrome(1));
    	// System.out.println(Integer.MAX_VALUE);
    	// System.out.println(Integer.MIN_VALUE);
    }
}