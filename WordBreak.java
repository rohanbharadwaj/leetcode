import java.util.*;
public class WordBreak {
    public static boolean wordBreak(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length()+1];
        t[0] = true; //set first to be true, why?
        //Because we need initial state
 
        for(int i=0; i<s.length(); i++){
            //should continue from match position
            if(!t[i]) 
                continue;
 
            for(String a: dict){
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;
 
                if(t[end]) continue;
 
                if(s.substring(i, end).equals(a)){
                    t[end] = true;
                }
            }
        }
 
        return t[s.length()];
    }

    public static void main(String args[])
    {
        Set<String> s = new HashSet<String>();
        s.add("programcree");
        s.add("progra");
        s.add("creek");
        boolean result = wordBreak("programcreek",s);
        System.out.println(result);
    }
}