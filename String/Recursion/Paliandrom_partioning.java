
package String.Recursion;
import java.util.*;


class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0, s, path, res);
        return res;
    }

    void func(int index, String s, List<String> path, List<List<String>> res) {
        if(index == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i<s.length(); ++i) {
            if(isPaliandrome(s, index, i)) {
                path.add(s.substring(index, i+1));
                func(i+1, s, path, res);
            path.remove(path.size()-1);
            }
            
        }
    }

    boolean isPaliandrome(String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start++) != s.charAt(end--))
            return false;
        }
        return true;
    }
}

public class Paliandrom_partioning {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<String>> ans = sol.partition("aba");
        for(List<String> s: ans) {
            System.out.println(s.toString());
        }
    }
}
