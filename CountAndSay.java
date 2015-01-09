/****
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

Runtime : O(m*n) where m is the length of string at each step.

**/

public class CountAndSay {
    public String countAndSay(int n) {
         String prev = "1";
        for (int i=1; i<n; i++) {
            StringBuffer strBuf = new StringBuffer();
            int count = 0;
            for (int j=0; j<prev.length(); j++) {
                if (j == 0 || prev.charAt(j) == prev.charAt(j-1)) {
                    count++;
                } else {
                    strBuf.append(String.valueOf(count));
                    strBuf.append(prev.charAt(j-1));
                    count=1;
                }
            }
            strBuf.append(String.valueOf(count));
            strBuf.append(prev.charAt(prev.length()-1));
            prev = strBuf.toString();
        }
        return prev;
    }
}