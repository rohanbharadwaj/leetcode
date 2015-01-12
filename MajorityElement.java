/*
Reference : http://www.cs.utexas.edu/~moore/best-ideas/mjrty/example.html
O(n) - Time
O(1) - Space
*/
public class MajorityElement
{
	 public static int majorityElement(int[] num) {
     int cur,counter=0;
     for(int i=0;i<num.size;i++)
     {
     	if(counter==0){cur=num[i]; counter=1;}
     	else if(counter!=00 && cur==num[i]) {counter++;}
     	else {counter--;}
     }
     if(counter!=0) return cur;
     else return -1;
    }
}