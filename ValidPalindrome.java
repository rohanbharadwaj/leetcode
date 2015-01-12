/*
Character.toLowerCase(char)
Character.isLetterOrDigit(char)

*/


public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
    	if(s.length()==0) return true;
        char[] str = s.toCharArray();
        StringBuffer alnum = new StringBuffer("");
        int count = 0,len;
        for(int i=0;i<str.length;i++)
        {
        	if(Character.isLetterOrDigit(str[i]))
        	{
        		//alnum[count++] = str[i];
        		alnum.append(Character.toLowerCase(str[i]));

        	}

        }
        int i = alnum.length()-1;
    	int j=0;
	    while(i > j){
	        if(original.charAt(i) != original.charAt(j)){
	            return false;
	        }
	        i--;
	        j++;
	    }
    	return true;
        // len = alnum.length();
        // for(int i=0;i<len/2+1;i++)
        // {
        // 	if(alnum.charAt(i)!= alnum.charAt(len-i-1))
        // 		return false;
        // }
        // // System.out.println(alnum);
        // return true;
    }

    public static void main(String args[])
    {
    	System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}