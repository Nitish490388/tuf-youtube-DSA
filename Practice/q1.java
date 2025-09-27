
package Practice;

import java.util.HashMap;
public class q1 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(findLength(s));
    }

    static int findLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int n = 0, left = 0;

        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                 left= Math.max(left, map.get(c)+1);
            } 
                map.put(c, i);
                n = Math.max(n, i-left+1);
        }
        return n;
    }
}

// 