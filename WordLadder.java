public class WordLadder {
    public int ladderLength(String start, String end, Set<String> dict) {
        if (start == null || end == null) return 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(start);
        queue.add(null);
        visited.add(start);
        int len = 1;
        while (true) {
            String str = queue.remove();
            if (str == null) {
                if (queue.isEmpty()) {
                    return 0;
                }
                queue.add(null);
                len++;
                continue;
            } else if (str.equals(end)) {
                return len;
            }
            for (int i = 0; i < str.length(); i++) {
                char[] charArray = str.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) { 
                    charArray[i] = c;
                    String newStr = new String(charArray);
                    if (dict.contains(newStr) && !visited.contains(newStr)) {
                        queue.add(newStr);
                        visited.add(newStr);
                    }
                }
            }
        }
   