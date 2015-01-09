public class MinStack {
	static int top,top1;
	static int size;
	static int[] StackArray;
	static int[] DupStack;

	MinStack(int s)
	{
		top=-1;
		top1=-1;
		size = s;
		StackArray = new int[size];
		DupStack = new int[size];
	}
    public static void push(int x) {
    	if(top1<0)
    		DupStack[++top1]=x;
    	else if (x<top())	
   			DupStack[++top1]=x;
    	StackArray[++top]=x;
    }

    public static void pop() {
    	if(StackArray[top]==DupStack[top1])
    	top1--;	
        top--;
    }

    public static int top() {
        return StackArray[top];
    }

    public static int getMin() {
        return DupStack[top1];
    }
    public static void main(String args[])
    {
    	// //MinStack s = new MinStack(100);
    	// s.push(4);
    	// s.push(3);
    	// s.push(6);
    	// s.push(7);
    	// s.push(2147483647);
    	// s.push(-2147483648);
    	// //System.out.println(s.getMin());
    	push(2147483646);
		push(2147483646);
		push(2147483647);
		top();
		pop();
		getMin();
		pop();
		getMin();
		pop();
		push(2147483647);
		top();
		getMin();
		push(-2147483648);
		top();
		getMin();
		pop();
		getMin();


    }

}
