// Find element which is greater than its neighbours. 
//No two adjacent elements are equal
//Time complexity is o(logn);

public class GreaterThanNeighbours {
    public static int findPeakElement(int[] num) {
        
        int len = num.length;
        int low = 0;
        int high = len-1;
        while(low<high)
        {
        	int mid1=(low+high)/2;
        	int mid2=mid1+1;
        	if(num[mid1]<num[mid2])
        		low=mid2;
        	else
        		high=mid1;
        }
        return low;

    }
    public static void main(String args[])
    {

    	int[] array = {1,2,3,1,4};
    	int peak = findPeakElement(array);
    	System.out.println(peak);
    	

    }
}