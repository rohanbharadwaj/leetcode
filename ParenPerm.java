import java.util.ArrayList;
import java.util.Scanner;

public class ParenPerm 
{
	
	public void addParen(ArrayList<String> list,int lrem,int rrem,char[] str,int count)
	{
		if(lrem<0 && rrem<lrem) return;
		if(lrem==0 && rrem==0){
		String s = String.copyValueOf(str);
		list.add(s);
		}
		else{
		if(lrem>0){
		str[count]='(';
		addParen(list,lrem-1,rrem,str,count+1);
		}
		if(rrem>lrem){
		str[count]=')';
		addParen(list,lrem,rrem-1,str,count+1);
		}
		}
	}
	public ArrayList<String> generateParens(int count)
	{
	char[] str=new char[2*count];
	ArrayList<String> list = new ArrayList<String>();
	addParen(list,count,count,str,0);
	return list;
	}
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	ParenPerm obj = new ParenPerm();
	System.out.println("Enter n for generating Parens:");
	int n = s.nextInt();
	ArrayList<String> result = obj.generateParens(n);
	System.out.println(result.toString());
	}

}