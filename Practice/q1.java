// ❓ Question 2 (Medium – Array/String)

// Problem:
// You are given a string s. Find the length of the longest substring without repeating characters.

// Examples:

// Input: s = "abcabcbb" → Output: 3 (longest substring = "abc")

// Input: s = "bbbbb" → Output: 1 (longest substring = "b")

// Input: s = "pwwkew" → Output: 3 (longest substring = "wke")

// 📌 Constraints:

// 0 ≤ s.length ≤ 10⁵

// You must achieve better than O(n²).


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