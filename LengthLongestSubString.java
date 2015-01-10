import java.util.*;
public class LengthLongestSubString{
public static int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> chToIdx = new HashMap<>();
    int maxLength = 0, minIdx = 0;
    for (int i = 0; i < s.length(); i++) {
        if (chToIdx.containsKey(s.charAt(i))) 
            minIdx = Math.max(chToIdx.get(s.charAt(i)) + 1, minIdx);
        maxLength = Math.max(maxLength, i - minIdx + 1);
        chToIdx.put(s.charAt(i), i);
    }
    return maxLength;
}

public static void main(String args[])
{

	System.out.println(lengthOfLongestSubstring("rohan"));
	System.out.println(lengthOfLongestSubstring("abacabad"));

}
}