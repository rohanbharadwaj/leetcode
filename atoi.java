public class Solution {
    public int atoi(String str) {
        String trimmed_sring = str.trim();
        char[] array = trimmed_sring.toCharArray();
        int len=array.length;
        if(len==0) return 0;
        int i;
        int sum = 0;
        if(array[0]=='+'||array[0]=='-')
        {
            for(i=1;i<len;i++)
            if(array[i]>='0' && array[i]<='9')
               sum = sum*10+(array[i]-'0');
            else
            {
            if(array[0]=='-')
            return -sum;
            }
        }       
        else
        {
            for(i=0;i<len;i++)
             if(array[i]>='0' && array[i]<='9')
            sum = sum*10+(array[i]-'0');
            
        }
        if(array[0]=='-')
        sum = -sum;
        if(sum > 2147483647 || sum < -2147483648)
        return 2147483647;
        
        return sum;
    }
}