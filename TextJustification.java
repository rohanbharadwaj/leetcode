import java.util.*;
public class TextJustification {
    public List<String> fullJustify(String[] words, int L) {
        
        List<String> res = new ArrayList<String>();
        
        if(words.length == 0 || L == 0){
            res.add("");
            return res;
        }
        
        if(words.length == 1 && words[0].length() == 0){
            res.add(generateSpaces(L));
            return res;
        }
            
        int index = 0;
        while(index < words.length){
             if(words[index].length()>L){
	                res.clear();  // Any word length us greater than the specified limit.
	                break;
	        }
	     if(words[index].length() == 0){  // Handle empty words.
	                index++;
	                continue;
	     }
	        
	     int cur = index+1;
	     int len = words[index].length();
	     String curLine = words[index];
	        
	     while(cur<words.length){
	            int temp = len + words[cur].length() + 1;
	            if(temp<=L){
 	                curLine += " "+words[cur];
 	                len = temp;
 	                index = cur;
 	                cur ++;
 	            }
 	            else{
 	                index = cur-1;
 	                break;
 	            }
 	        }
 	 	index++;      	 	     
                if(index == words.length){
 	 	         curLine = justifyString(curLine,L,true);
 	 	} 	 	     
                else curLine = justifyString(curLine,L,false);
                res.add(curLine);
         }                  
        return res;
       }          
  
       public String justifyString(String s,int L, boolean isLastLine){
            String reg = "\\s+";
 	    String[] last = s.split(reg);
            if(!isLastLine){
                int len = 0;
                for(String str : last)
                   len += str.length();
                           
               int space = L-len;
               int slots = last.length-1;
               int remain = 0;
               int even = space;
            if(slots!=0){
                 remain = space % slots;
                 even = space / slots;
             }
            
            StringBuilder refined = new StringBuilder();
            for(String str : last){
                 if(space>0){
                    str += generateSpaces(even);
                    space -= even;                   
                    if(remain>0){
                        str += " ";
                        remain--;
                        space--;
                    }
                }
                refined.append(str);
            }           
            return refined.toString();            
        }
        else{	       
	       StringBuilder refineLast = new StringBuilder();
	       refineLast.append(last[0]);
	            
	       for(int i=1;i<last.length;i++){
	         	refineLast.append(" ");
	            refineLast.append(last[i]);
            }
	       
           String res = refineLast.toString();
	       int space = L-res.length();
	       res += generateSpaces(space);
	            
	       return res;
        }
    }
       
    public String generateSpaces(int length){      
        if(length<1)
             return "";
        StringBuilder res = new StringBuilder();
        while(length>0){
            res.append(" ");
            length--;
        }
        return res.toString();
    }

    public static void main(String args[])
    {
        TextJustification obj = new TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> res = obj.fullJustify(words,16);
        System.out.println("[");
        for(String e:res)
            System.out.println("\""+e+"\"");
        System.out.println("]");
    }
}