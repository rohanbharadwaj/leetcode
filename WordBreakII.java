import java.util.*;
public class WordBreakII {
    public static List<String> wordBreak(String s, Set<String> dict) {
        List<String> lst = new ArrayList<String>();
        StringBuilder res = new StringBuilder("");
        if(dict.size()==0) return lst;
        for(String e:dict)
        {
//                                System.out.print("in out loop");
            if(s.contains(e))
                {
                    // System.out.print("in loop");
                    res.append(e).append(" ");
                    lst.add(res.toString());
                }    
        }        
        
        return lst;
    }
     public static void main(String args[])
    {
        String s = s = "catsanddog";
        List<String> lst = new ArrayList<String>();
        Set<String> dict = new HashSet<String>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        lst = wordBreak(s,dict);
        for(String a:lst)
        System.out.print(a);
    }
}