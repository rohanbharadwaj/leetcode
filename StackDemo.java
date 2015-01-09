import java.util.Stack;
public class StackDemo
{
	public static void main(String args[])
	{
		Stack<Character> s=new Stack<Character>();
		boolean b = s.empty();
		//Character top = s.peek();  //thows EmptyStackException if stack is empty
		s.push('a');
		s.push('b');
		s.push('c');
		Character top = s.peek();
		System.out.println(b);
		System.out.println(top);
		System.out.println("pop :"+s.pop());
		//int index = s.search('z');
		if(s.search('z')<0)   //if condition shpuld evaluate to boolean in java
			System.out.println("Not element : z");


	}
}