/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/
public class ReverseInteger {
    public static int reverse(int x) {
    	// int flag = 0;
    	// if(x<0){
    	// 	flag =1;
    	// 	x = -x;
    	// }
    	// int num = x;	
    	// int res = 0;
    	// while(num>0)
    	// {	
    	// 	int digit = num%10;
    	// 	res = res * 10 + digit;
    	// 	num/=10; 
    	// }
    	// if(flag==1)
    	// 	res =-res;
    	// if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE)
    	// 	return 0;
    	// return (res);

    	int result = 0;
	    while (x != 0)
	    {
	        int tail = x % 10;
	        //System.out.println("tail :"+tail);
	        int newResult = result * 10 + tail;
	        //System.out.println("newResult"+newResult);
	        if ((newResult - tail) / 10 != result) //For handling bufferoverflow 
	        { return 0; }	
	        result = newResult;
	        //System.out.println("result"+result);
	        x = x / 10;
	    }

	    return result;
        
    }
    public static void main(String args[])
    {
    	//String str = new String("123");
    	int num = 1000000003;
    	int res = reverse(num);
    	System.out.println(res);
    	//System.out.println(Integer.MAX_VALUE);
    }
}