/*
LongestPalindromeDP
Time : O(N^2)
Space : O(N^2)
*/
public class LongestPalindromeDP{
	public String longestPalindromeDP(String str)
	{
	int n = str.length();
	int longestBegin = 0;
	int maxLen = 1;
	char[] s = str.toCharArray();
	boolean[][] table = new boolean[1000][1000];
	for (int i=0;i<n;i++)
	{
		table[i][i] = true;
	}
	for(int i=0;i<n-1;i++)
	{
		if(s[i]==s[i+1])
		{
			table[i][i+1]= true;
			longestBegin = i;
			maxLen = 2;
		}
	}
	for (int len=3;len<=n;len++)
	{
		for(int i=0;i<n-len+1;i++)
		{
		int j = i+len-1;
		if(s[i]==s[j] && table[i+1][j-1]){
			table[i][j] = true;	
			longestBegin = i;
			maxLen = len;
		}
		}
	}
	// System.out.println(longestBegin);
	// System.out.println(maxLen);
	int endIndex = longestBegin+maxLen;
	return str.substring(longestBegin,endIndex);
	}

	public static void main(String args[])
	{
		LongestPalindromeDP obj = new LongestPalindromeDP();
		String res = obj.longestPalindromeDP("abcba");
		System.out.println(res);
	}
}