package Chalange;

import java.util.HashMap;

public class LongestSubstringRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(solution("abcabcde"));
    }

    static int solution(String s) {
        int maxLength = 0;
        int left = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
