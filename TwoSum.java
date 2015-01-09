/*
TWO SUM 
There is a naive n^2 solution using two loops a[i]+a[j] = target then return i,j.
Can we do better?
using HashMap 
Time : O(n)
*/
import java.util.*;
public class TwoSum{
	 public int[] twoSum(int[] numbers, int target) {
	  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){

            Integer diff = (Integer)(target - numbers[i]);
            if(map.containsKey(diff)){
                int toReturn[] = {map.get(diff)+1, i+1};
                return toReturn;
            }
            map.put(numbers[i], i);
        }
        return null;
    }
    public static void main(String args[])
    {
    	TwoSum obj = new TwoSum();
    	int[] numbers={2, 7, 11, 15};
    	int target = 9;	
    	int[] res = obj.twoSum(numbers,target);
    	for(int e:res)
    		System.out.print(e+" ");
    }
}
