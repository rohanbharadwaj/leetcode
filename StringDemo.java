import java.util.*;
public class StringDemo
{
	public static void main(String args[])
	{
		String str = "aeroplane";
		System.out.println(str);
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));
		char strArray[]=str.toCharArray();
		Arrays.sort(strArray);
		System.out.println(strArray);
		System.out.println(str.length());
		System.out.println(strArray.length);
		System.out.println(String.valueOf(strArray));
		String num = "6319748037";
		Long num1 = 350251235224L;
		System.out.println(Long.parseLong(num));
		System.out.println(Long.MAX_VALUE);
		System.out.println(num1);
		double d = 2.4;

	}
}