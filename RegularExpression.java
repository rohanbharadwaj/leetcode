public class RegularExpression{
	public static boolean isMatch(String s, String p) {
    int lens = s.length();
    int lenp = p.length();
    if (lens == 0 && lenp == 0) return true;

    boolean[] last = new boolean[lenp + 1]; //last[j] means if p[1~j] matches s[1~i-1]
    boolean[] cur = new boolean[lenp + 1]; //last[j] means if p[1~j] matches s[1~i]
    last[0] = cur[0] = true;
    // for string like "a*b*c*", make last/cur[indexOf('*')]=true.
    for (int j = 1; j <= lenp; j++) {
        if (j >= 2 && p.charAt(j - 1) == '*' && last[j - 2]) {
            last[j] = cur[j] = true;
        }
    }

    for (int i = 1; i <= lens; i++) {
        // determine if p[1~j] matches s[1~i].
        cur[0] = false;
        for (int j = 1; j <= lenp; j++) {
            // three cases: 
            // 1) p[j]==s[i] (include p[j]=='.') and p[1~j-1] matches s[1~i-1];
            // 2) p[j-1~j]="x*" and s[i]='x' and p[1~j] matches s[1~i-1];
            // 3) p[j-2~j]="xy*" and p[1~j-2] matches s[1~i].
            cur[j] = (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.') && last[j - 1]
                    || p.charAt(j - 1) == '*' && (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.') && last[j]
                    || j >= 2 && p.charAt(j - 1) == '*' && cur[j - 2];
        }
        for (int j = 0; j <= lenp; j++) {
            last[j] = cur[j];
        }
    }

    return cur[lenp];
}
public static void main(String args[])
{

}

}