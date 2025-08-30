package String.Basics;

import java.util.HashSet;
import java.util.Set;

public class substring {

    // public static long countValidSubstrings(String S, int minLength, int maxLength) {

    //     int n = S.length();
    //     int c = 0;

    //     for (int i = 0; i < n; i++) {
    //         Set<Character> visited = new HashSet<>();
    //         boolean okay = true;
    //         for (int j = i; j < n && (j - i + 1) <= maxLength; j++) {
    //             char current = S.charAt(j);
    //             if (j > i && S.charAt(j - 1) == current) {
    //                 if (j > i && S.charAt(j - 1) == current) {
    //                     okay = false;
    //                     break;
    //                 }
    //                 visited.add(current);
    //             }
    //             if (j - i + 1 >= minLength && okay) {
    //                 c++;
    //             }
    //         }
    //     }
    //     return c;
    // }

    public static long countValidSubstrings(String S, int minLength, int maxLength) {
        int n = S.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int currentLength = 0;
            boolean isValid = true;

            for (int j = i; j < n && currentLength < maxLength; j++) {
                currentLength++;

                if (j > i && S.charAt(j) == S.charAt(j - 1)) {
                    isValid = false;
                    break;
                }

                if (currentLength >= minLength && isValid) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countValidSubstrings("110", 1, 3));
    }
}
